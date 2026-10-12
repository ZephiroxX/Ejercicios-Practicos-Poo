//🏗️ Estructura de la Clase
//1. Nombre de la Clase
//
//
//CalculadoraMatematica
//2. Atributos Privados
//Dos números de tipo double
//private double numero1;
//private double numero2;
//3. Métodos Requeridos
//Constructor por defecto
//Método para establecer números (setters o método único)
//Métodos de operaciones matemáticas:
//Suma
//Resta
//Multiplicación
//División (con manejo de división por cero mediante condicional IF)
package calculadoraPackage;

public class Calculadora {

    private int num1;
    private int num2;

    public Calculadora() {

    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int suma() {

        return num1 + num2;

    }

    public int resta() {
        return num1 - num2;
    }

    public int multiplicacion() {
        return num1 * num2;

    }

    public double division() {
        if (num2 == 0) {
            System.out.println("Error: No se puede hacer division por 0");
            return 0;
        }
        return num1 / num2;

    }

}
