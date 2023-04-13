package at3;

import java.util.Arrays;
import java.util.Scanner;

public class AT3 {

    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int a[],p1,p2,aux;
        a=new int[10];
        System.out.println("Ingrese los 10 numeros");
        for (int i=0;i<a.length;i++){
            a[i]=r.nextInt();
        }
        System.out.println("Arreglo original:"+Arrays.toString(a));
        System.out.println("Escriba las posiciones que quiera reemplazar");
        p1=r.nextInt();
        p2=r.nextInt();
        aux=a[p1];
        a[p1]=a[p2];
        a[p2]=aux;
        System.out.println("Arreglo nuevo:"+Arrays.toString(a));
    }
    
}
