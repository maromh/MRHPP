/**
 * Se ingresa por teclado la cantidad de agua caída, en milímetros día a día durante un mes. 
 * Se pide determinar el día de mayor lluvia, el de menor y el promedio.
 */
package arreglostarea;

import java.util.Scanner;
import java.util.Arrays;

public class ArreglosTarea {

    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        double ml[], t=0,p;
        ml=new double[30];
        System.out.println("Se calculara el agua caida por milimetros por dia hasta un mes");
        System.out.println("Ingrese la cantidades por agua:");
        for (int i=0;i<ml.length;i++){
            
            ml[i]=r.nextFloat();
            t=t+ml[i];
        }
        double ma,mi;
        ma=mi=ml[10];
        for (int i=0;i<ml.length;i++){
           if(ml[i]>ma){
               ma=ml[i];
           }
           if(ml[i]<mi){
               mi=ml[i];
           }
        }
        p=t/30;
        System.out.println("El total es:"+t);
        System.out.println("El promedio es:"+p);
        System.out.println("El dia con mayor cantidad registro:"+ma+" milimetros");
        System.out.println("El dia con menor cantidad registro:"+mi+" milimetros");
    }
    
}
