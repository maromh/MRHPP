
package operacioncuentapersona;

import java.util.Random;
import java.util.Scanner;

public class Persona {
    Scanner r=new Scanner(System.in);
    private String nombre, rfc,dni;
    private char sexo;
    private int edad;
    private double peso, altura;
    
    
    public Persona(){
        nombre="";
        edad=0;
        rfc="";
        dni="DNI";
        sexo='M';
        peso=0.0;
        altura=0.0;
    }
    
    public Persona(String nom1, int edad1, String rfc1, String dni1, char sex1, double pes1, double alt1){
        nombre=nom1;
        edad=edad1;
        rfc=rfc1;
        dni=dni1;
        sexo=sex1;
        peso=pes1;
        altura=alt1;
    }
    
    public void setnombre(String nomp){
        nombre=nomp;
    }
    
    public String getnombre(){
        return nombre;
    }
    
    public void setedad(int edadp){
        edad=edadp;
    }
    
    public int getedad(){
        return edad;
    }
    
    public void setRFC(String rfcp){
        rfc=rfcp;
    }
    
    public String getRFC(){
        return rfc;
    }
    
    public void setDNI(String dnip){
        dni=dnip;
    }
    
    public String getDNI(){
        return dni;
    }
    
    public void setsexo(char sexop){
        sexo=sexop;
    }
    
    public char getsexo(){
        return sexo;
    }
    
    public void setpeso(double pesop){
        peso=pesop;
    }
    
    public double getpeso(){
        return peso;
    }
    
    public void setaltura(double alturap){
        altura=alturap;
    }
    
    public double getaltura(){
        return altura;
    }
    
    public double calcularIMC(){
        double imc;
        imc=(peso)/(altura*altura);
        return imc;
    }
    
    public boolean esMayordeedad(){
        boolean mde;
        if(edad>=18){
            mde=true;
        }
        else{
            mde=false;
        }
        return mde;
    }
    
    public char comprobarsexo(){
        System.out.println("¿Tu sexo es correcto?");
        System.out.println("Oprime 1 para no");
        System.out.println("Oprime otro numero para si");
        int op=r.nextInt();
        if(op==1){
            sexo='H';
        }
        else{
            
        }
        return sexo;
    }
    
    public String devolverdata(){
        return "El nombre es:"+nombre+"/La edad es:"+edad+"/El rfc es:"+rfc+"/El dni es:"+dni+"/El sexo es:"+sexo+
                "/El peso es:"+peso+"/La altura es:"+altura;
    }
    
    public String generaDNI(){
//        String numeros="0123456789";
//        String letras="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char []num={'0','1','2','3','4','5','6','7','8','9'};
        char []l={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char[] conjunto=new char[9];
        String ndni;
        for (int i=0;i<9;i++){
            if(i==8){
                conjunto[i]=nombre.charAt(0);
            }
            else{
                conjunto[i]=num[(int)(Math.random()*10)];
            }
            ndni=new String(conjunto);
            dni=ndni;
        }
        return dni;
    }
    
//    public int caluclarIMC(){
//        imc=peso/(altura*altura);
//        if(imc<20){
//            return
//        }
//    }
    
      public void comprobarSexo(char sex){
          if(sex=='H'||sex=='M'){
              sexo=sex;
          }
          else{
              sexo='H';
          }
      }
      
      public void generateDNI(){
          Random r=new Random();
          String dni2="";
          for (int i=0;i<9;i++){
              if (i==8){
              dni2+=(char)r.nextInt(10);
              }
              else{
                  char x=nombre.charAt(0);
              }
          }
          
      }
}
