/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zonamarina;

/**
 *
 * @author Hildeberto
 */
public class EmbarcacionesDeportivas extends Barcos {
    private double cv;

    public EmbarcacionesDeportivas(double cv, String matricula, double eslora, int añodefabricacion, String nombre, String DNI, int inicio, int fin, String posicion) {
        super(matricula, eslora, añodefabricacion, nombre, DNI, inicio, fin, posicion);
        this.cv = cv;
    }
    
    public EmbarcacionesDeportivas(){
    
    }
    
    /**
     * @return the cv
     */
    public double getCv() {
        return cv;
    }

    /**
     * @param cv the cv to set
     */
    public void setCv(double cv) {
        this.cv = cv;
    }
    
    @Override
    public double Alquiler(){
        return ((getFin()-getInicio())*365)*((10*getEslora()+getCv()))*(2);
    }
    
    @Override
    public String mostrarDatos(){
        return "Datos del barco:"+"\nMatricula del barco:"+getMatricula()+"\nEslora del barco"+getEslora()
        +"ms\nAño de fabricacion del barco:"+getAñodefabricacion()+"\nCV:"+getCv()+"\nDatos del alquiler:"+"\nNombre del cliente:"
        +getNombre()+"\nDNI del cliente:"+getDNI()+"\nAño de comienzo:"+getInicio()+"\nAño de fin:"+getFin()+"\nCosto del alquiler"
        +Alquiler()+"\nUsted alquilara una embarcacion deportiva";
    }
}
