package empleadoPackage;

public class EmpleadoPorComision extends Empleado {

    private double totalVentas;

    public EmpleadoPorComision(String nombre, int codigo, double salarioBase, double totalVentas) {
        super(nombre, codigo, salarioBase);

        if (totalVentas < 0) {
            throw new IllegalArgumentException("Error: Salario Invalido");

        } else {
            this.totalVentas = totalVentas;
        }
    }

    @Override
    public double calcularSalario() {
        if (totalVentas <= 0) {
            return getSalarioBase();
        } else {
            double comision = totalVentas * 0.05;
            return getSalarioBase() + comision;
        }

    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Total de Ventas: " + totalVentas);
    }
}
