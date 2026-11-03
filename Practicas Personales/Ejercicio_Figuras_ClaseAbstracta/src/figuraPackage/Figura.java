//Ejercicio 1 — Sistema de figuras geométricas ⭐⭐⭐
//Nivel intermedio
//Objetivo: aprender a crear clases abstractas, declarar métodos abstractos e implementarlos en las clases hijas.
//Enunciado
//Desarrolla un programa para calcular el área de diferentes figuras geométricas. Todas las figuras tendrán características comunes, pero cada una calculará su área de manera diferente.
//Requisitos
//1. Clase abstracta Figura
//
//Debe contener:
//- Un atributo privado nombre.
//- Un constructor para inicializar el nombre.
//- Un método abstracto calcularArea().
//- Un método concreto mostrarNombre() que muestre el nombre de la figura.
//2. Clases hijas
//
//Crea las siguientes clases:
//- Circulo: tendrá el atributo radio.
//- Rectangulo: tendrá los atributos base y altura.
//- Triangulo: tendrá los atributos base y altura.
//Cada clase deberá:
//- Heredar de Figura.
//- Implementar el método calcularArea().
//- Utilizar su propia fórmula matemática.
//3. Clase Main
//
//Debes:
//1. Crear un objeto de cada figura.
//2. Mostrar el nombre de cada figura.
//3. Calcular y mostrar su área.
package figuraPackage;

public abstract class Figura {

    private String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularArea();

    public void mostrarNombre() {
        System.out.println("Nombre: "+nombre);
    }

}
