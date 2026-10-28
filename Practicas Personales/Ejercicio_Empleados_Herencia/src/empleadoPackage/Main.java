package empleadoPackage;

public class Main {

    public static void main(String[] args) {

        Empleado empleados[] = new Empleado[2];

        empleados[0] = new EmpleadoFijo("Jonathan", 23454, 15000);
        empleados[1] = new EmpleadoPorComision("Rick", 23232, 30000, 100000);

        for (int i = 0; i < empleados.length; i++) {
          empleados[i].mostrarDatos();
        }
        
        
        
    }

}
