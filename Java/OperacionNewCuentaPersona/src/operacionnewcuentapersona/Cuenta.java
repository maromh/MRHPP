
package operacionnewcuentapersona;

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
    
    public void settitular(String titc){
        titular=titc;
    }
    
    public String gettitular(){
        return titular;
    }
    
    public void setcantidad(double canc){
        cantidad=canc;
    }
    
    public double getcantidad(){
        return cantidad;
    }
    
    public void depositar(double depcant){
        if(depcant<0){
            System.out.println("No puedes hacer ese deposito");
            cantidad=cantidad+0;
        }
        else{
            cantidad=cantidad+depcant;
        }
    }
    
    public double retirar(){
        double retcant=r.nextDouble();
        if(cantidad<retcant){
            cantidad=0;
        }
        else{
            cantidad=cantidad-retcant;
        }
        return cantidad;
    }
    
    public String mostrarString(){
        return "El titular "+titular+" tiene $"+ cantidad +" pesos en la cuenta";
    }
}
