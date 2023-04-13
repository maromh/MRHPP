
package gestordeposito;

    public class DepositoEstructurado extends Deposito {
	private double tipoInteresAmpliado;
	private double capitalAmpliado;
	
	public DepositoEstructurado(String titular, double capital, int plazoDias,
			double tipoInteres, double tipoInteresAmpliado,  double capitalAmpliado){
		//Llamada explícita al constructor del padre
		super (titular, capital, plazoDias, tipoInteres);
		this.tipoInteresAmpliado = tipoInteresAmpliado;
		this.capitalAmpliado = capitalAmpliado;		
	}
	
	public double obtenInteresesAmpliado() {		
		return (getPlazoDias() * tipoInteresAmpliado * capitalAmpliado )/365;
	}
	
	public double liquidar(){
		return super.liquidar() + capitalAmpliado + obtenInteresesAmpliado();
	}
	
	// getters and setters
	public double getTipoInteresAmpliado() { 
		return tipoInteresAmpliado;
	}
	
	public void setTipoInteresAmpliado(double tipoInteresAmpliado){ 
		this.tipoInteresAmpliado = tipoInteresAmpliado;
	}
	
	public double getCapitalAmpliado() {
		return capitalAmpliado;
	}
	
	public void setCapitalAmpliado(double capitalAmpliado){
		this.capitalAmpliado = capitalAmpliado;
        }
}
