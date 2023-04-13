
package operacionnewcuentapersona;

import java.util.Scanner;


public class OperacionNewCuentaPersona {

    
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        Cuenta c1=new Cuenta();
        System.out.println("Introduce el nombre del titular de la cuuenta");
        String nt=r.next();
        c1.settitular(nt);
        System.out.println("Introduce la cantidad de la cuenta");
        double c=r.nextDouble();
        c1.setcantidad(c);
        System.out.println("Introduce la cantidad para depositar");
        double dep=r.nextDouble();
        c1.depositar(dep);
        System.out.println("La cantidad actual es:"+c1.getcantidad());
        System.out.println("Introduce una cantidad para retirar:");
        c1.retirar();
        System.out.println("La cantidad actual es:"+c1.getcantidad());
        System.out.println(c1.mostrarString());
    }
    
}
