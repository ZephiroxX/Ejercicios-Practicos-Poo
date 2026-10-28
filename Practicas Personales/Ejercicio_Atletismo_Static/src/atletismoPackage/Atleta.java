/*

Ejercicio 4: Construir un programa para una competencia de atletismo,
el programa debe gestionar una serie de atletas caracterizados por su número de atleta,
nombre y tiempo de carrera, al final el programa debe mostrar los datos del atleta ganador de la carrera.

*/

package atletismoPackage;


public class Atleta {
    
    private String nombre;
    private int numero;
    private double tiempoCarrera;

    public Atleta(String nombre, int numero, double tiempoCarrera) {
        this.nombre = nombre;
        this.numero = numero;
        this.tiempoCarrera = tiempoCarrera;
    }

    public double getTiempoCarrera() {
        return tiempoCarrera;
    }

    
    public String mostrarDatos()
    {
       return "Nombre: "+nombre+ "\nNumero: "+numero + "\ntiempoCarrera "+tiempoCarrera;
    }
    
    
    
    
    
}
