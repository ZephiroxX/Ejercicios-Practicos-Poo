package packageProducto;

import java.util.Scanner;

public class Main {

    public static double calcularPrecio(Producto p[]) {

        double valorTotal = 0;
        for (int i = 0; i < p.length; i++) {

            valorTotal += p[i].valorTotalCoITBIS();
        }

        return valorTotal;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nombre;
        int codigo;
        double precio;
        int cantidadProductos;
        int cantidadDisponible;

        System.out.println("Ingrese la cantidad de productos");
        cantidadProductos = input.nextInt();

        Producto p1[] = new Producto[cantidadProductos];

        for (int i = 0; i < p1.length; i++) {
            input.nextLine();
            System.out.println("\nDigite los datos del producto " + (i + 1) + ":");
            System.out.print("Nombre: ");
            nombre = input.nextLine();
            System.out.print("Codigo: ");
            codigo = input.nextInt();
            System.out.print("Precio: ");
            precio = input.nextDouble();
            System.out.print("Cantidad Disponible: ");
            cantidadDisponible = input.nextInt();

            p1[i] = new Producto(nombre, codigo, precio, cantidadDisponible);
        }

        input.close();

        double totalProductos = calcularPrecio(p1);

        System.out.println("\nDetalles del producto");

        for (int k = 0; k < p1.length; k++) {
            System.out.println(p1[k]);

        }

        System.out.println("\nLa cantidad de productos son: " + Producto.getContador());

        System.out.println("\nEl precio total de los productos es: " + totalProductos);

    }

}
