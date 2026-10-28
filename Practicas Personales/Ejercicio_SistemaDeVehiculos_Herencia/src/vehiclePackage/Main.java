package vehiclePackage;

public class Main {

    public static void main(String[] args) {

        Vehiculo v1[] = new Vehiculo[4];

        v1[0] = new Automovil("BMw", "M4 competition", 2027, 2, "Premium");
        v1[1] = new Motocicleta("Roustler", "Cc300", 2025, 400, "Deportiva");
        v1[2] = new Camion("Volvo", "G-Force", 2022, 2000, 4);
        v1[3] = new Automovil("Honda", "Civic Ex", 2019, 4, "Premium");
        
        
        System.out.println("\nDatos de todos vehiculo");
        for(int i= 0; i < v1.length; i++)
        {
            v1[i].mostrarInformacion();
        }
        
    }

    
    
}
