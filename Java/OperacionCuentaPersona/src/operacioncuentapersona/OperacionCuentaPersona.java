
package operacioncuentapersona;

import java.util.Scanner;


public class OperacionCuentaPersona {

    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        Persona p1=new Persona();
        System.out.println("Introduce el nombre de la primera persona");
        String nomp1=r.next();
        p1.setnombre(nomp1);
        System.out.println("Introduce la edad de la primera persona");
        int edp1=r.nextInt();
        p1.setedad(edp1);
        System.out.println("Introduce el RFC de la primera persona");
        String rfcp1=r.next();
        p1.setRFC(rfcp1);
        System.out.println("Se obtendra automaticamente el DNI");
        p1.generaDNI();
        System.out.println("Introduce el sexo de la primera persona");
        char sexop1=r.next().charAt(0);
        p1.setsexo(sexop1);
        System.out.println("Introudce el peso de la primera persona");
        double pesop1=r.nextDouble();
        p1.setpeso(pesop1);
        System.out.println("Introduce la altura de la primera persona:");
        double alturap1=r.nextDouble();
        p1.setaltura(alturap1);
        Persona p2=new Persona();
        System.out.println("Introduce el nombre de la segunda persona");
        String nomp2=r.next();
        p2.setnombre(nomp2);
        System.out.println("Introduce la edad de la segunda persona");
        int edp2=r.nextInt();
        p2.setedad(edp2);
        System.out.println("Introduce el RFC de la segunda persona");
        String rfcp2=r.next();
        p2.setRFC(rfcp2);
        System.out.println("Se obtendra automaticamente el DNI");
        p2.generaDNI();
        System.out.println("Introduce el sexo de la segunda persona");
        char sexop2=r.next().charAt(0);
        p2.setsexo(sexop2);
        Persona p3=new Persona();
        p3.setnombre("Beethoven");
        p3.setedad(18);
        p3.setRFC("HMR123");
        p3.generaDNI();
        p3.setsexo('M');
        p3.setpeso(70.0);
        p3.setaltura(1.70);
        System.out.println("El nombre de la primera persona es:"+p1.getnombre());
        System.out.println("La edad de la primera persona es:"+p1.getedad());
        p1.esMayordeedad();
        if(p1.esMayordeedad()==true){
            System.out.println("Es mayor de edad");
        }
        else {
            System.out.println("No es mayor de edad");
        }
        System.out.println("El RFC de la primera persona es:"+p1.getRFC());
        System.out.println("El DNI de la primera persona es:"+p1.getDNI());
        p1.comprobarsexo();
        System.out.println("El sexo de la primera persona es:"+p1.getsexo());
        System.out.println("El peso de la primera persona es:"+p1.getpeso());
        System.out.println("La altura de la primera persona es:"+p1.getaltura());
        if (p1.calcularIMC()<=25){
         System.out.println("Tiene el peso ideal, su IMC es "+p1.calcularIMC());
        }
        else{
            System.out.println("No Tiene el peso ideal, su IMC es "+p1.calcularIMC());
        }
        
        
        
        System.out.println(p1.devolverdata());
        System.out.println("El nombre de la segunda persona es:"+p2.getnombre());
        System.out.println("La edad de la segunda persona es:"+p2.getedad());
        if(p2.esMayordeedad()==true){
            System.out.println("Es mayor de edad");
        }
        else {
            System.out.println("No es mayor de edad");
        }
        System.out.println("El RFC de la seguna persona es:"+p2.getRFC());
        System.out.println("El DNI de la segunda persona es:"+p2.getDNI());
        p2.comprobarsexo();
        System.out.println("El sexo de la segunda persona es:"+p2.getsexo());
        System.out.println("La segunda persona "+p2.getnombre()+" no tiene IMC porque no se le pide su altura y peso");
        System.out.println(p2.devolverdata());
        System.out.println("El nombre de la tercera persona es:"+p3.getnombre());
        System.out.println("La edad de la tercera persona es:"+p3.getedad());
        if(p3.esMayordeedad()==true){
            System.out.println("Es mayor de edad");
        }
        else {
            System.out.println("No es mayor de edad");
        }
        System.out.println("El RFC de la tercera persona es:"+p3.getRFC());
        System.out.println("El DNI de la tercera persona es:"+p3.getDNI());
        p3.comprobarsexo();
        System.out.println("El sexo de la tercera persona es:"+p3.getsexo());
        System.out.println("El peso de la tercera persona es:"+p3.getpeso());
        System.out.println("La altura de la tercera persona es:"+p3.getaltura());
        if (p3.calcularIMC()<=25){
         System.out.println("Tiene el peso ideal, su IMC es "+p3.calcularIMC());
        }
        else{
            System.out.println("No tiene el peso ideal, su IMC es"+p3.calcularIMC());
        }
        System.out.println(p3.devolverdata());
    }
    
}
