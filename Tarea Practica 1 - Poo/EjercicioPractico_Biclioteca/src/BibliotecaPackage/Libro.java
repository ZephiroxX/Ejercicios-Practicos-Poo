package BibliotecaPackage;

public class Libro {

    private String titulo;
    private String autor;
    private int isbn;
    private boolean disponibilidad;

    public Libro(String titulo, String autor, int isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponibilidad = true;

    }

    public boolean consultarDisponibilidad() {
        return disponibilidad;
    }

    public boolean prestar() {
        return disponibilidad = false;
    }

    public boolean devolver() {
        return disponibilidad = true;
    }

    
    
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getIsbn() {
        return isbn;
    }

}
