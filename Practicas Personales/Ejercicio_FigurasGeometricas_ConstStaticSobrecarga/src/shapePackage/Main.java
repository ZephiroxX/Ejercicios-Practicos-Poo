package shapePackage;

public class Main {

    public static void main(String[] args) {

        Figura f1 = new Figura("Circulo", 20);
        Figura f2 = new Figura("Rectangulo", 25.8, 18.5);
        Figura f3 = new Figura("figura3", 4, "Cuadrado");
        Figura f4 = new Figura("Circulo", 34.5);

        System.out.println("Area del circulo: " + f1.getArea());
        System.out.println("Area del  segundo circulo: " + f4.getArea());
        System.out.println("Area del rectangulo: " + f2.getArea());
        System.out.println("Area del cuadrado: " + f3.getArea());

        System.out.println("\nLa cantidad de figuras creadas fue: " + Figura.getContador());
    }

}
