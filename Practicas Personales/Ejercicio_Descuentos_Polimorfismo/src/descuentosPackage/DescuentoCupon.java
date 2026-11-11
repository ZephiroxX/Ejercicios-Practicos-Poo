package descuentosPackage;

public class DescuentoCupon extends Descuento {

    private static final double MCUPON = 2000;

    public DescuentoCupon(String nombre, double montoCompra) {
        super(nombre, montoCompra);
        if (MCUPON > montoCompra) {
            throw new IllegalArgumentException("El cupon supera al monto de compra");
        }
    }

    @Override
    public double calcularDescuento() {

        return MCUPON;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Descuento fijo: " + MCUPON);
        System.out.println("Total: " + (getMontoCompra() - calcularDescuento()));
    }
}
