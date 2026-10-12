//Ejercicio 7 — Producto y constante
//Fácil
//
//Crea una clase Producto con nombre y precio. Define una constante para el ITBIS del 18 % y crea constructores para recibir solo el nombre, nombre y precio, o los tres datos si se incluye una categoría.
//- Reutiliza constructores con this(...).
//- Crea un método que calcule el precio con ITBIS.
//- Comprueba que la constante no se modifique durante los cálculos.
//
package packageProducto;

public class Producto {

    private String nombre;
    private double precio;
    private String categoria;
    private static final double ITBIS = 0.18;

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    public Producto(String nombre, double precio) {
        this(nombre);
        this.precio = precio;
    }

    public Producto(String nombre, double precio, String categoria) {
        this(nombre, precio);
        this.categoria = categoria;
    }

    private double calcularPrecio() {
        return precio + (precio * ITBIS);

    }

    public double getPrecio() {
        return precio;
    }
    
    
    
    
    public void mostrarDetalles() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Categoria: " + categoria);
        System.out.println("\nPrecio total: "+calcularPrecio());
    }
    
    

}
