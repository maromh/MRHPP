
package zonamarina;

import java.util.Scanner;


public class ZonaMarina {

    
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        Veleros b2=new Veleros();
        System.out.println("Introduce los datos del velero:");
        System.out.println("Introudce la matricula del velero:");
        String matb2=r.next();
        b2.setMatricula(matb2);
        System.out.println("Introduce la eslora del velero:");
        double eslm2=r.nextDouble();
        b2.setEslora(eslm2);
        System.out.println("Introduce el año de fabricacion del velero:");
        int afb2=r.nextInt();
        b2.setAñodefabricacion(afb2);
        System.out.println("Introudce el nombre del cliente del velero:");
        String ndcb2=r.next();
        b2.setNombre(ndcb2);
        System.out.println("Introudce el DNI del cliente del velero:");
        String dnib2=r.next();
        b2.setDNI(dnib2);
        System.out.println("Introduce el año de inicio del alquiler del velero:");
        int aib2=r.nextInt();
        b2.setInicio(aib2);
        System.out.println("Introduce el año de fin del alquiler del velero:");
        int afib2=r.nextInt();
        b2.setFin(afib2);
        System.out.println("Introudce la posicion del alquiler del velero:");
        String pab2=r.next();
        b2.setPosicion(pab2);
        System.out.println("Introduce el numero de vastiles del velero:");
        int nvv=r.nextInt();
        b2.setNm(nvv);
        EmbarcacionesDeportivas b3=new EmbarcacionesDeportivas();
        System.out.println("Introduce los datos de la embarcacion deportiva:");
        System.out.println("Introudce la matricula de la embarcacion deportiva:");
        String matb3=r.next();
        b3.setMatricula(matb3);
        System.out.println("Introduce la eslora de la embaracion deportiva:");
        double eslm3=r.nextDouble();
        b3.setEslora(eslm3);
        System.out.println("Introduce el año de fabricacion de la embarcacion deportiva:");
        int afb3=r.nextInt();
        b3.setAñodefabricacion(afb3);
        System.out.println("Introudce el nombre del cliente de la embarcacion deportiva:");
        String ndcb3=r.next();
        b3.setNombre(ndcb3);
        System.out.println("Introudce el DNI del cliente de la embarcacion deportiva:");
        String dnib3=r.next();
        b3.setDNI(dnib3);
        System.out.println("Introduce el año de inicio del alquiler de la embarcacion deportiva:");
        int aib3=r.nextInt();
        b3.setInicio(aib3);
        System.out.println("Introduce el año de fin del alquiler de la embarcacion deportiva:");
        int afib3=r.nextInt();
        b3.setFin(afib3);
        System.out.println("Introduce la posicion del alquiler de la embarcacion deportiva:");
        String pab3=r.next();
        b3.setPosicion(pab3);
        System.out.println("Introduce el CV de la embarcacion deportiva:");
        double cvb3=r.nextDouble();
        b3.setCv(cvb3);
        YajesDeLujo b4=new YajesDeLujo();
        System.out.println("Introduce los datos del yate de lujo:");
        System.out.println("Introudce la matricula del yate de lujo:");
        String matb4=r.next();
        b4.setMatricula(matb4);
        System.out.println("Introduce la eslora del yate de lujo:");
        double eslm4=r.nextDouble();
        b4.setEslora(eslm4);
        System.out.println("Introduce el año de fabricacion del yate de lujo::");
        int afb4=r.nextInt();
        b4.setAñodefabricacion(afb4);
        System.out.println("Introudce el nombre del cliente del yate de lujo:");
        String ndcb4=r.next();
        b4.setNombre(ndcb4);
        System.out.println("Introudce el DNI del cliente del yate de lujo:");
        String dnib4=r.next();
        b4.setDNI(dnib4);
        System.out.println("Introduce el año de inicio del alquiler del yate de lujo:");
        int aib4=r.nextInt();
        b4.setInicio(aib4);
        System.out.println("Introduce el año de fin del alquiler del yate de lujo:");
        int afib4=r.nextInt();
        b4.setFin(afib4);
        System.out.println("Introudce la posicion del alquiler del yate de lujo:");
        String pab4=r.next();
        b4.setPosicion(pab4);
        System.out.println("Introduce el CV del yate de lujo:");
        double cvb4=r.nextDouble();
        b4.setCv(cvb4);
        System.out.println("Introduce el numero de camarotes:");
        int ncb4=r.nextInt();
        b4.setCamarotes(ncb4);
        System.out.println(b2.mostrarDatos());
        System.out.println(b3.mostrarDatos());
        System.out.println(b4.mostrarDatos());
    }
    
}
