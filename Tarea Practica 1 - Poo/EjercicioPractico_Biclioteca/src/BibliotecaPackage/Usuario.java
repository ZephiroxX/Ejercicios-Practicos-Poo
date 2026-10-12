package BibliotecaPackage;

public class Usuario {

    private String usuario;
    private int idUsuario;
    private Libro[] librosPrestados;
    private int cantidadLibros;

    public Usuario(String usuario, int idUsuario, int maxLibros) {
        this.usuario = usuario;
        this.idUsuario = idUsuario;
        this.librosPrestados = new Libro[maxLibros];
        this.cantidadLibros = 0;
    }

    public boolean agregarLibros(Libro libro) {
        if (cantidadLibros < librosPrestados.length) {
            librosPrestados[cantidadLibros] = libro;
            return true;
        }
        return false;
    }

    public boolean removerLibro(Libro libro) {
        for (int i = 0; i < cantidadLibros; i++) {
            if (librosPrestados[i] == libro) {
                for (int j = i; j < cantidadLibros - 1; j++) {
                    librosPrestados[j] = librosPrestados[j + 1];
                }

                librosPrestados[cantidadLibros - 1] = null; //Se usa para limpiar la posicion que se mueve en el arreglo
                cantidadLibros--;
                return true;
            }
        }
        return false;
    }

    public boolean tieneLibro(Libro libro) {
        for (int i = 0; i < cantidadLibros; i++) {
            librosPrestados[i] = libro;
            return true;
        }
        return false;
    }

    public String getUsuario() {
        return usuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public int getCantidadLibros() {
        return cantidadLibros;
    }

    
    
    
    
}
