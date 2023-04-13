
package bank;

import java.util.Scanner;

public class Bank {

    
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        Deposito d1=new Deposito();
        System.out.println("Introduce el titular del deposito");
        String td1=r.next();
        d1.setTitular(td1);
        System.out.println("Introduce la capital del deposito");
        double cd1=r.nextDouble();
        d1.setCapital(cd1);
        System.out.println("Introduce el plazo de dias del deposito");
        int pdd1=r.nextInt();
        d1.setPlazodias(pdd1);
        System.out.println("Introduce el interes del deposito");
        double tid1=r.nextDouble();
        d1.setTypeinteres(tid1);
        DepositoEstructurado de1= new DepositoEstructurado();
        System.out.println("Introduce el titular del deposito estructurado");
        String tde2=r.next();
        de1.setTitular(tde2);
        System.out.println("Introduce la capital del deposito es estructurado");
        double cde2=r.nextDouble();
        de1.setCapital(cde2);
        System.out.println("Introduce el plazo de dias del deposito estructurado");
        int pdde2=r.nextInt();
        de1.setPlazodias(pdde2);
        System.out.println("Introduce el interes del deposito estructurado");
        double tide2=r.nextDouble();
        de1.setTypeinteres(tide2);
        System.out.println("Introduce el capital extra del deposito estructurado");
        double cede2=r.nextDouble();
        de1.setCapitalextra(cede2);
        System.out.println("Introduce el interes extra del deposito estructurado");
        double tede2=r.nextDouble();
        de1.setInteresextra(tede2);
        System.out.println("Datos del deposito:");
        System.out.println(d1.mostrarDatos());
        System.out.println("Datos del deposito estructurado:");
        System.out.println(de1.mostrarDatos());
    }
    
}
