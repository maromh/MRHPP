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
public class YajesDeLujo extends Barcos {
    private double cv;
    private int camarotes;

    public YajesDeLujo(double cv, int camarotes, String matricula, double eslora, int añodefabricacion, String nombre, String DNI, int inicio, int fin, String posicion) {
        super(matricula, eslora, añodefabricacion, nombre, DNI, inicio, fin, posicion);
        this.cv = cv;
        this.camarotes = camarotes;
    }
    
    public YajesDeLujo(){
    
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

    /**
     * @return the camarotes
     */
    public int getCamarotes() {
        return camarotes;
    }

    /**
     * @param camarotes the camarotes to set
     */
    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }
    
    @Override
    public double Alquiler(){
        return ((getFin()-getInicio())*365)*(((10*getEslora())+(getCv()+getCamarotes())))*(2);
    }
    
    @Override
    public String mostrarDatos(){
        return "Datos del barco:"+"\nMatricula del barco:"+getMatricula()+"\nEslora del barco"+getEslora()
        +"ms\nAño de fabricacion del barco:"+getAñodefabricacion()+"\nCV:"+getCv()+
        "\nNumero de camarotes"+getCamarotes()+"\nDatos del alquiler:"+"\nNombre del cliente:"
        +getNombre()+"\nDNI del cliente:"+getDNI()+"\nAño de comienzo:"+getInicio()+"\nAño de fin:"+getFin()+"\nCosto del alquiler:"
        +Alquiler()+"\nUsted alquilara un yate de lujo";
    }
}
