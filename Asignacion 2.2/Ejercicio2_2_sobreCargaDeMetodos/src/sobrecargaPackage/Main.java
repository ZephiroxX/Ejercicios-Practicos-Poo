package sobrecargaPackage;

public class Main {

    public static void main(String[] args) {
        Calculadora calculator1 = new Calculadora();

        System.out.println("Metodos (2 parametros)");

        System.out.println("Suma: " + calculator1.sumar(4, 5));
        System.out.println("resta: " + calculator1.restar(10,5 ));
        System.out.println("Multiplicacion " + calculator1.multiplicar(10, 10));
        System.out.println("Division " + calculator1.division(15, 3));

        System.out.println("\nMetodos (3 parametros)");

        System.out.println("Suma: " + calculator1.sumar(4, 5, 7));
        System.out.println("resta: " + calculator1.restar(30, 25, 8));
        System.out.println("Multiplicacion " + calculator1.multiplicar(10, 10, 15));

        System.out.println("\nMetodos (4 parametros)");

        System.out.println("Suma: " + calculator1.sumar(4, 5, 7, 89));
        System.out.println("resta: " + calculator1.restar(20, 10, 8, 5));
        System.out.println("Multiplicacion " + calculator1.multiplicar(10, 10, 15, 35));

    }

}
