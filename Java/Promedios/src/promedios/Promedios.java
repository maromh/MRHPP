
package promedios;

import java.util.Scanner;


public class Promedios {

    public static void main(String[] args) {
        double pm,ph,c;
        int p,em,eh,tp,tm=0,th=0,s,sh=0,sm=0;
        boolean con;
        System.out.println("Introduce el numero de alumnos en el grupo:");
        Scanner read=new Scanner(System.in);
        p=read.nextInt();
        System.out.println("Presione solo 1 para obtener la edad de un hombre");
        System.out.println("Presione otro numero o character para obtener la edad de una mujer");
        for(c=0;c<p;c++){
            s=read.nextInt();
            if(s==1){
               System.out.println("Introduzca la edad del hombre");
               eh=read.nextInt();
               sh++;
               th=th+eh;
            }
            else {
                System.out.println("Introduzca la edad de la mujer");
                em=read.nextInt();
                sm++;
                tm=tm+em;
            }
        }
        pm=tm/sm;
        ph=th/sh;
        System.out.println("El total de personas es: "+p);
        System.out.println("El total de hombres es : "+sm);
        System.out.println("El total de mujeres es : "+sh);
        System.out.println("El promedio de edad de los hombres es : "+ph);
        System.out.println("El promedio de edad de las mujeres es : "+pm);
        
    }
}
