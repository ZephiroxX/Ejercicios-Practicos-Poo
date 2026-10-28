package estudiantesPackage;

public class Estudiante {

    private String nombre;
    private int edad;
    private int matricula;
    private double calificacion;
    private double calificacion2;
    private double promedio;
    private static final double CMINIMA = 70;
    private static int contador;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        contador++;
    }

    public Estudiante(String nombre, int edad, int matricula) {
        this(nombre, edad);
        this.matricula = matricula;
    }

    public Estudiante(String nombre, int edad, int matricula, double calificacion) {
        this(nombre, edad, matricula);
        this.calificacion = calificacion;

    }

    public Estudiante(String nombre, int edad, int matricula, double calificacion, double calificacion2) {
        this(nombre, edad, matricula, calificacion);
        this.calificacion2 = calificacion2;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public static double getCMINIMA() {
        return CMINIMA;
    }

    public double promedioDeCalificaciones(double calificacion) {
        promedio = ((double) calificacion + calificacion2) / 2;

        return promedio;
    }

    public boolean obtenerResultado(double promedio) {
        return promedio >= CMINIMA;
    }

    public String obtenerResultado() {

        promedio = promedioDeCalificaciones(calificacion);
        if (obtenerResultado(promedio)) {
            return "aprobado";
        }

        return "Desaprobado";
    }

    public static int getContador() {
        return contador;
    }

    public void actualizarNota(double calificacion) {
        this.calificacion = calificacion;
    }

    public void actualizarNota(double calificacion, double calificacion2) {
        this.calificacion = calificacion;
        this.calificacion2 = calificacion2;
    }

    
    
    public void datosDelEstudiante() {
        System.out.println("\nNombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Matricula: " + matricula);
        System.out.println("Calificacion: " + calificacion);
        System.out.println("Calificacion 2: " + calificacion2);
        System.out.println("Promedio: " + promedioDeCalificaciones(calificacion));
        System.out.println("Resultado: " + obtenerResultado());
    }


}
