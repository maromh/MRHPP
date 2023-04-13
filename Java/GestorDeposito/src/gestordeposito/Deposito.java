
package gestordeposito;
    public class Deposito {	
	private String titular;
	private double capital;
	private int plazoDias;
	private double tipoInteres;
	
	public Deposito (String titular, double capital,int plazoDias, double tipoInteres) {
		this.titular = titular;
		this.capital = capital;
		this.plazoDias = plazoDias;
		this.tipoInteres = tipoInteres;
	} 
	
	public double obtenIntereses() {
		return (plazoDias * tipoInteres * capital)/365;
	}
	
	protected double liquidar() {
		return getCapital() + obtenIntereses();
	}
	
	// getters and setters
	public double getCapital() {
		return capital;
	}
	
	public void setCapital(double capital){
		this.capital = capital;
	}
	
	public int getPlazoDias() {
		return plazoDias;
	}
	
	public void setPlazoDias(int plazoDias){
		this.plazoDias = plazoDias;
	}
	
	public double getTipoInteres() {
		return tipoInteres;
	}
	
	public void setTipoInteres(double tipoInteres){
		this.tipoInteres = tipoInteres;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular){
		this.titular = titular;
	}
}

