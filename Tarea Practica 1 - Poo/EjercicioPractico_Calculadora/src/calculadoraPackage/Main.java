package calculadoraPackage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean estaActivo = true;
        int opcion;

        Calculadora c1 = new Calculadora();

        c1.setNum1(0);
        c1.setNum2(4);

        do {
            System.out.println("Eliga una opcion");
            System.out.println("0.Salir");
            System.out.println("1.Suma");
            System.out.println("2.Resta");
            System.out.println("3.Multiplicacion");
            System.out.println("4.Division");
            opcion = input.nextInt();

            switch (opcion) {

                case 0:
                    System.out.println("Saliendo.....");
                    estaActivo = false;
                    break;

                case 1:
                    System.out.println("La suma es: " + c1.suma());
                    break;
                case 2:

                    System.out.println("La resta es: " + c1.resta());
                    break;
                case 3:
                    System.out.println("La multiplicacion es: " + c1.multiplicacion());
                    break;
                case 4:

                    System.out.println("La division es: " + c1.division());
                    break;

                default:
                    System.out.println("Error: Opcion no valido");
                    break;
            }

        } while (estaActivo);

    }

}
