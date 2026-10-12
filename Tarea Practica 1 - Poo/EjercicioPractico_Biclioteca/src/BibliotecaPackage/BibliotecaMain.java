//1
//Sistema de Biblioteca
//
//Modela un sistema básico de gestión de biblioteca mediante tres clases principales:
//Libro: con atributos título, autor, ISBN y disponible (booleano).
 ////Usuario: con nombre, ID único y una colección de libros prestados.
//Préstamo: registra la fecha, el usuario y el libro asociado.
//💡 Requisitos clave:
//
//Implementa métodos como prestarLibro(), devolverLibro() y consultarDisponibilidad().
//Usa encapsulamiento: todos los atributos deben ser private.
//Incluye al menos un constructor por clase.

package BibliotecaPackage;

public class BibliotecaMain {

    public static void main(String[] args) {
        Libro libro1 = new Libro("Las rosas", "Miguel de la cruz", 3);
        Usuario usuario1 = new Usuario("John", 2330, 4);

        System.out.println("Primer prestamo del libro");
        prestarLibro(usuario1, libro1);

        System.out.println("\nIntento de prestamo del libro");
        prestarLibro(usuario1, libro1);

        System.out.println("Devolucion del libro");
        devolverLibro(usuario1, libro1);

        System.out.println("\nIntento de prestamo del libro luego de devolucion");
        prestarLibro(usuario1, libro1);

        
        
        
      
        

    }

    public static void prestarLibro(Usuario usuario, Libro libro) {
        if (libro.consultarDisponibilidad()) {
            boolean disponible = usuario.agregarLibros(libro);

            if (disponible) {
                libro.prestar();
                Prestamo nuevoPrestamo = new Prestamo(usuario, libro);
                System.out.println("Prestamo realizado correctamente");
                nuevoPrestamo.mostrarDetalle();

            } else {
                System.out.println("El usuario alcanzo el limite de libros");
            }
        } else {
            System.out.println("Error: El libro /" + libro.getTitulo() + " / No esta disponible");

        }
    }

    public static void devolverLibro(Usuario usuario, Libro libro) {
        if (usuario.tieneLibro(libro)) {
            usuario.removerLibro(libro);
            libro.devolver();
            System.out.println("El libro /" + libro.getTitulo() + "/ Fue Devuelto correctamente");
        } else {
            System.out.println("Error: El usuario  /" + usuario.getUsuario() + "/ no tiene este libro prestado");
        }
    }

}
