
package vehiculos;

import java.util.Scanner;


public class Vehiculos {

    static Vehiculo [] vehiculos;
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Introduce la velocidad:");
        int speed=r.nextInt();
        vehiculos[0].acelerar(speed);
    }
    
    public static void destruirVehiculo(Vehiculo vehiculo){
        System.out.println("Vehiculo enviado a desguezadero"+vehiculo.toString());
    }
    
    public String acelerar(int velocidad, Vehiculo vehiculo){
        return vehiculo.acelerar(velocidad);
    }
    
    public static void genera(){
        vehiculos=new Vehiculo[3];
        vehiculos[0]=new Auto();
        vehiculos[1]=new Moto();
        vehiculos[2]=new Auto();
    }
}
