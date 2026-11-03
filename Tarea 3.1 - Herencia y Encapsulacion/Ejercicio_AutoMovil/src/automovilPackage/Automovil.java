
package automovilPackage;


public class Automovil {

    private String marca;
    private String modelo;
    private int ano;
    private String color;

    public Automovil() {
        System.out.println("Constructor de Automovil");
       
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getColor() {
        return color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
    public void encender()
    {
        System.out.println("El automovil esta encendiendo...");
    }
    
    public void apagar()
    {
        System.out.println("El automovil se esta apagando...");
    
    }
    
    public void acelerar()
    {
        System.out.println("El automovil esta acelerando...");
    }
    
    public void frenar()
    {
        System.out.println("El automovil esta frenando...");
    }
}
