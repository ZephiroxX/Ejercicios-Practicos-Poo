
package packageProducto;


public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("mantequilla",50,"Lacteos");
        
        if(p1.getPrecio() <= 0)
        {
            System.out.println("Error: Producto Invalido");
        }
        else
        {
        
           p1.mostrarDetalles();
            
        }
        
    }

}
