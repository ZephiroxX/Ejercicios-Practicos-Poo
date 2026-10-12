//
//01
//
//Clase Persona
//Fácil
//Crea una clase Persona con los atributos nombre y edad.
//Define tres constructores:
//- Uno sin parámetros.
//- Uno que reciba el nombre.
//- Uno que reciba el nombre y la edad.
//Después, crea tres objetos utilizando cada constructor y muestra sus datos.
//Pista: ¿qué valores tendrán los atributos cuando no proporciones argumentos?
//
package personaPackage;

public class Persona {

    private String nombre;
    private int edad;

    public Persona() {

    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    
    public void mostrarDatos()
    {
        System.out.println("Nombre "+getNombre()+ " Edad "+getEdad());
        
    }
    
    
    
    
}
