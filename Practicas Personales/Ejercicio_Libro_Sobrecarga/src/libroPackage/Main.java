
package libroPackage;


public class Main {

   
    public static void main(String[] args) {
        Libro libro1 = new Libro("La sirena");
        Libro libro2 = new Libro("El ojo", "Buena ventura");
        Libro libro3 = new Libro("La marcha", "Jose leon", 300);
        
        
        System.out.println("Libro 1");
        libro1.mostrarDetalles();
        
              
        System.out.println("\nLibro 2");
        libro2.mostrarDetalles();
        
        
              
        System.out.println("\nLibro 3");
        libro3.mostrarDetalles();
        
        
    }

}
