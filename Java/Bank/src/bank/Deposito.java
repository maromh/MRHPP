
package bank;


public class Deposito {
    private String titular;
    private double capital;
    private int plazodias;
    private String tipointeres;
    private double interes;
    private double typeinteres;

    public Deposito(String titular, double capital, int plazodias, String tipointeres, double interes, double typeinteres) {
        this.titular = titular;
        this.capital = capital;
        this.plazodias = plazodias;
        this.tipointeres = tipointeres;
        this.interes=interes;
        this.typeinteres=typeinteres;
    }
    
    public Deposito (){
        titular="";
        capital=0.0;
        plazodias=0;
        tipointeres="";
        interes=0.0;
        typeinteres=0.0;
    }

    /**
     * @return the titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     * @param titular the titular to set
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }

    /**
     * @return the capital
     */
    public double getCapital() {
        return capital;
    }

    /**
     * @param capital the capital to set
     */
    public void setCapital(double capital) {
        this.capital = capital;
    }

    /**
     * @return the plazodias
     */
    public int getPlazodias() {
        return plazodias;
    }

    /**
     * @param plazodias the plazodias to set
     */
    public void setPlazodias(int plazodias) {
        this.plazodias = plazodias;
    }

    /**
     * @return the tipointeres
     */
    public String getTipointeres() {
        return tipointeres;
    }

    /**
     * @param tipointeres the tipointeres to set
     */
    public void setTipointeres(String tipointeres) {
        this.tipointeres = tipointeres;
    }
    
    public double getInteres (){
        return interes;
    }
    
    public double calcularinteres() {
		return (getPlazodias()*getTypeinteres()*getCapital())/365;
	}
    
    public double liquidacion() {
		return getCapital() + calcularinteres();
	}
    
    public double total (){
        double total=0.0;
        int contador=0;
        if ("simple".equals(getTipointeres())||"Simple".equals(getTipointeres())){
            total=(getCapital())*(getInteres()/100)*(getPlazodias()/365);
        }
        if ("compuesto".equals(getTipointeres())||"Compuesto".equals(getTipointeres())){
            
        }
        if ("fijo".equals(getTipointeres())||"Fijo".equals(getTipointeres())){
            
        }
        if ("variable".equals(getTipointeres())||"Variable".equals(getTipointeres())){
            
        }
        if ("nominal".equals(getTipointeres())||"Nomimal".equals(getTipointeres())){
            
        }
        if ("efectivo".equals(getTipointeres())||"Efectivo".equals(getTipointeres())){
            
        }
        return total;
    }
    
    public String mostrarDatos(){
        return "Titular del deposito:"+getTitular()+"\nCapital:"+getCapital()+"\nPlazo en dias:"+getPlazodias()
                +"\nInteres:"+getTypeinteres()+"%\nInteres Calculado:"+calcularinteres()+"\nLiquidación:"+liquidacion();
    }

    /**
     * @return the typeinteres
     */
    public double getTypeinteres() {
        return typeinteres;
    }

    /**
     * @param typeinteres the typeinteres to set
     */
    public void setTypeinteres(double typeinteres) {
        this.typeinteres = typeinteres;
    }
}
