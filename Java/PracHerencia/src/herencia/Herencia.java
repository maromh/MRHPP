package herencia;

import java.util.Scanner;


public class Herencia {


    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("Ingrese nombre del alumno:");
        String nombrea=r.next();
        
        System.out.println("Ingrese edad del alumno:");
        int edada=r.nextInt();
        
        System.out.println("Ingrese sexo del alumno:");
        char sexoa=r.next().charAt(0);
        
        System.out.println("Ingrese peso del alumno:");
        double pesoa=r.nextDouble();
        
        System.out.println("Ingrese altura del alumno:");
        double alturaa=r.nextDouble();
        
        System.out.println("Ingrese tipo de sangre del alumno");
        String nocontrola=r.next();
        
        System.out.println("Ingrese tipo de sangre del alumno");
        String tiposangrea=r.next();
        
        System.out.println("Ingrese CURP del alumno");
        String curpa=r.next();
        
        System.out.println("Ingrese NSS del alumno");
        String nssa=r.next();
        
        Alumno mara=new Alumno(nombrea,edada,sexoa,pesoa,alturaa,tiposangrea,curpa,nssa);
        
        System.out.println(mara.mostrarDatos());
        
    }
    
}
