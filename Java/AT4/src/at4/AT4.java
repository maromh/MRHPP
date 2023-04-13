package at4;

import java.util.Scanner;


public class AT4 {

    public static void main(String[] args) {
        Scanner r =new Scanner(System.in);
        String nombre,apPat,apMat; 
        double a[],v=0.00;
        a=new double[5];
        System.out.println("Se calcularan las ventas del mes");
        for (int i=0;i<a.length;i++){
            System.out.println("Ingrese su nombre:");
            nombre=r.next();
            System.out.println("Ingrese su apellido paterno: ");
            apPat=r.next();
            System.out.println("Ingrese su apellido materno: ");
            apMat=r.next();
            System.out.println("Introduce la venta:");
            a[i]=r.nextFloat();
            v=v+a[i];
            System.out.println("La venta la esta realizando "+nombre+" "+ apPat+" "+apMat);
            System.out.println("La venta del dia "+(i+1)+" es:"+a[i]);
        }
        System.out.println("La venta del mes es:"+v);
    }
    
}
