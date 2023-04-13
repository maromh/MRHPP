
package excepciones;

import java.util.Scanner;
import java.lang.NumberFormatException;
import java.lang.ArithmeticException;

public class Excepciones2 {
    public static void main(String[]args){
     Scanner leer=new Scanner(System.in);
     String num1=" 12",num2="0", resultado="";
     int numerador, denominador, cociente=0;
     try{
     numerador=Integer.parseInt(num1);
     denominador=Integer.parseInt(num2);
     cociente=numerador/denominador;
     }catch(java.lang.NumberFormatException ex){
         System.out.println("El formato del numero es incorrecto");
         System.out.println("Introduce el numerador del tipo entero:");
         numerador=leer.nextInt();
         denominador=0;
         cociente=numerador/denominador;
         try{
            System.out.println("Error:"+ex);
            System.out.println("Introduce el numerador del tipo entero:");
            numerador=leer.nextInt();
            System.out.println("Introduce el denominador del tipo entero:");
            denominador=leer.nextInt();
            cociente=numerador/denominador;
         }catch(java.lang.ArithmeticException ex2){
            System.out.println("No se puede dividir entre cero");
            System.out.println("Error:"+ex);
            System.out.println("Introduce el numerador del tipo entero:");
            numerador=leer.nextInt();
            System.out.println("Introduce el denominador del tipo entero:");
            denominador=leer.nextInt();
            cociente=numerador/denominador;
         }
         //denominador=Integer.parseInt(num1);
         //cociente=numerador/denominador;
     }
     finally{
//         System.out.println("Introduce el numerador del tipo entero:");
//         numerador=leer.nextInt();
//         System.out.println("Introduce el denominador del tipo entero:");
//         denominador=leer.nextInt();
//         cociente=numerador/denominador;
           System.out.println("Introduce el numerador del tipo entero:");
           numerador=leer.nextInt();
           System.out.println("Introduce el denominador del tipo entero:");
           denominador=leer.nextInt();
           cociente=numerador/denominador;
           System.out.println("El cociente es:"+cociente);
         
     }
     //denominador=Integer.parseInt(num2);
     
     resultado=String.valueOf(cociente);
     System.out.println("El resultado es:"+resultado);
    }
}
