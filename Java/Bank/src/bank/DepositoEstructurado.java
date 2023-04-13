
package bank;


public class DepositoEstructurado extends Deposito {
    private double interesextra;
    private double capitalextra;
    
    public DepositoEstructurado(String titular, double capital, int plazodias, String tipointeres, double interes, double typeinteres, double interesextra, double capitalextra){
        super(titular, capital, plazodias, tipointeres, interes, typeinteres);
        this.interesextra=interesextra;
        this.capitalextra=capitalextra;
    }
    
    public DepositoEstructurado(){
        interesextra=0.0;
        capitalextra=0.0;
    }
    
    public double partefija(){
        double partefija=0.0;
        return partefija;
    
    }
    
    public double partevariable(){
        double partevariable=0.0;
        return partevariable;
    
    }
    
    @Override
    public String mostrarDatos(){
      return "Titular del deposito:"+getTitular()+"\nCapital:"+getCapital()+"\nPlazo en dias:"+getPlazodias()
                +"\nInteres:"+getTypeinteres()+"%\nInteres Calculado:"+calcularinteres()+"\nPrimera Liquidación:"+super.liquidacion()
                +"\nInteres extra:"+getInteresextra()+"\nCapital extra:"+getCapitalextra()+
                 "\nInteres extra calculado:"+calcularinteresextra()+"\nSegunda liquidación:"+liquidacion();
    }

    /**
     * @return the interesextra
     */
    public double getInteresextra() {
        return interesextra;
    }

    /**
     * @param interesextra the interesextra to set
     */
    public void setInteresextra(double interesextra) {
        this.interesextra = interesextra;
    }

    /**
     * @return the capitalextra
     */
    public double getCapitalextra() {
        return capitalextra;
    }

    /**
     * @param capitalextra the capitalextra to set
     */
    public void setCapitalextra(double capitalextra) {
        this.capitalextra = capitalextra;
    }
    
    public double calcularinteresextra() {		
		return (getPlazodias() * getInteresextra() * getCapitalextra() )/365;
	}
    
    @Override
    public double liquidacion(){
		return super.liquidacion() + getCapitalextra() + calcularinteresextra();
	}
}
