//Ejercicio 9 — Cuenta bancaria
//
//
//Intermedio
//Utiliza tus conocimientos de CuentaBancaria. Define una constante para el saldo mínimo permitido y un contador estático de cuentas creadas.
//- Mantén los tres constructores.
//- No repitas inicializaciones.
//- Comprueba que cada cuenta tenga su propio saldo, pero que el contador sea compartido.
package bankPackage;

public class CuentaBancaria {

    private String titular;
    private int numeroDeCuenta;
    private double saldo;
    private static final double saldoMinimo = 100;
    private static int contador;

    public CuentaBancaria(String titular) {
        this.titular = titular;
        contador++;
    }

    public CuentaBancaria(String titular, int numeroDeCuenta) {
        this(titular);
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public CuentaBancaria(String titular, int numeroDeCuenta, double saldo) {
        this(titular, numeroDeCuenta);
        this.saldo = saldo;

    }

    public static int getContador() {
        return contador;
    }

    
   
   public void getSaldo()
   {
       if(saldo >= saldoMinimo)
       {
           System.out.println("Su saldo es: "+saldo);
       }
       else
       {
           System.out.println("Error: saldo invalido");
       }
   }
}
