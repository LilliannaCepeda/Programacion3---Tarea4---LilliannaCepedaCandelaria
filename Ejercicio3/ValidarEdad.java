package Ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidarEdad {

    public static void valdiarEdad(Scanner scanner)throws EdadInvalidaException{

        try{

            System.out.print("Digite la edad: ");
            int edad = scanner.nextInt();

            if(edad < 18){
                throw new EdadInvalidaException("Error: debe ser mayor de edad ");
            }
        }catch(InputMismatchException e){

            throw new EdadInvalidaException("Error: La edad deben ser valores numericos");
        }
        
    }
    
}
