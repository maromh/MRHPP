
package at2;

import java.util.Scanner;
import java.util.Arrays;

public class AT2 {

    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int a[];
        a=new int[10];
        int b[];
        b=new int[10];
        int c [];
        c=new int[10];
        int ne;
        System.out.println("Ingrese los elementos del arreglo A:");
        for (int i=0;i<a.length;i++){
            a[i]=r.nextInt();
        }
        int ma,mi;
        ma=mi=a[0];
        for (int i=0;i<a.length;i++){
           if(a[i]>ma){
               ma=a[i];
           }
           if(a[i]<mi){
               mi=a[i];
           }
    }
        System.out.println("El valor minimo del arreglo A es:"+mi);
        System.out.println("Ingrese los elementos del arreglo B:");
        for (int i=0;i<b.length;i++){
            b[i]=r.nextInt();
        }
        int maa,mii;
        maa=mii=b[0];
        for (int i=0;i<b.length;i++){
           if(b[i]>maa){
               maa=b[i];
           }
           if(b[i]<mii){
               mii=b[i];
           }
    }
        System.out.println("El valor minimo del arreglo B es:"+mii);
        if(mi<mii){
            ne=mi;
            System.out.println("Se llenaran los elementos del arreglo C:");
            for (int i=0;i<c.length;i++){
            c[i]=mi;
        }
        }
        else if(mii<mi){
            ne=mii;
            System.out.println("Se llenaran los elementos del arreglo C:");
            for (int i=0;i<c.length;i++){
            c[i]=mii;
        }
        }
        System.out.println("Arreglo A"+Arrays.toString(a));
        System.out.println("Arreglo B"+Arrays.toString(b));
        System.out.println("Arreglo C"+Arrays.toString(c));
        
    }
    
}
