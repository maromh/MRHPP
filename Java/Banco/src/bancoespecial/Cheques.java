
package bancoespecial;

public class Cheques extends CuentasBanco {
    private double comisionchequera;
    private double chequessaldoinsuficiente;
    private double cheque;

    public Cheques() {
    }

    public Cheques(double comisionchequera, double chequessaldoinsuficiente, double cheque) {
        this.comisionchequera = comisionchequera;
        this.chequessaldoinsuficiente = chequessaldoinsuficiente;
        this.cheque = cheque;
    }

    public Cheques(double comisionchequera, double chequessaldoinsuficiente, double cheque, int numerodecuenta, String nombredelcliente, double saldo, double retirar, double depositar) {
        super(numerodecuenta, nombredelcliente, saldo, retirar, depositar);
        this.comisionchequera = comisionchequera;
        this.chequessaldoinsuficiente = chequessaldoinsuficiente;
        this.cheque = cheque;
    }

    
    
    /**
     * @return the comisionchequera
     */
    public double getComisionchequera() {
        return comisionchequera;
    }

    /**
     * @param comisionchequera the comisionchequera to set
     */
    public void setComisionchequera(double comisionchequera) {
        this.comisionchequera = comisionchequera;
    }

    /**
     * @return the chequessaldoinsuficiente
     */
    public double getChequessaldoinsuficiente() {
        return chequessaldoinsuficiente;
    }

    /**
     * @param chequessaldoinsuficiente the chequessaldoinsuficiente to set
     */
    public void setChequessaldoinsuficiente(double chequessaldoinsuficiente) {
        this.chequessaldoinsuficiente = chequessaldoinsuficiente;
    }
    
    @Override
    public double  deposito (){
        return getSaldo()+super.getDepositar();
    };
    
    @Override
    public double retiro (){
        return getSaldo()-super.getRetirar();
    };
    
    @Override
    public String mostrartoString(){
        return "El numero de la cuenta es:"+getNumerodecuenta()+"\nEl nombre del cliente es:"+getNombredelcliente()
        +"Su saldo es"+getSaldo();
    };
    
    public double comisionchequera(){
        double comisioncheq=50.00;
        return getSaldo()-comisioncheq;
    }
    
    public double comisioninsuficiente(){
        return getCheque()-getSaldo()-100.00;
    }

    /**
     * @return the cheque
     */
    public double getCheque() {
        return cheque;
    }

    /**
     * @param cheque the cheque to set
     */
    public void setCheque(double cheque) {
        this.cheque = cheque;
    }
    
    
    
}
