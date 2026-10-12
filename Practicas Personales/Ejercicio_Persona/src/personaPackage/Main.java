package personaPackage;

public class Main {

    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona("wilkin");
        Persona p3 = new Persona("Wilson", 20);

        System.out.println("Datos de la persona 1");
        p1.mostrarDatos();
        
        System.out.println("Datos de la persona 2");
        p2.mostrarDatos();
        
        System.out.println("Datos de la persona 3");
        p3.mostrarDatos();
     
     
    }

}
