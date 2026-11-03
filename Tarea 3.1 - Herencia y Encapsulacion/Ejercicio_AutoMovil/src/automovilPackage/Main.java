
package automovilPackage;

public class Main {


    public static void main(String[] args) {
        Automovil Bmw = new Automovil();
        
        Bmw.setMarca("BMW");
        Bmw.setModelo("M4 Competition");
        Bmw.setColor("Negro");
        Bmw.setAno(2027);
        
        System.out.println("\nMarca: "+Bmw.getMarca());
        Bmw.encender();
        Bmw.apagar();
        
        
        
        System.out.println("\n--- Honda Civic ---");
        HondaCivic honda = new HondaCivic();
        
        honda.setMarca("Honda");
        honda.setModelo("Ex");
        honda.setColor("Negro");
        honda.setAno(2020);
        
        System.out.println("\nMarca: "+honda.getMarca());
        honda.acelerar();
        honda.frenar();
        
    }

}
