
package areas;

import java.util.Scanner;


public class Areas {

    public static void main(String[] args) {
        int op;
        double n1,n2,cir,cu,rec,r;
        Scanner areas=new Scanner(System.in);
        System.out.println("Bienvendio al programa de calculo de areas:");
        System.out.println("Eliga una figura para calcular su area:");
        System.out.println("Presione 1 para calcular el area del cuadrado");
        System.out.println("Presione 2 para calcular el area del circulo");
        System.out.println("Presione 3 para calcular el area del rectangulo");
        System.out.println("Presione 4 para calcular el area del triangulo");
        System.out.println("Presione 5 para salir");
        op=areas.nextInt();
        switch(op){
            case 1:
                
                System.out.println("Introduzce el lado");
                n1=areas.nextDouble();
                r= (n1*4);
                System.out.println("El area del cuadrado es:"+r );
                break;
            case 2:
                System.out.println("Introduzce el radio");
                n1=areas.nextDouble();
                r=3.1416*n1*n1;
                System.out.println("El area del radio es:"+r );
                break;
            case 3:
                System.out.println("Introduzce la base");
                n1=areas.nextDouble();
                System.out.println("Introduzce la altura ");
                n2=areas.nextDouble();
                r=n1*n2;
                System.out.println("El area del rctangulo es:"+r );
                break;
            case 4:
                System.out.println("Introduzce la base");
                n1=areas.nextDouble();
                System.out.println("Introduzce la altura ");
                n2=areas.nextDouble();
                r=n1*n2/2;
                System.out.println("El area del triangulo es:"+r );
                break;
            default:
                System.out.println("Usted selecciono cancelar el proceso");
        }
    }
    
}
