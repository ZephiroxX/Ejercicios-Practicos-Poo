package reportesPackage;

public class ReporteInventario extends Reporte {

    private int productosDisponibles;
    private int productosAgotados;

    public ReporteInventario(String titulo, String autor, int cantidadRegistros, int productosDisponibles, int productosAgotados) {
        super(titulo, autor, cantidadRegistros);
        if (productosDisponibles < 0 || productosAgotados < 0) {
            throw new IllegalArgumentException("Cantidad de productos invalidos");
        } else {
            this.productosDisponibles = productosDisponibles;
            this.productosAgotados = productosAgotados;
        }
    }
    
    @Override
    public String generarReporte()
    {
       return "\nCantidad de productos disponibles: "+productosDisponibles +"\nCantidad de productos agotados: "+productosAgotados;
    }
    
}
