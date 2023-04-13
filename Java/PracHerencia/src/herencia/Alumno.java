
package herencia;


public class Alumno extends Persona {
    private String no_control;
    private String carrera;
    
    public Alumno (String nombre, int edad, char sexo, double peso, double altura, String tipoSangre, String CURP, String NSS){
        super(nombre,edad,sexo,peso,altura,tipoSangre,CURP,NSS);
    }
    
    /**
     * @return the no_control
     */
    public String getNo_control() {
        return no_control;
    }

    /**
     * @param no_control the no_control to set
     */
    public void setNo_control(String no_control) {
        this.no_control = no_control;
    }
    
    public String mostrarDatos(){
        return "El alumno "+getNombre()+" tiene"+getEdad()+" años";
    }

    /**
     * @return the carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * @param carrera the carrera to set
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
