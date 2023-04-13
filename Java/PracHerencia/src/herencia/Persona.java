
package herencia;

public class Persona {
    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;
    private String tipoSangre;
    private String CURP;
    private String NSS;

    public Persona(String nombre, int edad, char sexo, double peso, double altura, String tipoSangre, String CURP, String NSS) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.tipoSangre = tipoSangre;
        this.CURP = CURP;
        this.NSS = NSS;
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
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the tipoSangre
     */
    public String getTipoSangre() {
        return tipoSangre;
    }

    /**
     * @param tipoSangre the tipoSangre to set
     */
    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    /**
     * @return the CURP
     */
    public String getCURP() {
        return CURP;
    }

    /**
     * @param CURP the CURP to set
     */
    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    /**
     * @return the NSS
     */
    public String getNSS() {
        return NSS;
    }

    /**
     * @param NSS the NSS to set
     */
    public void setNSS(String NSS) {
        this.NSS = NSS;
    }
}
