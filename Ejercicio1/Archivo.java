package Ejercicio1;

public class Archivo extends Thread {

    private String nombreArchivo; 

    public Archivo(String nombreArchivo){

        this.nombreArchivo = nombreArchivo;
    }
    
    @Override
    public void run(){

        System.out.println("Descargando " + nombreArchivo + "..." );

        for(int i = 1; i <= 10; i++){

         try{

            Thread.sleep(1000);

            System.out.println( nombreArchivo + "  " + (i *10) + " %");

         }catch(InterruptedException e){

            e.printStackTrace();

         } 
         
        }

        
        System.out.println(nombreArchivo + " Completado");
    }

}
