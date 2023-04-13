package radianes;

import java.util.Scanner;

public class Radianes {

    public static void main(String[] args) {
        System.out.println("Introduzca los grados a calcular");
        Scanner leer=new Scanner(System.in);
        int g,g2=180;
        g=leer.nextInt();
        System.out.println("Tus grados actuales son:"+g+"/"+g2);
        do {
            if (g%2==0 && g%2==0){
                g=g/2;
                g2=g2/2;
            }
            else if (g%3==0 && g%3==0){
                g=g/3;
                g2=g2/3;
            }
            else if (g%4==0 && g%4==0){
                g=g/4;
                g2=g2/4;
            }
            else if (g%5==0 && g%5==0){
                g=g/5;
                g2=g2/5;
            }
            else if (g%6==0 && g%6==0){
                g=g/6;
                g2=g2/6;
            }
            else if (g%7==0 && g%7==0){
                g=g/7;
                g2=g2/7;
            }
            else if (g%8==0 && g%8==0){
                g=g/8;
                g2=g2/8;
            }
            else if (g%9==0 && g%9==0){
                g=g/9;
                g2=g2/9;
            }
            else if (g%10==0 && g%10==0){
                g=g/10;
                g2=g2/10;
            }
        }while((g%2==0 && g2%2==0)||(g%3==0 && g2%3==0)||(g%4==0 && g2%4==0)||(g%5==0 && g2%5==0)
               ||(g%6==0 && g2%6==0)||(g%7==0 && g2%7==0)||(g%8==0 && g2%8==0)||(g%9==0 && g2%9==0)||(g%10==0 && g2%10==0));
        
        if (g==g2) {
            System.out.println("Tus grados son:π");
        }
        else
            System.out.println("Tus grados son:"+g+"/"+g2+"π");
}
}