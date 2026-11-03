package enviosPackage;

public class EnvioTerrestre extends Envio {

    private int distanciaKm;

    public EnvioTerrestre(String codigo, double peso, int distanciaKm) {
        super(codigo, peso);
        if (distanciaKm <= 0) {
            throw new IllegalArgumentException("");
        }
        this.distanciaKm = distanciaKm;
    }

    @Override
    public double calcularCosto() {

        return (getPeso() * 60) + (distanciaKm * 15);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("\nPaquetes Terrestres: ");

        super.mostrarInformacion();
        System.out.println("Distancia: " + distanciaKm +"KM");
    }
}
