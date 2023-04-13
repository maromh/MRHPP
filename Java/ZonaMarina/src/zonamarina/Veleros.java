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
public class Veleros extends Barcos {
    private int nm;

    public Veleros(int nm, String matricula, double eslora, int añodefabricacion, String nombre, String DNI, int inicio, int fin, String posicion) {
        super(matricula, eslora, añodefabricacion, nombre, DNI, inicio, fin, posicion);
        this.nm = nm;
    }
    
    public Veleros(){
    
    }
    /**
     * @return the nm
     */
    public int getNm() {
        return nm;
    }

    /**
     * @param nm the nm to set
     */
    public void setNm(int nm) {
        this.nm = nm;
    }
    
    @Override
    public double Alquiler(){
        return ((getFin()-getInicio())*365)*(((10*getEslora()+getNm())))*(2);
    }
    
    @Override
    public String mostrarDatos(){
        return "Datos del barco:"+"\nMatricula del barco:"+getMatricula()+"\nEslora del barco"+getEslora()
        +"ms\nAño de fabricacion del barco:"+getAñodefabricacion()+"\nNumero de vastiles:"+getNm()+"\nDatos del alquiler:"+"\nNombre del cliente:"
        +getNombre()+"\nDNI del cliente:"+getDNI()+"\nAño de comienzo:"+getInicio()+"\nAño de fin:"+getFin()+"\nCosto del alquiler:"
        +Alquiler()+"\nUsted alquilara un velero";
    }
    
    
}
