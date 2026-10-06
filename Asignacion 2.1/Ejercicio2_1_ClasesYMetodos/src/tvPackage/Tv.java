package tvPackage;

public class Tv {

    String marca;
    int pulgadas;
    boolean encendido;
    int volumen;

    public Tv(String marca, int pulgadas, int volumen) {
        this.marca = marca;
        this.pulgadas = pulgadas;
        this.volumen = volumen;
    }

    public String getMarca() {
        return marca;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public int getVolumen() {
        return volumen;
    }

    public int subirVolumen() {
        System.out.println("Subiendo el volumen...");
        return volumen += 6;
    }

    public int bajarVolumen() {
        
        System.out.println("Bajando el volumen...");
        return volumen -= 6;

    }

    public boolean encendido() {

        System.out.println("La TV se esta encendiendo...");
        return encendido = true;
    }

    public boolean apagar() {
        System.out.println("La TV se esta apagando...");

        return encendido = false;
    }

}
