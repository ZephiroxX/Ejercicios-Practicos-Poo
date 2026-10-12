//Clase Rectangulo
//Fácil
//Crea una clase Rectangulo con los atributos ancho y alto.
//Implementa:
//- Un constructor sin parámetros.
//- Un constructor que reciba un único valor para crear un cuadrado.
//- Un constructor que reciba el ancho y el alto.
//Añade un método calcularArea() y prueba los tres casos.
//Pista: si solo recibes un número, ¿cómo puedes utilizarlo para inicializar dos atributos?
package rectanguloPackage;

public class Rectangulo {

    private int ancho;
    private int alto;

    public Rectangulo() {
        
    }

    public Rectangulo(int ancho) {
        this.ancho = ancho;
        this.alto = ancho;
    }

    public Rectangulo(int ancho, int alto) {
        this(ancho);
        this.alto = alto;
    }

    public double calcularArea() {
        return ancho * alto;
    }


}
