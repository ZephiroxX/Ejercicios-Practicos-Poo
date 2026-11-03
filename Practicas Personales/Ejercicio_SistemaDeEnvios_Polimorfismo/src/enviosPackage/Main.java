package enviosPackage;

public class Main {

    public static void main(String[] args) {

        Envio envios[] = new Envio[6];

        envios[0] = new EnvioTerrestre("23546", 30, 60);
        envios[1] = new EnvioTerrestre("32456", 80, 20);
        envios[2] = new EnvioAereo("54678", 63, "urgente");
        envios[3] = new EnvioAereo("34343", 19, "sin urgencia");
        envios[4] = new EnvioMaritimo("12343", 70, true);
        envios[5] = new EnvioMaritimo("267443", 50, false);

        
        for(int i = 0; i < envios.length; i++)
        {
            envios[i].mostrarInformacion();
            System.out.println(envios[i].calcularCosto());
        }
    }

}
