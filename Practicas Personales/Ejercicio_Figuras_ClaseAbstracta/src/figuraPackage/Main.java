package figuraPackage;

public class Main {

    public static void main(String[] args) {

        Circulo c1 = new Circulo("Circulo 1", 20);
        Rectangulo r1 = new Rectangulo("Rectangulo 1", 5, 10);
        Triangulo t1 = new Triangulo("Triagulo 1", 10, 20);

        System.out.println("== Circulo ==");
        c1.mostrarNombre();
        System.out.println("Area: " + c1.calcularArea());

        System.out.println("\n== Rectangulo ==");
        r1.mostrarNombre();
        System.out.println("Area: " + r1.calcularArea());

        System.out.println("\n== Triangulo ==");
        t1.mostrarNombre();
        System.out.println("Area: " + t1.calcularArea());
        
        
    }

}
