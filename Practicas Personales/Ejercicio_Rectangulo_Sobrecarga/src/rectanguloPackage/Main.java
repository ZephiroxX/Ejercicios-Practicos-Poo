package rectanguloPackage;

public class Main {

    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo();
        Rectangulo r2 = new Rectangulo(3);
        Rectangulo r3 = new Rectangulo(10, 30);

        
        System.out.println("Rectangulo 1: "+r1.calcularArea());
        System.out.println("\nRectangulo 2: "+r2.calcularArea());
        System.out.println("\nRectangulo 3: "+r3.calcularArea());
       

    }

}
