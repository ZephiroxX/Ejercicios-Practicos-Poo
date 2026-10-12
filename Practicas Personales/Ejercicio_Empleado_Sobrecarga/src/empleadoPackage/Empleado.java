//
//
//Clase Empleado
//Intermedio
//Crea una clase Empleado con los atributos nombre, salario y departamento.
//Implementa constructores que reciban:
//- Nombre.
//- Nombre y salario.
//- Nombre, salario y departamento.
//Añade un método que muestre la información del empleado.
//Restricción: intenta evitar repetir la misma lógica de inicialización en varios constructores.
//Pista: investiga cómo un constructor puede invocar a otro constructor de la misma clase mediante this(...)
//
//
package empleadoPackage;

public class Empleado {

    private String nombre;
    private double salario;
    private String departamento;

    public Empleado(String nombre) {
        this.nombre = nombre;

    }

    public Empleado(String nombre, double salario) {
        this(nombre);
        this.salario = salario;
    }
    
    public Empleado(String nombre, double salario, String departamento)
    {
        this(nombre, salario);
        this.departamento = departamento;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public String getDepartamento() {
        return departamento;
    }
    
    public void mostrarDetalle()
    {
        System.out.println("Empleado: "+getNombre()+"- Salario:  "+getSalario()+"- Departamento "+getDepartamento());
    }
    
}
