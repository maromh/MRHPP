
package zonamarina;


import java.util.Date;

public abstract class Barcos implements Alquiler {
    private String matricula;
    private double eslora;
    private int añodefabricacion;
    private String nombre;
    private String DNI;
    private int inicio;
    private int fin;
    private String posicion;
    private Date fecha;
    private static String k;

    public Barcos(String matricula, double eslora, int añodefabricacion, String nombre, String DNI, int inicio, int fin, String posicion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.añodefabricacion = añodefabricacion;
        this.nombre = nombre;
        this.DNI = DNI;
        this.inicio = inicio;
        this.fin = fin;
        this.posicion = posicion;
    }
    
    

    public Barcos(){
    
    }
    
    
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the eslora
     */
    public double getEslora() {
        return eslora;
    }

    /**
     * @param eslora the eslora to set
     */
    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    /**
     * @return the añodefabricacion
     */
    public int getAñodefabricacion() {
        return añodefabricacion;
    }

    /**
     * @param añodefabricacion the añodefabricacion to set
     */
    public void setAñodefabricacion(int añodefabricacion) {
        this.añodefabricacion = añodefabricacion;
    }
    
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the DNI
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * @param DNI the DNI to set
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /**
     * @return the inicio
     */
    public int getInicio() {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    /**
     * @return the fin
     */
    public int getFin() {
        return fin;
    }

    /**
     * @param fin the fin to set
     */
    public void setFin(int fin) {
        this.fin = fin;
    }

    /**
     * @return the posicion
     */
    public String getPosicion() {
        return posicion;
    }

    /**
     * @param posicion the posicion to set
     */
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    /**
     * @return the costo
     */
    
    
    
    @Override
    public abstract double Alquiler();
    
    @Override
    public abstract String mostrarDatos();
    
    

}
