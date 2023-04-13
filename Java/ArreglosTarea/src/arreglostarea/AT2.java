/*
Leer dos arreglos A y B de dimensión 10. Generar un tercer arreglo C de 10 elementos,
donde la componente C[i] sea igual al mínimo valor de A[i] y B[i]. 
Mostrar los tres arreglos
*/
package arreglostarea;

import java.util.Scanner;
import java.util.Arrays;

public class AT2 {
    
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int a [];
        a=new int[10];
        int b [];
        b=new int[10];
        System.out.println("Ingrese los elementos del arreglo A:");
        for (int i=0;i<a.length;i++){
            a[i]=r.nextInt();
        }
        int ma,mi;
        ma=mi=a[10];
        for (int i=0;i<a.length;i++){
           if(a[i]>ma){
               ma=a[i];
           }
           if(a[i]<mi){
               mi=a[i];
           }
    }
        System.out.println("El valor minimo del arreglo A es:"+mi);
        
}
}
