package devicePackage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String marca;
        String modelo;
        double precio;
        String tipoRed;
        String tipoConector;
        int pulgadas;
        String tipo;
        int cantidadObjetos;

        System.out.println("Digite la cantidad de dispositivos");
        cantidadObjetos = input.nextInt();

        Telefono telefonos[] = new Telefono[cantidadObjetos];
        Tableta tabletas[] = new Tableta[cantidadObjetos];
        Computadora computadoras[] = new Computadora[cantidadObjetos];

        for (int i = 0; i < telefonos.length; i++) {
            input.nextLine();
            System.out.println("\nDigite las especificaciones del telefono: " + (i + 1));

            System.out.print("Marca: ");
            marca = input.nextLine();
            System.out.print("Modelo: ");
            modelo = input.nextLine();
            System.out.print("Tipo de red: ");
            tipoRed = input.nextLine();
            System.out.print("Tipo de conector: ");
            tipoConector = input.nextLine();

            System.out.print("Precio: ");
            precio = input.nextDouble();

            telefonos[i] = new Telefono(marca, modelo, precio, tipoConector, tipoRed);
        }

        for (int j = 0; j < tabletas.length; j++) {
            input.nextLine();
            System.out.println("\nDigite las especificaciones de la tableta: " + (j + 1));

            System.out.print("Marca: ");
            marca = input.nextLine();
            System.out.print("Modelo: ");
            modelo = input.nextLine();
            System.out.print("Precio: ");
            precio = input.nextDouble();
            System.out.print("Pulgadas: ");
            pulgadas = input.nextInt();

            tabletas[j] = new Tableta(marca, modelo, precio, pulgadas);

        }

        for (int k = 0; k < computadoras.length; k++) {
            input.nextLine();
            System.out.println("\nDigite las especificaciones de las computadoras: " + (k + 1));

            System.out.print("Marca: ");
            marca = input.nextLine();
            System.out.print("Modelo: ");
            modelo = input.nextLine();
            System.out.print("Precio: ");
            precio = input.nextDouble();

            input.nextLine();

            System.out.print("Tipo de computadora");
            tipo = input.nextLine();

            computadoras[k] = new Computadora(marca, modelo, precio, tipo);

        }

        for (int i = 0; i < cantidadObjetos; i++) {
            System.out.println("Telefonos");
            telefonos[i].mostrarInformacion();
            System.out.println("\nTabletas");
            tabletas[i].mostrarInformacion();
            System.out.println("\nComputadoras");
            computadoras[i].mostrarInformacion();
        }

    }

}
