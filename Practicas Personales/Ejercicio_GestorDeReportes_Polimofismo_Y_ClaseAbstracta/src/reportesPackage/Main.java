package reportesPackage;

public class Main {

    public static void main(String[] args) {
        Reporte reportes[] = new Reporte[6];
        
        //Reportes de Ventas
        reportes[0] = new ReporteVentas("	Ventas enero", "Carlos", 100, 250000);
        reportes[1] = new ReporteVentas("	Ventas mayo", "Miguel", 50, 300000);

        //Reporte de inventario
        reportes[2] = new ReporteInventario("Inventario principal", "Jose", 150, 130, 30);
        reportes[3] = new ReporteInventario("Inventario secundario", "Juan", 200, 70, 20);

        //Reporte de clientes
        reportes[4] = new ReporteClientes("Clientes enero", "Jean", 50, 15, 35);
        reportes[5] = new ReporteClientes("Clientes noviembre", "rose", 80, 20, 60);

        
        
        for (int i = 0; i < reportes.length; i++) {
            reportes[i].mostrarInformacion();
            System.out.println(reportes[i].generarReporte());            
            System.out.println("-----------------------------");

        }
    }

}
