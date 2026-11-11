package reportesPackage;

public class ReporteClientes extends Reporte {

    private int clientesNuevos;
    private int clientesActivos;

    public ReporteClientes(String titulo, String autor, int cantidadRegistros, int clientesNuevos, int clientesActivos) {
        super(titulo, autor, cantidadRegistros);
        if (clientesNuevos < 0 || clientesActivos < 0) {
            throw new IllegalArgumentException("Se ha ingresado una cantidad negativa");

        } else {
            this.clientesNuevos = clientesNuevos;
            this.clientesActivos = clientesActivos;
        }
    }

    @Override
    public String generarReporte() {
        return "\nCantidad de clientes nuevos: " + clientesNuevos + "\nCantidad de clientes activos: " + clientesActivos;
    }

}
