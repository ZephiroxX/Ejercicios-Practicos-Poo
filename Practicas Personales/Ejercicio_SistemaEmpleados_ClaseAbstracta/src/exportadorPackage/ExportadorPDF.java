package exportadorPackage;

public class ExportadorPDF extends Exportador {

    private boolean incluirImagenes;

    public ExportadorPDF(String nombreArchivo, boolean incluirImagenes) {
        super(nombreArchivo);
        this.incluirImagenes = incluirImagenes;
    }

    @Override
    public void exportar() {
        if (incluirImagenes) {
            System.out.println("Se esta generando un archivo PDF y si incluira imágenes.");
        } else {
            System.out.println("Se esta generando un archivo PDF");
        }
    }

}