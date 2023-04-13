
package promedios;


public class Viernes10 {
    public static void main(String[] args){
        int x;
        double y;
        //Math.pow(x,3);Potencia
        //Math.sqrt(x);Raiz
        for(x=1;x<=50;x++){
            y=Math.pow(x,3)+2;
            if (y%2!=0){
                System.out.println("El numero x es:"+x);
                System.out.println("El función de y es:"+y);
            }
        }
            
    }
}
