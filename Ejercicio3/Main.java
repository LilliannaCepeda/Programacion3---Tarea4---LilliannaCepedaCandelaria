package Ejercicio3;

import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

       try{

        ValidarEdad.valdiarEdad(scanner);
        System.out.println("Edad valida");
       }catch(EdadInvalidaException e){
         System.out.print(e.getMessage());
       }
        
    }

}