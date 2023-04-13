
package vehiculos;


public class Auto implements Vehiculo {
    int velocidad=0;
    
    @Override
    public String frenar(int velocidad){
        this.velocidad=this.velocidad-velocidad;
        return "El auto bajó la velocidad y ahora va"+this.velocidad+" kms/h";
    }
    
    @Override
    public String acelerar(int velocidad){
        String cadena="";
        this.velocidad=this.velocidad+velocidad;
        if(this.velocidad>Velocidad_MAX){
            cadena="Exceso de velocidad .";
        }
        cadena=cadena+"El auto aceleró y va a "+this.velocidad+" kms/h";
        return cadena;
    }
}
