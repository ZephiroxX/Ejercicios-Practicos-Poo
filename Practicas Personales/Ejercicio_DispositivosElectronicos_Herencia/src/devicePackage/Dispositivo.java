//
//Ejercicio 3
//
//Dificultad: ⭐⭐⭐
//
//Dispositivos electrónicos
//Conceptos: sobrescritura de métodos, comportamiento heredado y super.
//
//Una tienda vende computadoras portátiles, tabletas y teléfonos. Todos los dispositivos comparten características, 
//pero cada tipo debe presentar información específica.
//
//Requisitos
//1. Crea una clase Dispositivo con marca, modelo y precio.
//2. Implementa un método mostrarInformacion().
//3. Crea Computadora, Tableta y Telefono.
//4. Cada subclase debe incorporar al menos un atributo propio.
//5. Sobrescribe mostrarInformacion() para presentar tanto los datos comunes como los específicos.
//6. Crea un objeto de cada tipo y muestra sus datos.
//Restricciones: evita copiar y pegar todo el código de impresión de la clase padre en cada subclase.
//
//Pregunta de lógica: ¿qué ventaja tendría aprovechar el método original de Dispositivo en vez de volver a escribir la información de marca, modelo y precio?
//Esta seria que no tendriamos que declarar esos atributos de nuevo, reutlizando la clase padre y asi tambien evitando mas uso de memoria.



package devicePackage;

public class Dispositivo {

    private String marca;
    private String modelo;
    private double precio;

    public Dispositivo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        if (precio <= 0) {
            throw new IllegalArgumentException("Error: Precio no disponible para este dispositivo");
        } else {
            this.precio = precio;
        }
    }

    public void mostrarInformacion() {
        System.out.println("\nMarca: " + marca + "\nModelo: " + modelo + "\nPrecio: " + precio);
    }

}
