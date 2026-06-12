package Ejercicio2;

public class Corredor extends Thread{
    
    private String nombrecorredor;
    private static boolean ganador = false;

    public Corredor(String nombre){
        this.nombrecorredor = nombre;
    }

    @Override
    public void run(){

        for(int i = 1; i <= 5; i++){

            try{

                Thread.sleep(1000);
                System.out.println(nombrecorredor + " avanzo al metro " + (i * 2));

            }catch(InterruptedException e){
                
                e.printStackTrace();
            }
        }

        if(!ganador){

            ganador = true;
            System.out.println(nombrecorredor + "Gano la carrera!");
        }
        else{

            System.out.println(nombrecorredor + "Llego a la meta");
        }
    }
}
