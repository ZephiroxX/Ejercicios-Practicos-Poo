package descuentosPackage;

public class Main {

    public static void main(String[] args) {
        Descuento descuentos[] = new Descuento[6];

        //Descuento de Temporada
        descuentos[0] = new DescuentoTemporada("Play 5", 10000, 30);
        descuentos[1] = new DescuentoTemporada("Silla Gamer", 6000, 25);

        //Descuento de Fidelidad
        descuentos[2] = new DescuentoFidelidad("BMW", 3000000, 2);
        descuentos[3] = new DescuentoFidelidad("Lamborghini", 5000000, 6);

        //Descuento por cupon
        descuentos[4] = new DescuentoCupon("Nevera TCL", 25000);
        descuentos[5] = new DescuentoCupon("Pantalla LCD '60 pulgadas' ", 40000);

        for (int i = 0; i < descuentos.length; i++) {
            descuentos[i].mostrarInformacion();
        }
    }

}
