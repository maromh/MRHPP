
package arreglos3;

import java.util.Random;
import java.util.Scanner;


public class Arreglos3 {

    
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        Random n= new Random();
        double a[];
        double b[];
        double c[];
        double proa=0;
        double sumaa=0;
        double prob=0;
        double sumab=0;
        double proc=0;
        double sumac=0;
        System.out.println("¿Cuál es el tamaño de los arreglos A, B, y C?");
        int tam=leer.nextInt();
        a=new double[tam];
        b=new double[tam];
        c=new double[tam];
        
        for (int i=0;i<a.length;i++){
            a[i]=n.nextInt(101);
        }
        
        for (int i=0;i<b.length;i++){
            b[i]=n.nextInt(101);
        }
        
        System.out.println("¿Que operacion deseas que se realize?");
        char op=leer.next().charAt(0);
        switch (op){
            case '+':
                for (int i=0;i<c.length;i++){
                    c[i]=a[i]+b[i];
            }
            break;
            case '-':
                for (int i=0;i<c.length;i++){
                    c[i]=a[i]-b[i];
            }
            break;
            case '*':
                for (int i=0;i<c.length;i++){
                    c[i]=a[i]*b[i];
            }
            break;
            case '/':
                for (int i=0;i<c.length;i++){
                    c[i]=a[i]/b[i];
            }
            break;
            default:
                System.out.println("Lo sentimos pero no introdujo un caracter correcto");
                break;
        }
        for (int i=0;i<a.length;i++){
            sumaa=sumaa+a[i];
        }
        proa=sumaa/a.length;
        
        for (int i=0;i<b.length;i++){
            sumab=sumab+b[i];
        }
        prob=sumab/b.length;
        
        for (int i=0;i<c.length;i++){
            sumac=sumac+c[i];
        }
        proc=sumac/c.length;
        
        System.out.print("Arreglo A:");
        for (int i=0; i<a.length;i++){
        System.out.print(a[i]+", ");
        }
        System.out.println("");
        System.out.println("El promedio del arreglo A es:"+proa);
        System.out.print("Arreglo B:");
        for (int i=0;i<b.length;i++){
            System.out.print(b[i]+", ");
        }
        System.out.println("");
        System.out.println("El promedio del arreglo B es:"+prob);
        System.out.print("Arreglo C:");
        for (int i=0;i<c.length;i++){
            System.out.print(c[i]+", ");
        }
        System.out.println("");
        System.out.println("El promedio del arreglo C es:"+proc);
        
    }
    
}
