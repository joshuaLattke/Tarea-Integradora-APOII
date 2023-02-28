package ui;
import java.util.Scanner;

public class Main{
 
    public static     Scanner sc = new Scanner(System.in);
         public static void main (String[] args){
            
            System.out.println("Select an option:");
            System.out.println(" 1. play");
            System.out.println("2. exit ");
            int opcion = sc.nextInt();
            
            switch(opcion) {
                case 1:
                    play();
                    break;
                case 2:
                         System.out.println("going out...");
                         System.exit(0);
                    break;
                default:
                    System.out.println("option not valid");
                    break;
            }
        }
            public static   void play(){
           System.out.println("enter row number ");

             int row= sc.nextInt();

           System.out.println("enter the column number ");

           int  column=sc.nextInt();

    }
}