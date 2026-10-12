//Clase CuentaBancaria
//Fácil–intermedio
//Crea una clase CuentaBancaria con los atributos titular, numeroCuenta y saldo.
//Define constructores para crear una cuenta con:
//- Solo el titular.
//- El titular y el número de cuenta.
//- El titular, el número de cuenta y un saldo inicial.
//Añade un método para mostrar el saldo.
//Pista: ¿qué saldo inicial debería tener una cuenta si no se especifica ninguno?
package bankPackage;

public class CuentaBancaria {

    private String titular;
    private int numeroDeCuenta;
    private double saldo;

    public CuentaBancaria(String titular) {
        this.titular = titular;
    }

    public CuentaBancaria(String titular, int numeroDeCuenta) {
        this(titular);
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public CuentaBancaria(String titular, int numeroDeCuenta, double saldo) {
        this(titular, numeroDeCuenta);
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void mostrarDetalles() {
        System.out.println("Titular " + getTitular());
        System.out.println("Numero de cuenta " + getNumeroDeCuenta());
        System.out.println("Saldo " + getSaldo());
    }

}
