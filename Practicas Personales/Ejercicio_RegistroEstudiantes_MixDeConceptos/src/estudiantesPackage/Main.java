//Ejercicio 2 — Registro de estudiantes ⭐⭐⭐
//Construir un programa para gestionar los estudiantes de un centro educativo.
// Cada estudiante estará caracterizado por su matrícula, nombre, edad y calificación final. 
// Al terminar el registro, el programa debe mostrar los datos de cada estudiante e indicar si aprobó o reprobó.
//
//Requisitos:
//1. Crear una clase Estudiante con atributos privados.
//2. Implementar constructores sobrecargados para registrar estudiantes con diferentes datos iniciales.
//3. Crear métodos sobrecargados para registrar o actualizar la calificación, permitiendo recibir diferentes cantidades de calificaciones.
//4. Utilizar una constante para establecer la calificación mínima de aprobación.
//5. Utilizar un contador static para registrar cuántos estudiantes se han creado.
//6. Sobrescribir toString() para presentar los datos de cada estudiante.
//7. Crear una clase Main que permita registrar varios estudiantes y mostrar sus resultados.
//
package estudiantesPackage;

import java.util.Scanner;

public class Main {

  

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nombre;
        int edad;
        int matricula;
        double calificacion;
        double calificacion2;
        double promedio = 0;

        System.out.println("Digite el numero de estudiantes");
        int nEstudiantes = input.nextInt();

        Estudiante e1[] = new Estudiante[nEstudiantes];

        for (int i = 0; i < e1.length; i++) {
            input.nextLine();
            System.out.println("\nDigite los datos del estudiante: " + (i + 1) + ":");
            System.out.print("Nombre: ");
            nombre = input.nextLine();
            System.out.print("Edad: ");
            edad = input.nextInt();
            System.out.print("Matricula: ");
            matricula = input.nextInt();
            System.out.print("Calificacion: ");
            calificacion = input.nextDouble();
            System.out.print("Calificacion 2: ");
            calificacion2 = input.nextDouble();

            e1[i] = new Estudiante(nombre, edad, matricula, calificacion, calificacion2);
        }


        for (int i = 0; i < e1.length; i++) {
            System.out.println("\nDatos de los estudiantes: " + (i + 1));
            e1[i].datosDelEstudiante();

        }

        System.out.println("\nLa cantidad de estudiantes creados fue: " + Estudiante.getContador());

    }

}
