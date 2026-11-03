
package devicePackage;


public class Computadora extends Dispositivo{
    private String tipo;

    public Computadora( String marca, String modelo, double precio, String tipo) {
        super(marca, modelo, precio);
        this.tipo = tipo;
    }


    @Override
    public void mostrarInformacion()
    {
        super.mostrarInformacion();
        System.out.println("Tipo: "+tipo);
    }
    
    
}
