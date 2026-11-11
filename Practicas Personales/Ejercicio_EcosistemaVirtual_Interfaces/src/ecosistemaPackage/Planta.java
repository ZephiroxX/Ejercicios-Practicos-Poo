package ecosistemaPackage;

public class Planta extends Organismo implements ProductorEnergia {

    private String tipoLuz;
    private double temperatura;

    public Planta(String nombre, double energia, int edad, String tipoLuz, double temperatura) {
        super(nombre, energia, edad);
        this.tipoLuz = tipoLuz;
        this.temperatura = temperatura;
    }
    
    
    @Override
    public void producirEnergia(double temperatura) {
        if (temperatura >= 20) {
            setEnergia(getEnergia() + 5.5);
            setEnergiaProducida(getEnergiaProducida() + 5.5);
        }
    }
    
    
    @Override
    public double obtenerEnergiaProducida() {
        return getEnergiaProducida();
    }

    @Override
    public String realizarActividad() {
       return  "La planta comenzo a crecer";
    }

    @Override
    public void mostrarEstado() {
        super.mostrarEstado();
        System.out.println("Tipo de luz recibida: " + tipoLuz);
        System.out.println("La cantidad de energia producida fue: " + obtenerEnergiaProducida());
    }

}
