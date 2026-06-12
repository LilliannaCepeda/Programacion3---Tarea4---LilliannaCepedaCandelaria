package Ejercicio2;

public class Main {

    public static void main(String[] args){

        Corredor corredor1 = new Corredor("Lillianna");
        Corredor corredor2 = new Corredor("Jazmine");
        Corredor corredor3 = new Corredor("Julymar");

        System.out.println("========ESTADO INICIAL========");
        System.out.println("Lillianna: " + corredor1.getState());
        System.out.println("Jazmine: " + corredor2.getState());
        System.out.println("Julymar" + corredor3.getState());

        corredor1.start();
        corredor2.start();
        corredor3.start();

        try{

            corredor1.join();
            corredor2.join();
            corredor3.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        

        System.out.println("========ESTADO FINAL========");
        System.out.println("Lillianna: " + corredor1.getState());
        System.out.println("Jazmine: " + corredor2.getState());
        System.out.println("Julymar" + corredor3.getState());
    }
    
}
