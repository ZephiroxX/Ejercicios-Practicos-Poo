package centroPackage;

public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    public Persona(String nombre, String apellido) {
        this(nombre);
        this.apellido = apellido;
    }

    public Persona(String nombre, String apellido, int edad) {
       this(nombre, apellido);
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
    
    
    public void mostrarInformacion()
    {
        System.out.println("\nNombre: "+nombre
                + "\nApellido: "+apellido 
                +"\nEdad: "+edad );
        
    }
    
    
    
}
