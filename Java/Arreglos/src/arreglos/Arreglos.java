
package arreglos;

import java.util.Scanner;


public class Arreglos {

    
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        double arr1[]={1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9,10.10,11.11,12.12,13.13,14.14,15.15,16.16,17.17,18.18,19.19,20.20};
        int arr2[]=new int [arr1.length];
        String arr3[]=new String[arr1.length];
        for (int i=0; i<arr2.length; i++) {
            arr2[i]=(int) arr1[arr1.length-i-1];
        }
        
        int par=0, impar=1;
        for (int i=0;i<arr1.length;i++){
            if(i%2==0){
                arr3[impar]=Double.toString(arr1[i]);
                impar+=2;
            }
            else{
                arr3[par]=Double.toString(arr1[i]);
                par+=2;
            }
        }
        System.out.print("Arreglo 1:");
        for (int i=0; i<arr1.length;i++){
        System.out.print(arr1[i]+", ");
        }
        System.out.println("");
        System.out.print("Arreglo 2:");
        for (int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+", ");
        }
        System.out.println("");
        System.out.print("Arreglo 3:");
        for (int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+", ");
        }
    }
    
}
