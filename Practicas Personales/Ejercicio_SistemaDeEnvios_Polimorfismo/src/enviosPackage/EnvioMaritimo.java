package enviosPackage;

public class EnvioMaritimo extends Envio {

    private boolean contenedorCompartido;

    public EnvioMaritimo(String codigo, double peso, boolean contenedorCompartido) {
        super(codigo, peso);
        this.contenedorCompartido = contenedorCompartido;
    }

    @Override
    public double calcularCosto() {
        double costo = getPeso() * 55;

        if (contenedorCompartido) {
            return costo + (costo * 0.20);
        }
        return costo;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("\nPaquetes Maritimos: ");
        super.mostrarInformacion();
        if (contenedorCompartido) {
            System.out.println("Contendor compartido");
        } else {
            System.out.println("Contenedor no compartido");
        }
    }

}
