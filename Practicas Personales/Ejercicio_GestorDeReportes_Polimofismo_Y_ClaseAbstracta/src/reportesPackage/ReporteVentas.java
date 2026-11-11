package reportesPackage;

public class ReporteVentas extends Reporte {

    private double totalVentas;

    public ReporteVentas(String titulo, String autor, int cantidadRegistros, double totalVentas) {
        super(titulo, autor, cantidadRegistros);
        if (totalVentas < 0) {
            throw new IllegalArgumentException("Venta negativa");
        } else {
            this.totalVentas = totalVentas;
        }
    }

    @Override
    public String generarReporte() {
        return "\nEl total de ventas es: " + totalVentas + "\nPromedio por registro: " + totalVentas / getCantidadRegistros();
    }
    
    
}
