package productoPackage;

public class Main {

    public static void main(String[] args) {
        Producto producto1 = new Producto();
        Producto producto2 = new Producto("wilkin");
        Producto producto3 = new Producto("Wilson", 200);
        Producto producto4 = new Producto("wilmer", 400, 10);

        System.out.println("Detalles del primer producto");
        producto1.detallesDelProducto();

        System.out.println("\nDetalles del segundo producto");
        producto2.detallesDelProducto();

        System.out.println("\nDetalles del tercer producto");
        producto3.detallesDelProducto();

        System.out.println("\nDetalles del cuarto producto");
        producto4.detallesDelProducto();
    }

}
