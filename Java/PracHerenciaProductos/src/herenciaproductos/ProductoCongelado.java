
package herenciaproductos;

public class ProductoCongelado extends Productos {
    private double tcr;
    
    public ProductoCongelado(String fechadecaducidad, int numerodelote, double tcr) {
        super(fechadecaducidad, numerodelote);
        this.tcr=tcr;
    }
    
    public ProductoCongelado(){
     tcr=0.0;
    }
    /**
     * @return the tcr
     */
    public double getTcr() {
        return tcr;
    }

    /**
     * @param tcr the tcr to set
     */
    public void setTcr(double tcr) {
        this.tcr = tcr;
    }
    
    public String mostrardatosPC(){
        return "Los datos del producto congelado son:\nFecha de caducidad:"+getFechadecaducidad()+"\nNumero de lote:"+
                getNumerodelote()+"\nTemperatura de congelación recomendada:"+getTcr();
    }
}
