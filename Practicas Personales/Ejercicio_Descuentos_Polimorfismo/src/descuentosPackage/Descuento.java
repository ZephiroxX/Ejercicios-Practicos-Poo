package descuentosPackage;

public abstract class Descuento {

    private String nombre;
    private double montoCompra;

    public Descuento(String nombre, double montoCompra) {
        this.nombre = nombre;
        if (montoCompra <= 0) {
            throw new IllegalArgumentException("Monto invalido");
        } else {
            this.montoCompra = montoCompra;
        }
    }

    public double getMontoCompra() {
        return montoCompra;
    }

    public abstract double calcularDescuento();

    public void mostrarInformacion() {
        System.out.println("\nNombre: " + nombre + "\nMonto de compra: " + montoCompra);
    }

}
