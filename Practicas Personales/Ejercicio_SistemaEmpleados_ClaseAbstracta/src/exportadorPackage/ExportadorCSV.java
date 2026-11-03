package exportadorPackage;

public class ExportadorCSV extends Exportador {

    private char separador;

    public ExportadorCSV(String nombreArchivo, char separador) {
        super(nombreArchivo);
        this.separador = separador;
    }
    
    @Override
    public void exportar()
    {
        System.out.println("Se esta creando un archivo csv espere un momento...  Su separador:  "+separador);
    }
    
   
    
}
