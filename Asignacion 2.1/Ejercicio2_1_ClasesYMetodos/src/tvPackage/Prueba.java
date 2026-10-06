package tvPackage;

public class Prueba {

    public static void main(String[] args) {

        Tv televisor1 = new Tv("Led", 50, 30);

        System.out.println("=== Tv 1 ===");

        System.out.println("Marca: " + televisor1.getMarca());
        System.out.println("Pulgadas: " + televisor1.getPulgadas());
        System.out.println("Volumen: " + televisor1.getVolumen());

        televisor1.encendido();
        televisor1.subirVolumen();
        televisor1.bajarVolumen();
        televisor1.apagar();

        System.out.println("");

        Tv televisor2 = new Tv("Samsung", 60, 70);

        System.out.println("=== Tv 2 ===");

        System.out.println("Marca: " + televisor2.getMarca());
        System.out.println("Pulgadas: " + televisor2.getPulgadas());
        System.out.println("Volumen: " + televisor2.getVolumen());

        televisor2.encendido();
        televisor2.subirVolumen();
        televisor2.bajarVolumen();
        televisor2.apagar();

        System.out.println("");

        Tv televisor3 = new Tv("TCL", 70, 40);

        System.out.println("=== Tv 3 ===");

        System.out.println("Marca: " + televisor3.getMarca());
        System.out.println("Pulgadas: " + televisor3.getPulgadas());
        System.out.println("Volumen: " + televisor3.getVolumen());

        televisor3.encendido();
        televisor3.subirVolumen();
        televisor3.bajarVolumen();
        televisor3.apagar();
        

    }

}
