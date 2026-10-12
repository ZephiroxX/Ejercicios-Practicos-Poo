package bankPackage;

public class Main {

    public static void main(String[] args) {

        CuentaBancaria c1 = new CuentaBancaria("Wilkin");
        CuentaBancaria c2 = new CuentaBancaria("winston",25295);
        CuentaBancaria c3 = new CuentaBancaria("Wilson", 302040,100000);
        
        c1.getSaldo();
        
    }

}
