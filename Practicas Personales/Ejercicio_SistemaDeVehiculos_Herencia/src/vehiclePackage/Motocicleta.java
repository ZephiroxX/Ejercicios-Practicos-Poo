
package vehiclePackage;


public class Motocicleta extends Vehiculo{

    private int cilindrada;
    private String tipo;

    public Motocicleta(String marca, String modelo, int anio, int cilindrada, String tipo) {
        super(marca, modelo, anio);
        this.cilindrada = cilindrada;
        this.tipo = tipo;
    }
    
    
       @Override
    public void mostrarInformacion()
    {
        super.mostrarInformacion();
        System.out.println("Cilindrada: "+cilindrada);
        System.out.println("Tipo: "+tipo);
    }
    
    
}
