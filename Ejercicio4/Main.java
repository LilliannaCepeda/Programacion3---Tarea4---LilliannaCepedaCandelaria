package Ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do{
            try{

                System.out.println("==========CALCULADORA==========");
                System.out.println("1. Suma");
                System.out.println("2. resta");
                System.out.println("3. Multiplicacion");
                System.out.println("4. Division");
                System.out.println("5. Salir");
                System.out.println();

                System.out.print("Digite una opcion: ");
                opcion =scanner.nextInt();
                scanner.nextLine();

                switch(opcion){

                    case 1:
                        System.out.println("Resultado: "+ sumar(scanner));
                        break;
                    case 2:
                        System.out.println("Resultado: "+ restar(scanner));
                        break;
                    case 3:
                        System.out.println("Resultado: "+ multiplicar(scanner));
                        break;
                    case 4:
                        System.out.println("Resultado: "+ dividir(scanner));
                        break;

                    case 5:
                        System.out.println(("Saliendo..."));
                        break;
                    default:
                        System.out.println("Digite una opcion correcta");
                        break;
                }
            }
            catch(InputMismatchException e){
                System.out.println("Error: El valor debe ser numerico en este campo");
                scanner.nextLine();
            }
            
        catch(ArithmeticException e){
                System.out.println("Error: No es posible la division entre 0");
                scanner.nextLine();
            }
        }while (opcion != 5);

        scanner.close();
    }

        

    public static float sumar(Scanner scanner){

        float resultado;

        System.out.print("Digite el primer numero: ");
        float num1 = scanner.nextFloat();

        System.out.print("Digite el segundo numero: ");
        float num2 = scanner.nextFloat();

        resultado = num1 + num2;

        return resultado;
    }

    public static float restar(Scanner scanner){

        float resultado;

        System.out.print("Digite el primer numero: ");
        float num1 = scanner.nextFloat();

        System.out.print("Digite el segundo numero: ");
        float num2 = scanner.nextFloat();

        resultado = num1 - num2;

        return resultado;
    }

    public static float multiplicar(Scanner scanner){

        float resultado;

        System.out.print("Digite el primer numero: ");
        float num1 = scanner.nextFloat();

        System.out.print("Digite el segundo numero: ");
        float num2 = scanner.nextFloat();

        resultado = num1 * num2;

        return resultado;
    }

    public static float dividir(Scanner scanner){

        float resultado;

        System.out.print("Digite el primer numero: ");
        float num1 = scanner.nextFloat();

        System.out.print("Digite el segundo numero: ");
        float num2 = scanner.nextFloat();

        if(num2 == 0){
            throw new ArithmeticException();
        }
        resultado = num1 / num2;

        return resultado;
    }
}
