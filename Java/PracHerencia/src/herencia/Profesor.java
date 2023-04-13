
package herencia;

public class Profesor extends Persona {
    private String especialidad;
    private String noempleado;
    
    public Profesor (String nombre, int edad, char sexo, double peso, double altura, String tipoSangre, String CURP, String NSS){
        super(nombre,edad,sexo,peso,altura,tipoSangre,CURP,NSS);
    }

    /**
     * @return the especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * @return the noempleado
     */
    public String getNoempleado() {
        return noempleado;
    }

    /**
     * @param noempleado the noempleado to set
     */
    public void setNoempleado(String noempleado) {
        this.noempleado = noempleado;
    }
    
    public String mostrarDatosprofe(){
        return "El profesor"+getNombre()+"con la edad";
    }
}
