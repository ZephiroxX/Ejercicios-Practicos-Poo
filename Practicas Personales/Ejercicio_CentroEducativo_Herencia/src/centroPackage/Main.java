//Ejercicio 1. Registro de personas
//
//⭐⭐
//
//Conceptos: extends, atributos privados, constructores y super().
//
//Un centro educativo necesita registrar estudiantes y profesores. Ambos comparten información personal, pero cada uno tiene datos específicos.
//
//Requisitos
//1. Crea una clase Persona con los atributos privados nombre, apellido y edad.
//2. Crea las clases Estudiante y Profesor, heredadas de Persona.
//3. Estudiante tendrá matricula y curso.
//4. Profesor tendrá codigoEmpleado y salario.
//5. Implementa constructores para inicializar los atributos de cada clase.
//6. Utiliza un método mostrarInformacion() para presentar los datos.
//7. Crea dos estudiantes y dos profesores y muestra sus datos.
//Restricciones: no repitas los atributos comunes en las clases hijas. Mantén los atributos encapsulados y utiliza el constructor de la superclase cuando corresponda.
//
//Preguntas orientadoras
//- ¿Qué atributos pertenecen realmente a Persona?
//- ¿Por qué el constructor de una clase hija debe inicializar también la parte heredada del objeto?
//- ¿Cómo puedes reutilizar el código de la clase padre sin duplicarlo?


package centroPackage;

public class Main {

    public static void main(String[] args) {

        Estudiante e1 = new Estudiante("Alejandro", "Martinez", 19, 234565, "Maria lejandra");
        Estudiante e2 = new Estudiante("John", "Jimenez", 23, 32323232, "Jose Alberto");

        Profesor p1 = new Profesor("Jose", "Martinez", 34, 23232323, 20000);
        Profesor p2 = new Profesor("Maria", "Jimenez", 50, 2323232, 20000);

        System.out.println("Estudiante 1");

        e1.mostrarInformacion();

        System.out.println("\nEstudiante 2");

        e2.mostrarInformacion();

        System.out.println("\nProfesor 1");

        p1.mostrarInformacion();

        System.out.println("\nProfesor 2");

        p2.mostrarInformacion();

    }

}
