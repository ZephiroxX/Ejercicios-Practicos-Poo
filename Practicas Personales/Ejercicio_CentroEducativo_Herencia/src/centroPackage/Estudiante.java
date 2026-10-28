
package centroPackage;


public class Estudiante extends Persona{
    
    private int matricula;
    private String curso;

    public Estudiante( String nombre, String apellido, int edad,int matricula, String curso) {
        super(nombre, apellido, edad);
        this.matricula = matricula;
        this.curso = curso;
    }
    
    
    @Override
    public void mostrarInformacion()
    {
       super.mostrarInformacion();
        System.out.println("Matricula: "+matricula);
        System.out.println("Curso: "+curso);
    
    }
    
}
