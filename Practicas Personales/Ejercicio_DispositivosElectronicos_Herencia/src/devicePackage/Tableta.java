
package devicePackage;


public class Tableta extends Dispositivo{
    
    private int pulgadas;

    public Tableta(String marca, String modelo, double precio, int pulgadas) {
        super(marca, modelo, precio);
        this.pulgadas = pulgadas;
    }
    
    
    @Override
    public void mostrarInformacion()
    {
        super.mostrarInformacion();
        System.out.println("Pulgadas: "+pulgadas);
    }

}
