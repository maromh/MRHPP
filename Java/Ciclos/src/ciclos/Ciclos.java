
package ciclos;

public class Ciclos {

    
    public static void main(String[] args) {
        int contador=0;
        //do while:
        System.out.println("Do While");
        do{
            System.out.println(contador);
            //contador=contador+1;
            contador+=2;
            //contador++;
        }while(contador<10);
        //While:
        contador=0;
        System.out.println("While");
        while(contador<10){
            System.out.println(contador);
            //contador=contador+1;
            contador+= 2;
        }
        //for:
        System.out.println("For");
        for(contador=0;contador<10;contador+=2){
            System.out.println(contador);
        }
    }
    
}
