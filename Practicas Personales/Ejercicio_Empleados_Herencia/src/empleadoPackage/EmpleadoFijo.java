package empleadoPackage;

public class EmpleadoFijo extends Empleado {

    public EmpleadoFijo(String nombre, int codigo, double salarioBase) {
        super(nombre, codigo, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (getSalarioBase() * 0.10);
    }

}
