//Ejercicio 2. Sistema de vehículos
//
//⭐⭐⭐
//
//Conceptos: herencia, constructores y reutilización de código.
//
//Una empresa necesita registrar distintos vehículos de su flota.
//
//Requisitos
//1. Crea una clase Vehiculo con marca, modelo y anio.
//2. Crea Automovil, Motocicleta y Camion.
//3. El automóvil tendrá cantidadPuertas y tipoCombustible.
//4. La motocicleta tendrá cilindrada y tipo.
//5. El camión tendrá capacidadCarga y cantidadEjes.
//6. Cada clase debe tener un constructor que inicialice todos sus atributos.
//7. Implementa un método para mostrar toda la información de cada vehículo.
//Restricciones: los datos comunes deben inicializarse desde la clase padre. No crees tres métodos independientes para mostrar la marca, el modelo 
//

package vehiclePackage;


public class Vehiculo {
    
    private String marca;
    private String modelo;
    private int anio;

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }
    
    
    public void mostrarInformacion()
    {
        System.out.println("\nMarca: "+marca +"\n Modelo: "+modelo+ "\n Anio: "+anio);
    
    }


    
    
    
    
}
