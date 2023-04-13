
package bancoespecial;


public abstract class CuentasBanco implements Operaciones {
    private int numerodecuenta;
    private String nombredelcliente;
    private double saldo;
    private double retirar;
    private double depositar;

    public CuentasBanco() {
    }

    public CuentasBanco(int numerodecuenta, String nombredelcliente, double saldo, double retirar, double depositar) {
        this.numerodecuenta = numerodecuenta;
        this.nombredelcliente = nombredelcliente;
        this.saldo = saldo;
        this.retirar = retirar;
        this.depositar = depositar;
    }

    
    
    

    /**
     * @return the numerodecuenta
     */
    public int getNumerodecuenta() {
        return numerodecuenta;
    }

    /**
     * @param numerodecuenta the numerodecuenta to set
     */
    public void setNumerodecuenta(int numerodecuenta) {
        this.numerodecuenta = numerodecuenta;
    }

    /**
     * @return the nombredelcliente
     */
    public String getNombredelcliente() {
        return nombredelcliente;
    }

    /**
     * @param nombredelcliente the nombredelcliente to set
     */
    public void setNombredelcliente(String nombredelcliente) {
        this.nombredelcliente = nombredelcliente;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    @Override
    public abstract double  deposito ();
    
    @Override
    public abstract double retiro ();
    
    @Override
    public abstract String mostrartoString();

    /**
     * @return the retirar
     */
    public double getRetirar() {
        return retirar;
    }

    /**
     * @param retirar the retirar to set
     */
    public void setRetirar(double retirar) {
        this.retirar = retirar;
    }

    /**
     * @return the depositar
     */
    public double getDepositar() {
        return depositar;
    }

    /**
     * @param depositar the depositar to set
     */
    public void setDepositar(double depositar) {
        this.depositar = depositar;
    }
    
}
