//Ejercicio 2 — Plataforma de exportación de archivos ⭐⭐⭐⭐
//Nivel intermedio-avanzado
//
//
//Objetivo: aprender a utilizar clases abstractas cuando diferentes objetos realizan una operación común, pero cada uno la ejecuta de manera diferente.
//Enunciado
//Una aplicación necesita permitir que sus usuarios exporten información en diferentes formatos.
//
//La aplicación debe admitir tres formatos: PDF, Excel y CSV.
//
//1. Clase abstracta Exportador
//Debe contener:
//- Atributo privado nombreArchivo.
//- Constructor para inicializarlo.
//- Método abstracto exportar().
//- Método concreto mostrarArchivo() que muestre el nombre del archivo que se va a exportar.
//
//
//2. Clases hijas
//Crea las siguientes clases:
//
//ExportadorPDF
//- Atributo adicional: incluirImagenes (boolean).
//- Implementar exportar().
//- Mostrar un mensaje indicando que se está generando un archivo PDF y si incluirá imágenes.
//
//ExportadorExcel
//- Atributo adicional: cantidadHojas (int).
//- Implementar exportar().
//- Mostrar un mensaje indicando que se está generando un archivo Excel y la cantidad de hojas.
//
//ExportadorCSV
//- Atributo adicional: separador (char).
//- Implementar exportar().
//- Mostrar un mensaje indicando que se está generando un archivo CSV y qué separador utilizará.
//
//3. Clase Main
//Debes:
//1. Crear un objeto de cada tipo de exportador.
//2. Mostrar el nombre de cada archivo.
//3. Ejecutar el método exportar() de cada objeto.
//



package exportadorPackage;

public abstract class Exportador {

    private String nombreArchivo;

    public Exportador(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;

    }

    public abstract void exportar();

    public void mostrarArchivo() {
        System.out.println("Nombre: " + nombreArchivo);
    }

}
