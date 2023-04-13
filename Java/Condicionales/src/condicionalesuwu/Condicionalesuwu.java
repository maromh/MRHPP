
package condicionalesuwu;

import java.util.Scanner;


public class Condicionalesuwu {

    public static void main(String[] args) {
        int n,v,s;
        s=0;
        System.out.println("Introduzca la cantidad de numeros");
        Scanner xdxd=new Scanner(System.in);
        n = xdxd.nextInt();
        for(int r=0;r<n;r++){
            System.out.println("Dame un numero");
            v=xdxd.nextInt();
            if(v<0){
               System.out.println("Se equivoco");
            }
            else if(v>=0 && v<33){
               s=s+v;
               System.out.println("Se sumara el numero");
            }
            else if(v>=33 && v<=132){
                 System.out.println("El caracter es:"+(char)v);
                 char op=(char)v;
                 switch(op){
                     case 'a':
                        System.out.println("Esto es una vocal");
                        break;
                     case 'e':
                        System.out.println("Esto es una vocal");
                        break;
                     case 'i':
                        System.out.println("Esto es una vocal");
                        break;
                     case 'o':
                        System.out.println("Esto es una vocal");
                        break;
                     case 'u':
                        System.out.println("Esto es una vocal");
                        break;
                     default:
                        System.out.println("Esto no es una vocal");
                 }
            }
            else if(v>132){
                System.out.println("Te pasaste del limite");
            }
        }
            System.out.println("La suma es:"+s);
    }
    
}
