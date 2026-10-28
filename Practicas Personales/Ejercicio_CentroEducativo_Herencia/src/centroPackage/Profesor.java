package centroPackage;

public class Profesor extends Persona {

    private int codigoEmpleado;
    private double salario;

    public Profesor(String nombre, String apellido, int edad, int codigoEmpleado, double salario) {
        super(nombre, apellido, edad);
        this.codigoEmpleado = codigoEmpleado;
        this.salario = salario;
    }


    @Override
    public void mostrarInformacion() {
         super.mostrarInformacion();
           System.out.println("Codigo de Empleado: " + codigoEmpleado);
           System.out.println("Salario: " + salario);
    }

    
}
