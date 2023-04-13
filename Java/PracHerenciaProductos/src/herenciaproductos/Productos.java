
package herenciaproductos;


public class Productos {
    private String fechadecaducidad;
    private int numerodelote;

    public Productos(String fechadecaducidad, int numerodelote) {
        this.fechadecaducidad = fechadecaducidad;
        this.numerodelote = numerodelote;
    }

    public Productos (){
        fechadecaducidad="";
        numerodelote=0;
    }
    /**
     * @return the fechadecaducidad
     */
    public String getFechadecaducidad() {
        return fechadecaducidad;
    }

    /**
     * @param fechadecaducidad the fechadecaducidad to set
     */
    public void setFechadecaducidad(String fechadecaducidad) {
        this.fechadecaducidad = fechadecaducidad;
    }

    /**
     * @return the numerodelote
     */
    public int getNumerodelote() {
        return numerodelote;
    }

    /**
     * @param numerodelote the numerodelote to set
     */
    public void setNumerodelote(int numerodelote) {
        this.numerodelote = numerodelote;
    }
    
    public String mostrardatos(){
        return "Los datos del producto son:\nFecha de caducidad:"+getFechadecaducidad()+"\nNumero de lote:"+
                getNumerodelote();
    }
    
}
