
package herencia3.pkg3;

import java.util.Date;


public class Trabajador {
    private String nombre;
    private String puesto;
    private String direccion;
    private int telefono;
    private Date fecha;
    private Date fechacontrata;
    private String nss;

    public Trabajador(String nombre, String nss) {
        this.nombre = nombre;
        this.nss = nss;
    }

    public Trabajador(String nombre, String puesto, String direccion, int telefono, Date fecha, Date fechacontrata, String nss) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fecha = fecha;
        this.fechacontrata = fechacontrata;
        this.nss = nss;
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
     * @return the puesto
     */
    public String getPuesto() {
        return puesto;
    }

    /**
     * @param puesto the puesto to set
     */
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the fechacontrata
     */
    public Date getFechacontrata() {
        return fechacontrata;
    }

    /**
     * @param fechacontrata the fechacontrata to set
     */
    public void setFechacontrata(Date fechacontrata) {
        this.fechacontrata = fechacontrata;
    }

    /**
     * @return the nss
     */
    public String getNss() {
        return nss;
    }

    /**
     * @param nss the nss to set
     */
    public void setNss(String nss) {
        this.nss = nss;
    }
    
    public String mostrarString(){
        return "El trabajdor "+nombre+" tiene un NSS:" +nss;
    }
    
    public boolean comparaNSS(String nss){
        return this.nss.equals(nss);
    }
}
