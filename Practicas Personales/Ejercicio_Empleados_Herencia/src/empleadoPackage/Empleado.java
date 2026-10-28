//
//Ejercicio 3. Empleados de una empresa
//
//⭐⭐⭐
//
//Conceptos: @Override, sobrescritura y comportamiento heredado.
//
//Una empresa tiene empleados con diferentes modalidades de remuneración.
//
//Requisitos
//1. Crea una clase Empleado con nombre, código y salario base.
//2. Crea EmpleadoFijo y EmpleadoPorComision.
//3. En la clase padre, define el método calcularSalario().
//4. El empleado fijo recibe un incentivo equivalente al 10 % del salario base.
//5. El empleado por comisión recibe su salario base más una comisión sobre sus ventas.
//6. Sobrescribe calcularSalario() en ambas clases hijas.
//7. Muestra la remuneración calculada de cada empleado.
//Restricciones: utiliza @Override, valida los valores y evita repetir los atributos comunes.
//
//Preguntas orientadoras
//- ¿Qué comportamiento tienen en común los empleados?
//- ¿Qué comportamiento debe cambiar según la subclase?
//- ¿Por qué dos métodos con la misma firma pueden producir resultados diferentes?
package empleadoPackage;

public class Empleado {

    private String nombre;
    private int codigo;
    private double salarioBase;

    public Empleado(String nombre, int codigo, double salarioBase) {
        this.nombre = nombre;
        this.codigo = codigo;

        if (salarioBase <= 0) {
            throw new IllegalArgumentException("Error: Salario Invalido");
        } else {
            this.salarioBase = salarioBase;
        }
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public void mostrarDatos() {
        System.out.println("\nNombre: " + nombre + "\nCodigo: " + codigo + "\nSalario: " + calcularSalario());

    }

}
