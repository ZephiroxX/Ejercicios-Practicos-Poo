package exportadorPackage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean activo = false;
        String entrada;
        boolean entradaValida = false;
        boolean confirmacion = true;
        int opcion;
        int cantidadArchivos;
        String nombreArchivo;
        int cantidadHojas;
        char separador;

        do {
            System.out.println("== Menu de exportacion de Archivos ==");
            System.out.println("\nEliga una opcion:");
            System.out.println("\n0. Salir");
            System.out.println("1. Exportador PDF");
            System.out.println("2. Exportador Excel");
            System.out.println("3. Exportador CSV");
            opcion = input.nextInt();

            switch (opcion) {

                case 0:
                    System.out.println("Saliendo....");
                    activo = true;
                    break;

                case 1:
                    System.out.println("\nDigite la cantidad de archivos pdf que desea exportar");
                    cantidadArchivos = input.nextInt();

                    ExportadorPDF pdfs[] = new ExportadorPDF[cantidadArchivos];
                    for (int i = 0; i < pdfs.length; i++) {
                        input.nextLine();
                        System.out.print("Nombre: ");
                        nombreArchivo = input.nextLine();

                        while (!entradaValida) {
                            System.out.print("Desea incluir imagenes si/no: ");
                            entrada = input.nextLine().trim().toLowerCase();

                            if (entrada.equals("si")) {
                                confirmacion = true;
                                entradaValida = true;
                            } else if (entrada.equals("no")) {
                                confirmacion = false;
                                entradaValida = true;

                            } else {
                                System.out.println("Error: Solo puede ingresar 'si' o 'no' ");
                            }

                        }
                        entradaValida = false;
                        pdfs[i] = new ExportadorPDF(nombreArchivo, confirmacion);

                    }

                    System.out.println("\nArchivos PDF");
                    for (int j = 0; j < pdfs.length; j++) {
                        pdfs[j].exportar();
                        pdfs[j].mostrarArchivo();
                        System.out.println(" ");
                    }
                    break;
                case 2:
                    System.out.println("\nDigite la cantidad de archivos excel que desea exportar");
                    cantidadArchivos = input.nextInt();

                    ExportadorExcel excels[] = new ExportadorExcel[cantidadArchivos];

                    for (int i = 0; i < excels.length; i++) {
                        input.nextLine();
                        System.out.print("Nombre: ");
                        nombreArchivo = input.nextLine();

                        System.out.print("Cantidad de hojas: ");
                        cantidadHojas = input.nextInt();

                        excels[i] = new ExportadorExcel(nombreArchivo, cantidadHojas);
                    }

                    System.out.println("\nArchivos Excel");

                    for (int j = 0; j < excels.length; j++) {
                        excels[j].exportar();
                        excels[j].mostrarArchivo();
                        System.out.println(" ");
                    }

                    break;

                case 3:
                    System.out.println("\nDigite la cantidad de archivos CSV que desea exportar");
                    cantidadArchivos = input.nextInt();

                    ExportadorCSV csvs[] = new ExportadorCSV[cantidadArchivos];

                    for (int i = 0; i < csvs.length; i++) {
                        input.nextLine();
                        System.out.print("Nombre: ");
                        nombreArchivo = input.nextLine();

                        System.out.print("Separador: ");
                        separador = input.next().charAt(0);

                        csvs[i] = new ExportadorCSV(nombreArchivo, separador);
                    }

                    System.out.println("\nArchivos CSVS");

                    for (int j = 0; j < csvs.length; j++) {
                        csvs[j].exportar();
                        csvs[j].mostrarArchivo();
                        System.out.println(" ");
                    }
                    break;
                default:
                System.out.println("Error: Opcion no valida");
                    break;
            }
        } while (!activo);

        input.close();

    }

}
