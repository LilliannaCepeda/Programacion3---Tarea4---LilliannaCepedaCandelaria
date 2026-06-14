package Ejercicio5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int opcion;

        do{
            System.out.println("============REGISTRO DE ACTIVIDADES============");
            System.out.println("===============================================");
            System.out.println();
            System.out.println("1. Agregar Actividad");
            System.out.println("2. Lista de activiades");
            System.out.println("3. Salir\n");
            System.out.print("Seleciona una opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch(opcion){

                case 1:
                    agregarActividad(scanner);
                    break;
                case 2: 
                    mostrarActividades();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Selecciona una opcion valida");
                    break;

            }
        }while(opcion != 3);
    }

    public static void agregarActividad(Scanner scanner){

        try{
            FileWriter fileWriter = new FileWriter("Actividades.txt", true);

            System.out.println("\n========Agregar Actividad========");
            System.out.print("\nIngrese la actividad: ");
            String nombreActividad = scanner.nextLine();

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(nombreActividad);
            bufferedWriter.newLine();
            bufferedWriter.close();

            System.out.println("Actividad agregada correctamente");
            System.out.println();

        }catch(Exception e){
             System.out.print("Error: " + e.getMessage());
        }
    }

    public static void mostrarActividades(){

        try{

            FileReader fileReader = new FileReader("Actividades.txt");
            String nombreActividad;

            System.out.println("========Lista De Actividades========");

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((nombreActividad = bufferedReader.readLine()) != null){

                System.out.println(nombreActividad);
            }

            bufferedReader.close();
            
        }catch(Exception e){

            System.out.println("Error: " + e.getMessage());
        }
    }
}
