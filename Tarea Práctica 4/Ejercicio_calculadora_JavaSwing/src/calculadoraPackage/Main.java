 
package calculadoraPackage;
import java.util.Scanner;
public class CalculadoraServicio{

  
    //Operaciones Aritméticas
    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Error: No es posible dividir entre cero.");
        }
        return a / b;
    }

    //Operaciones Avanzadas 
    public static double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public static double raizCuadrada(double numero) {
        if (numero < 0) {
            throw new ArithmeticException("Error: No se puede calcular la raíz cuadrada de un número negativo en R.");
        }
        return Math.sqrt(numero);
    }

    // Conversiones de Temperatura
    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * (5.0 / 9.0);
    }

    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * (9.0 / 5.0)) + 32.0;
    }
}

 class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = -1;

        while (opcion != 0) {
            mostrarMenu();
            System.out.print("Seleccione una opcion: ");
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                procesarOpcion(opcion);
            } else {
                System.out.println("⚠️ Entrada invalida. Por favor, ingrese un numero entero.");
                scanner.next(); // Limpiar la entrada incorrecta
            }
            System.out.println();
        }
    }

    private static void mostrarMenu() {
        System.out.println("==========================================");
        System.out.println("   CALCULADORA EXTENDIDA y CONVERSOR DE TEMPERATURA");
        System.out.println("==========================================");
        System.out.println("--- MODO CALCULADORA ---");
        System.out.println("1. Suma (+)");
        System.out.println("2. Resta (-)");
        System.out.println("3. Multiplicacion (×)");
        System.out.println("4. Division (÷)");
        System.out.println("5. Potencia (x^y)");
        System.out.println("6. Raiz Cuadrada (√x)");
        System.out.println("--- MODO CONVERSOR DE TEMPERATURA ---");
        System.out.println("7. Fahrenheit (°F) a Celsius (°C)");
        System.out.println("8. Celsius (°C) a Fahrenheit (°F)");
        System.out.println("0. Salir");
        System.out.println("==========================================");
    }

    private static void procesarOpcion(int opcion) {
        try {
            switch (opcion) {
                case 1 -> {
                    double[] nums = pedirDosNumeros();
                    System.out.printf("Resultado: %.2f + %.2f = %.4f%n", nums[0], nums[1], CalculadoraServicio.sumar(nums[0], nums[1]));
                }
                case 2 -> {
                    double[] nums = pedirDosNumeros();
                    System.out.printf("Resultado: %.2f - %.2f = %.4f%n", nums[0], nums[1], CalculadoraServicio.restar(nums[0], nums[1]));
                }
                case 3 -> {
                    double[] nums = pedirDosNumeros();
                    System.out.printf("Resultado: %.2f × %.2f = %.4f%n", nums[0], nums[1], CalculadoraServicio.multiplicar(nums[0], nums[1]));
                }
                case 4 -> {
                    double[] nums = pedirDosNumeros();
                    System.out.printf("Resultado: %.2f ÷ %.2f = %.4f%n", nums[0], nums[1], CalculadoraServicio.dividir(nums[0], nums[1]));
                }
                case 5 -> {
                    System.out.print("Ingrese la base: ");
                    double base = pedirNumero();
                    System.out.print("Ingrese el exponente: ");
                    double exp = pedirNumero();
                    System.out.printf("Resultado: %.2f ^ %.2f = %.4f%n", base, exp, CalculadoraServicio.potencia(base, exp));
                }
                case 6 -> {
                    System.out.print("Ingrese el numero: ");
                    double num = pedirNumero();
                    System.out.printf("Resultado: √%.2f = %.4f%n", num, CalculadoraServicio.raizCuadrada(num));
                }
                case 7 -> {
                    System.out.print("Ingrese los grados Fahrenheit (°F): ");
                    double f = pedirNumero();
                    System.out.printf("Resultado: %.2f °F = %.2f °C%n", f, CalculadoraServicio.fahrenheitACelsius(f));
                }
                case 8 -> {
                    System.out.print("Ingrese los grados Celsius (°C): ");
                    double c = pedirNumero();
                    System.out.printf("Resultado: %.2f °C = %.2f °F%n", c, CalculadoraServicio.celsiusAFahrenheit(c));
                }
                case 0 -> System.out.println("¡Gracias por usar el programa!");
                default -> System.out.println("Opcion no valida. Elija un numero entre 0 y 8.");
            }
        } catch (ArithmeticException e) {
            System.out.println("!!" + e.getMessage());
        }
    }

    private static double pedirNumero() {
        while (!scanner.hasNextDouble()) {
            System.out.print("Valor invalido. Ingrese un numero numerico: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    private static double[] pedirDosNumeros() {
        System.out.print("Ingrese el primer numero: ");
        double a = pedirNumero();
        System.out.print("Ingrese el segundo numero: ");
        double b = pedirNumero();
        return new double[]{a, b};
    }
}