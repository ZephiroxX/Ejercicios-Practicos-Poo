//Clase Libro
//
//
//Fácil
//Crea una clase Libro con los atributos titulo, autor y numeroPaginas.
//Sobrecarga los constructores para permitir crear un libro con:
//- Título.
//- Título y autor.
//- Título, autor y número de páginas.
//Muestra los datos de cada libro.
//Pista: identifica qué atributos quedan sin recibir un valor explícito en cada caso.
package libroPackage;

public class Libro {

    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Libro(String titulo) {
        this.titulo = titulo;

    }

    public Libro(String titulo, String autor) {
        this(titulo);
        this.autor = autor;

    }

    public Libro(String titulo, String autor, int numeroPaginas) {
        this(titulo, autor);
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void mostrarDetalles() {

        System.out.println("Titulo - " + getTitulo() + " - Autor -  " + getAutor() + " -  Cantidad de paginas " + getNumeroPaginas());

    }

}
