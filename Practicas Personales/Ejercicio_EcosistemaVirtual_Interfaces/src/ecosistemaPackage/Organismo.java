package ecosistemaPackage;

public abstract class Organismo {

    private String nombre;
    private double energia;
    private int edad;
    private static double energiaProducida;

    public Organismo(String nombre, double energia, int edad) {
        this.nombre = nombre;
        if (energia < 0 || edad < 0) {
            throw new IllegalArgumentException("Datos invalidos");
        } else {
            this.energia = energia;
            this.edad = edad;
        }
    }

    public abstract String realizarActividad();

    public String getNombre() {
        return nombre;
    }

    public double getEnergia() {
        return energia;
    }

    public int getEdad() {
        return edad;
    }

    public static double getEnergiaProducida() {
        return energiaProducida;
    }

    
    public static void setEnergiaProducida(double energiaProducida) {
        if(energiaProducida != 0)
        {
            Organismo.energiaProducida = energiaProducida;
        }
    }
    
    

    public void setEnergia(double energia) {
        if (energia != 0) {
            this.energia = energia;
        }
    }

    public void mostrarEstado() {
        System.out.println("\nNombre: " + nombre + "\nEnergia:" + energia + "\nEdad: " + edad);
    }

}
