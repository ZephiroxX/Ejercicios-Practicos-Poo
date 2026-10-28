package shapePackage;

public class Figura {

    private String nombre;
    private double radio;
    private double lado;
    private double base;
    private double altura;
    private double area;
    private String tipo;
    private static final double PI = 3.1416;
    private static int contador;
   
    public Figura(String nombre) {
        this.nombre = nombre;
        contador++;
    }

    public Figura(String nombre, double radio) {
        this(nombre);
        this.radio = radio;
        this.area = PI * radio * radio;
    }
    
    public Figura (String nombre, double base, double altura)
    {
        this(nombre);
        this.base = base;
        this.altura = altura;
        this.area =  base * altura;
    }
    
    
    public Figura(String nombre, double lado, String tipo)
    {
        this(nombre);
        this.lado =  lado;
        this.tipo = tipo;
        this.area = lado * lado;
    
    }

    public double getArea() {
        return area;
    }

    public static int getContador() {
        return contador;
    }



    
    
}
