package figuraPackage;

public class Circulo extends Figura {

    private double radio;
    private static final double PI = 3.1416;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return PI * radio * radio;
    }

    @Override
   public void mostrarNombre()
   {
       super.mostrarNombre();
   }
   
}
