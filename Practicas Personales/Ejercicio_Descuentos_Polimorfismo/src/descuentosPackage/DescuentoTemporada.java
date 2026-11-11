package descuentosPackage;

public class DescuentoTemporada extends Descuento {

    private double porcentaje;

    public DescuentoTemporada(String nombre, double montoCompra, double porcentaje) {
        super(nombre, montoCompra);
        if (porcentaje <= 0 || porcentaje > 30) {
            throw new IllegalArgumentException("Porcentaje invalido");
        } else {
            this.porcentaje = porcentaje / 100;
        }
    }

    @Override
    public double calcularDescuento() {
      

        return getMontoCompra() * porcentaje;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Descuento: " + calcularDescuento());
        System.out.println("Total: "+(getMontoCompra() - calcularDescuento()));
    }
}
