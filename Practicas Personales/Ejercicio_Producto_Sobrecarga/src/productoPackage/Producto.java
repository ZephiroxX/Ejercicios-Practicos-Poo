package productoPackage;

public class Producto {

    private String nombre;
    private int precio;
    private int cantidadStock;

  

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    public Producto(String nombre, int precio) {
        this(nombre);
        this.precio = precio;
    }

    public Producto(String nombre, int precio, int cantidadStock) {
        this(nombre, precio);
        this.cantidadStock = cantidadStock;
    }

    public Producto()
    {
        this.nombre = "Sin nombre";
    }
    
        
    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void detallesDelProducto() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Cantidad disponible " + getCantidadStock());

    }
}
