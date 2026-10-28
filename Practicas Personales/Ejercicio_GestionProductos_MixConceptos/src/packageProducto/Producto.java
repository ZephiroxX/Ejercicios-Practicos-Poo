package packageProducto;

public class Producto {

    private String nombre;
    private int codigo;
    private double precio;
    private int cantidadDisponible;
    private static int contador;
    private static final double ITBIS = 0.18;

    public Producto(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        contador++;
    }

    public Producto(String nombre, int codigo, double precio) {
        this(nombre, codigo);
        this.precio = precio;
    }

    public Producto(String nombre, int codigo, double precio, int cantidadDisponible) {

        this(nombre, codigo, precio);
        this.cantidadDisponible = cantidadDisponible;
    }

    public static int getContador() {
        return contador;
    }

    public double getPrecio() {
        return precio;
    }

    public double valorTotal() {

        return precio * cantidadDisponible;

    }

        public double valorTotal(int cantidad) {

        return precio * cantidad;

    }

        

    public double valorTotalCoITBIS() {
        return valorTotal() *( 1 + ITBIS);
    }


    public double valorTotalCoITBIS(int cantidad) {
        return valorTotal(cantidad) *( 1 + ITBIS);
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre 
                + "\n Codigo: " + codigo 
                + "\n Precio: " + precio 
                + "\n Cantidad Disponible: " + cantidadDisponible 
                + "\n Itbis: " + (ITBIS * 100) +"%";
    }

}
