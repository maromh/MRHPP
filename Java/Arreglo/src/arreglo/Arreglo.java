package arreglo;

import java.util.Arrays;
import java.util.Scanner;

public class Arreglo {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int arreglo[];
        int tam;
        System.out.println("Ingrese el tamaño del arreglo:");
        tam=leer.nextInt();
        arreglo=new int[tam];//Se inicializa el arreglo con el tamaño
        for(int i=0;i<tam;i++){
            System.out.println("Ingrese numero");
            arreglo[i]=leer.nextInt();
        }
        System.out.println(Arrays.toString(arreglo));
        int suma=0;
        for (int i=0;i<arreglo.length;i++){
            suma +=arreglo[i];
        }
        System.out.println("La suma es: "+suma);
        double promedio=suma/tam;
        System.out.println("El promedio es:"+promedio);
        int mayor,posicion;
        mayor=arreglo[0];
        posicion=0;
        for (int i=1;i<arreglo.length;i++){
            if (arreglo[i]>mayor){
                mayor=arreglo[i];
                posicion=i;
            }
        }
        System.out.println("El numero mayor es el "+mayor+" "
        +" y se encuentra en la posicion "+posicion);
    }
    
}
