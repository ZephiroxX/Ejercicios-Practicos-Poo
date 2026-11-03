//Ejercicio 1 — Sistema de tarifas de envío
//Dificultad: ⭐⭐⭐⭐
//
//Inspiración laboral: Empresas como DHL, FedEx, Amazon Logistics.
//Objetivo
//Aplicar clases abstractas, sobrescritura y polimorfismo mediante un arreglo de la clase padre, igual que en el proyecto de ATS.
//Contexto
//Una empresa de logística necesita calcular el costo de distintos tipos de envíos.
//
//Todos los envíos tienen información común, pero cada tipo calcula su tarifa de manera diferente.
//
//Requisitos
//1. Clase abstracta Envio
//Debe contener:
//- codigo (String)
//- peso (double)
//- Constructor.
//- Método concreto mostrarInformacion().
//- Método abstracto calcularCosto().
//
//2. Clases hijas
//EnvioTerrestre
//Atributos:
//
//- distanciaKm
//
//Regla:
//
//- El costo depende del peso y de la distancia.
//
//EnvioAereo
//Atributos:
//
//- tipoPrioridad
//
//Regla:
//
//- El costo cambia según la prioridad del envío.
//
//EnvioMaritimo
//Atributos:
//
//- contenedorCompartido (boolean)
//
//Regla:
//
//- El cálculo cambia dependiendo de si comparte contenedor.
//
//3. Clase Main
//Aquí viene el concepto importante del video 77.
//
//Debes crear:
//Envio envios[] = new Envio[6];
//
//
//No debes crear tres arreglos diferentes.
//
//Después:
//- Registrar 2 terrestres.
//- Registrar 2 aéreos.
//- Registrar 2 marítimos.
//Finalmente recorrer:
//for (...) {
//    envios[i].mostrarInformacion();
//    System.out.println(envios[i].calcularCosto());
//}
//
package enviosPackage;

public abstract class Envio {

    private String codigo;
    private double peso;

    public Envio(String codigo, double peso) {
        this.codigo = codigo;
        if (peso <= 0) {
            throw new IllegalArgumentException("Peso invalido");
        } else {
            this.peso = peso;
        }
    }

    public double getPeso() {
        return peso;
    }

    public void mostrarInformacion() {
        System.out.println("\nCodigo " + codigo + "\nPeso: " + peso);
    }

    public abstract double calcularCosto();

}
