
package packageEmpleado;


public class Empleado {
    
    private String nombre;
    private double salario;
    private static int contadorEmpleados;
    
    
    public Empleado(String nombre)
    {
     this.nombre = nombre;
     contadorEmpleados++;
    }

    public Empleado(String nombre,double salario)
    {
       this(nombre);
        this.salario = salario;

    }
    
   
    
    public static int getEmpleados()
    {
        return contadorEmpleados;
    }
    
    
    
}
