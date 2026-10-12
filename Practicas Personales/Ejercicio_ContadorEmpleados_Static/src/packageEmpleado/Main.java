
package packageEmpleado;

public class Main {


    public static void main(String[] args) {
        
        Empleado worker2 = new Empleado("John");
        
        Empleado worker1 = new Empleado("John",5000);
          Empleado worker4 = new Empleado("bebe",4566);
        
        
        System.out.println("La cantidad de empleados creados fue: "+Empleado.getEmpleados());
        

    }

}
