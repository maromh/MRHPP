
package herenciaproductos;


public class ProductoFresco extends Productos {
    private String fechadeenvasado;
    private String paisdeorigen;
    
    public ProductoFresco(String fechadecaducidad, int numerodelote, String fechadeenvasado, String paisdeorigen) {
        super(fechadecaducidad, numerodelote);
        this.fechadeenvasado=fechadeenvasado;
        this.paisdeorigen=paisdeorigen;
    }
    
    public ProductoFresco(){
        fechadeenvasado="";
        paisdeorigen="";
    }
    /**
     * @return the fechadeenvasado
     */
    public String getFechadeenvasado() {
        return fechadeenvasado;
    }

    /**
     * @param fechadeenvasado the fechadeenvasado to set
     */
    public void setFechadeenvasado(String fechadeenvasado) {
        this.fechadeenvasado = fechadeenvasado;
    }

    /**
     * @return the paisdeorigen
     */
    public String getPaisdeorigen() {
        return paisdeorigen;
    }

    /**
     * @param paisdeorigen the paisdeorigen to set
     */
    public void setPaisdeorigen(String paisdeorigen) {
        this.paisdeorigen = paisdeorigen;
    }
    
    public String mostrardatosPF(){
        return "Los datos del producto fresco son:\nFecha de caducidad:"+getFechadecaducidad()+"\nNumero de lote:"+
                getNumerodelote()+"\nFecha de envasado:"+getFechadeenvasado()+"\nPais de origen:"+getPaisdeorigen();
    }
}
