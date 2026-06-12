package Ejercicio1;

public class Main {
    
    public static void main(String[] args ){

        Archivo archivo1 = new Archivo("Archivo1");
        Archivo archivo2 = new Archivo("Archivo2");
        Archivo archivo3 = new Archivo("Archivo3");

       
        archivo1.start();
        archivo2.start();
        archivo3.start();
    }
}
