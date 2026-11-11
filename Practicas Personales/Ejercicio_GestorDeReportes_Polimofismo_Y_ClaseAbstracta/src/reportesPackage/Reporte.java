package reportesPackage;

public abstract class Reporte {

    private String titulo;
    private String autor;
    private int cantidadRegistros;

    public Reporte(String titulo, String autor, int cantidadRegistros) {
        this.titulo = titulo;
        this.autor = autor;
        if (cantidadRegistros <= 0) {
            throw new IllegalArgumentException("Registro negativo no permitido");
        } else {
            this.cantidadRegistros = cantidadRegistros;
        }
    }

    public int getCantidadRegistros() {
        return cantidadRegistros;
    }

    public abstract String generarReporte();

    public void mostrarInformacion() {
        System.out.println("\nTitulo: "+titulo +"\nAutor: "+autor+"\nCantidad de registros: "+cantidadRegistros);
    }

}
