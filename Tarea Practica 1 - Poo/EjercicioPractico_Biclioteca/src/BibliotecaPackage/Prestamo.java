
package BibliotecaPackage;

import java.time.LocalDate;


public class Prestamo {

    private LocalDate fecha;
    private Usuario usuario;
    private Libro libro;

    public Prestamo(Usuario usuario, Libro libro) {
        this.fecha = fecha = LocalDate.now();
        this.usuario = usuario;
        this.libro = libro;
    }
    
    
    
    public void mostrarDetalle()
    {
        System.out.println("Fecha: "+fecha);
        System.out.println("Usuario: "+usuario.getUsuario() +" - Id "+usuario.getIdUsuario());        
        System.out.println("Libro: "+libro.getTitulo() +" - Autor "+libro.getAutor()+ " - ISBN "+libro.getIsbn());
    }
    
    
}
