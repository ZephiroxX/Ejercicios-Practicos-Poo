package descuentosPackage;

public class DescuentoFidelidad extends Descuento {

    private int aniosCliente;
    private double descuento;

    public DescuentoFidelidad(String nombre, double montoCompra, int aniosCliente) {
        super(nombre, montoCompra);

        if (aniosCliente < 0) {
            throw new IllegalArgumentException("Anios invalidos");
        } else {
            this.aniosCliente = aniosCliente;
        }

    }

    @Override
    public double calcularDescuento() {

        if (aniosCliente == 0) {
            descuento = 0.0;
        } else if (aniosCliente <= 2) {
            descuento = 0.05;
        } else if (aniosCliente <= 5) {
            descuento = 0.10;
        } else {
            descuento = 0.15;
        }

        return getMontoCompra() * descuento;

    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Anios del cliente: " + aniosCliente);
        System.out.println("Descuento: " + calcularDescuento());
        System.out.println("Total: " + (getMontoCompra() - calcularDescuento()));
    }

}
