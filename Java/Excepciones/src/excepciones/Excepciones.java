
package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {
    public static int numerador=1;
    public static int denominador=0;
    public static float division;
    
    public static void main(String[] args) {
//        int x;
//        System.out.println("Antes de la división...");
//        try{
//        division=numerador/denominador;
//        }catch(ArithmeticException ex){
//         division=0;
//         System.out.println("Error:"+ex.getMessage());
//        }finally{
//        System.out.println("Resultado de la división:"+division);
//        System.out.println("Después de la división...");
//        }
          int x=0;
          Scanner r=new Scanner(System.in);
          System.out.println("Introduce un numero entero:");
          try{
              x=r.nextInt();
          }catch(InputMismatchException ex){
              System.out.println("Debe introducir un número entero "+ex.getMessage());
               r.nextInt();
          }finally{
              System.out.println("Numero tecleado:"+x);
          }
    }
    
}
