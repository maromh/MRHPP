
package operacioncuentapersona;

import java.util.Scanner;

public class Cuenta {
    Scanner r=new Scanner(System.in);
    private String titular;
    private double cantidad;
    
    public Cuenta(){
        titular="";
        cantidad=0.0;
    }
    
    public Cuenta(String tit1, double cant1){
        titular=tit1;
        cantidad=cant1;
    }
    
    public void settitular(String tituc){
        titular=tituc;
    }
    
    public String gettitular(){
        return titular;
    }
    
    public void setcantidad(double cantc){
        cantidad=cantc;
    }
    
    public double getcantidad(){
        return cantidad;
    }
    
    public double depositar(){
        System.out.println("Introduce una cantidad para depositar:");
        double depcant=r.nextDouble();
        if(depcant<0){
            System.out.println("Lo sentimos no podemos realizar esa operacion:");
            cantidad=cantidad+0;
        }
        else{
            cantidad=cantidad+depcant;
        }
        return cantidad;
    }
    
    public double retirar(){
        System.out.println("Introduce una cantidad para retirar:");
        double retcant=r.nextDouble();
        if(cantidad<retcant){
            System.out.println("Lo sentimos no podemos realizar esa operacion:");
            cantidad=cantidad-0;
        }
        else{
            cantidad=cantidad-retcant;
        }
        return cantidad;
    }
    
    public String mostrarString(){
        return "El titular"  + "tiene" + cantidad + " pesos en la cuenta";
    }
}
