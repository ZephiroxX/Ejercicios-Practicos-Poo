package enviosPackage;

public class EnvioAereo extends Envio {

    private String tipoPrioridad;

    public EnvioAereo(String codigo, double peso, String tipoPrioridad) {
        super(codigo, peso);

        if (!"urgente".equals(tipoPrioridad) && !"semi urgente".equals(tipoPrioridad) && !"sin urgencia".equals(tipoPrioridad)) {
            throw new IllegalArgumentException("Seleccion invalida");
        } else {
            this.tipoPrioridad = tipoPrioridad;
        }
    }

    @Override
    public double calcularCosto() {

        double costoBase = getPeso() * 60;
        if ("urgente".equals(tipoPrioridad)) {
            return costoBase + (costoBase * 0.15);
        } else if ("semi urgente".equals(tipoPrioridad)) {
            return costoBase + (costoBase * 0.10);
        }

        return costoBase;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("\nPaquetes Aereos: ");
        super.mostrarInformacion();
        System.out.println("Tipo de prioridad del paquete: " + tipoPrioridad);
    }

}
