package ecosistemaPackage;

public class OrganismoArtificial extends Organismo implements ProductorEnergia, Movible {

    private int capacidadBateria;
    private int distanciaRecorrida;
    public OrganismoArtificial(int capacidadBateria, String nombre, double energia, int edad) {
        super(nombre, energia, edad);
        if (capacidadBateria < 0) {
            System.out.println("Capacidad de la bateria ingresada no valida");
        } else {
            this.capacidadBateria = capacidadBateria;
        }
    }

    @Override
    public String realizarActividad() {
        return "El organismo artificial recoge materia y la convierte en energia";
    }

    @Override
    public void producirEnergia(double cantidadMateria) {
        if (cantidadMateria >= 75 && capacidadBateria >= getEnergia()) {
            setEnergia(getEnergia() + 25.0);
            setEnergiaProducida(getEnergiaProducida() + 25.0);
        } else if (cantidadMateria >= 50 && capacidadBateria >= getEnergia()) {
            setEnergia(getEnergia() + 12.5);
            setEnergiaProducida(getEnergiaProducida() + 12.5);
        }

    }

    @Override
    public double obtenerEnergiaProducida() {
        return getEnergiaProducida();
    }

    @Override
    public void mover(int distancia) {
        if(distancia <= 0)
        {   
            System.out.println("Distancia no valida");
        }
        else
        {
           this.distanciaRecorrida += distancia;
            System.out.println("El organismo se movio con sus patas mecanicas una distancia de: "+distanciaRecorrida);
        }
    }

    @Override
    public int obtenerDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    @Override
    public void mostrarEstado()
    {
        super.mostrarEstado();
        System.out.println("La capacidad de bateria que de el organismo artificial fue: "+capacidadBateria);
        System.out.println("La cantidad energia producida por el animal fue: "+obtenerEnergiaProducida());
    }   
    
}
