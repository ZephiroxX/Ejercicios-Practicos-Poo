package exportadorPackage;

public class ExportadorExcel extends Exportador {

    private int cantidadHojas;

    public ExportadorExcel(String nombreArchivo, int cantidadHojas) {
        super(nombreArchivo);
        if (cantidadHojas <= 0) {
            throw new IllegalArgumentException("Error: Cantidad de hojas invalida");
        } else {
            this.cantidadHojas = cantidadHojas;
        }
    }

    @Override
    public void exportar() {
        System.out.println("Se esta generando un archivo excel su cantidad de hojas es: " + cantidadHojas);
    }

}
