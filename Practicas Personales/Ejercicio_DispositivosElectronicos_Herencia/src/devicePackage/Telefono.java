package devicePackage;

public class Telefono extends Dispositivo {

    private String tipoDeConector;
    private String tipoDeRed;

    public Telefono(String marca, String modelo, double precio, String tipoDeConector, String tipoDeRed) {
        super(marca, modelo, precio);
        this.tipoDeConector = tipoDeConector;
        this.tipoDeRed = tipoDeRed;
    }

    @Override
    public void mostrarInformacion()
    {
        super.mostrarInformacion();
        System.out.println("Tipo de Conector: "+tipoDeConector);
        System.out.println("Tipo de Red: "+tipoDeRed);
    }
            
    
}
