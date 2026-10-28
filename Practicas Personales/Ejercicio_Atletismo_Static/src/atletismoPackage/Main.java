package atletismoPackage;

import java.util.Scanner;

public class Main {

    public static int menorTiempo(Atleta atleta[]) {     //Metodo static que devuelve el indice de el atleta con menor tiempo
        int indice = 0;
        
        double tiempo = atleta[0].getTiempoCarrera();
        for (int i = 1; i < atleta.length; i++) {
            if (atleta[i].getTiempoCarrera() < tiempo) {
                tiempo = atleta[i].getTiempoCarrera();
                indice = i;
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre;
        int numero,menorTiempo;
        double tiempoCarrera;

        System.out.println("Ingrese la cantidad de atletas");
        int cantidadAtletas = input.nextInt();

        Atleta atletas[] = new Atleta[cantidadAtletas];

        for (int i = 0; i < atletas.length; i++) { //Introduccion de datos
            input.nextLine();
            System.out.println("\nDigite los datos del atleta " + (i + 1) + ":");

            System.out.print("Nombre: ");
            nombre = input.nextLine();
            System.out.print("Numero: ");
            numero = input.nextInt();
            System.out.print("Tiempo de carrera: ");
            tiempoCarrera = input.nextDouble();

            atletas[i] = new Atleta(nombre, numero, tiempoCarrera);
            

        }
        
        menorTiempo = menorTiempo(atletas);
        
        System.out.println("\nLos datos del atleta con el menor tiempo son: ");  //Salida de datos
        System.out.println(atletas[menorTiempo].mostrarDatos()); //
        
    }

}
