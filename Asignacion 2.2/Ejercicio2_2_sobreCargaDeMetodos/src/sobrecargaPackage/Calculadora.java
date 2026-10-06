package sobrecargaPackage;

public class Calculadora {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double division(int a, int b) {
        return a / b;
    }

    
//Sobrecarga de metodos (" 3 ")
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public int restar(int a, int b, int c) {
        return a - b - c;
    }

    public int multiplicar(int a, int b, int c) {
        return a * b * c;
    }

    
//Sobrecarga de metodos (" 4 ")
    public int sumar(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public int restar(int a, int b, int c, int d) {
        return a - b - c - d;
    }

    public int multiplicar(int a, int b, int c, int d) {
        return a * b * c * d;
    }

}
