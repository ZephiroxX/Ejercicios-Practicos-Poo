
package vehiclePackage;


public class Camion extends Vehiculo{
    
    private int capacidadCarga;
    private int cantidadEjes;

    public Camion(String marca, String modelo, int anio,int capacidadCarga, int cantidadEjes) {
        super(marca, modelo, anio);
        this.capacidadCarga = capacidadCarga;
        this.cantidadEjes = cantidadEjes;
    }

   
    
 
    @Override
    public void mostrarInformacion()
    {
        super.mostrarInformacion();
        System.out.println("Capacidad de carga: "+capacidadCarga);
        System.out.println("Cantidad de Ejes: "+cantidadEjes);
    }
    
    
         
}
