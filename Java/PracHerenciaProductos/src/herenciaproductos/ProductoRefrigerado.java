
package herenciaproductos;

public class ProductoRefrigerado extends Productos {
    private String cdodsa;
    
    public ProductoRefrigerado(String fechadecaducidad, int numerodelote, String cdodsa) {
        super(fechadecaducidad, numerodelote);
        this.cdodsa=cdodsa;
    }
    
    public ProductoRefrigerado(){
        cdodsa="";
    }
    /**
     * @return the cdodsa
     */
    public String getCdodsa() {
        return cdodsa;
    }

    /**
     * @param cdodsa the cdodsa to set
     */
    public void setCdodsa(String cdodsa) {
        this.cdodsa = cdodsa;
    }
    
    public String mostrardatosPR(){
        return "Los datos del producto refrigerado son:\nFecha de caducidad:"+getFechadecaducidad()+"\nNumero de lote:"+
                getNumerodelote()+"\nCodigo de organismo de supervision alimentaria:"+getCdodsa();
    }
    
}
