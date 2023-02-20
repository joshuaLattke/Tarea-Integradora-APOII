package ui;
import java.util.Scanner;

public class Main{
 
         public static void main (String[] args){
        
            Scanner scanner = new Scanner(System.in);

            System.out.println("Seleccione una opción:");
            System.out.println(" 1. play");
            System.out.println("2. exit ");
            int opcion = scanner.nextInt();
            
            switch(opcion) {
                case 1:
                    play();
                    break;
                case 2:
                         System.out.println("Saliendo...");
                        System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
        public  static void play(){
            System.out.println("register player 1 ");

            System.out.println("register player 2 ");
            System.out.println("register player 3 ");
    
    }
}