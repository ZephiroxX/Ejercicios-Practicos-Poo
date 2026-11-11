package ecosistemaPackage;

public class Animal extends Organismo implements Movible, ConsumidorEnergia {

    private double velocidad;
    private int distanciaRecorrida;
    private double energiaConsumida;

    public Animal(String nombre, double energia, int edad, int velocidad) {
        super(nombre, energia, edad);
        if (velocidad < 0) {
            throw new IllegalArgumentException("Velocidad no valida");
        } else {
            this.velocidad = velocidad;
        }
        this.energiaConsumida = 0.0;
    }

    @Override
    public String realizarActividad() {
        return "El animal casa para sobrevivir";
    }

    @Override
    public void mover(int distancia) {
        if (distancia <= 0) {
            System.out.println("Distancia invalida");
        } else {
            this.distanciaRecorrida += distancia;
            System.out.println("El animal corrio con una velocidad de " + velocidad + "km/h. Su total de metros recorridos es: " +          distanciaRecorrida + "m");
        }

    }

    @Override
    public int obtenerDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    @Override
    public void consumirEnergia(double velocidad) {
        if (velocidad <= 80 && getEnergia() >= 20.5) {
            setEnergia(getEnergia() - 20.5);
            energiaConsumida += 20.5;
        } else if (velocidad <= 50 && getEnergia() >= 14.5) {
            setEnergia(getEnergia() - 14.5);
            energiaConsumida += 14.5;
        }

    }

    @Override
    public double obtenerEnergiaConsumida() {
        return energiaConsumida;
    }

    @Override
    public void mostrarEstado() {
        super.mostrarEstado();
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Distancia Recorrida: " + distanciaRecorrida);
        System.out.println("El total de energia consumida por el animal es: " + obtenerEnergiaConsumida());
    }
    
   
}
