
package bancoespecial;


public class Ahorros extends CuentasBanco {
    private int fechadevencimiento;
    private double porcentajedeinteresmensual;

    public Ahorros() {
    }

    public Ahorros(int fechadevencimiento, double porcentajedeinteresmensual) {
        this.fechadevencimiento = fechadevencimiento;
        this.porcentajedeinteresmensual = porcentajedeinteresmensual;
    }

    public Ahorros(int fechadevencimiento, double porcentajedeinteresmensual, int numerodecuenta, String nombredelcliente, double saldo, double retirar, double depositar) {
        super(numerodecuenta, nombredelcliente, saldo, retirar, depositar);
        this.fechadevencimiento = fechadevencimiento;
        this.porcentajedeinteresmensual = porcentajedeinteresmensual;
    }

    
    
    
    /**
     * @return the fechadevencimiento
     */
    public int getFechadevencimiento() {
        return fechadevencimiento;
    }

    /**
     * @param fechadevencimiento the fechadevencimiento to set
     */
    public void setFechadevencimiento(int fechadevencimiento) {
        this.fechadevencimiento = fechadevencimiento;
    }

    /**
     * @return the porcentajedeinteresmensual
     */
    public double getPorcentajedeinteresmensual() {
        return porcentajedeinteresmensual;
    }

    /**
     * @param porcentajedeinteresmensual the porcentajedeinteresmensual to set
     */
    public void setPorcentajedeinteresmensual(double porcentajedeinteresmensual) {
        this.porcentajedeinteresmensual = porcentajedeinteresmensual;
    }
    
    @Override
    public double  deposito (){
        return getSaldo()+super.getDepositar();
    };
    
    @Override
    public double retiro (){
        
        if (fechadevencimiento==fechadevencimiento){
         return getSaldo()-super.getRetirar();
        }
        else{
            return getSaldo();
        }
        
    };
    
    @Override
    public String mostrartoString(){
        return "El numero de la cuenta es:"+getNumerodecuenta()+"\nEl nombre del cliente es:"+getNombredelcliente()
        +"Su saldo es"+getSaldo();
    };
    
    public double getinteres (){
        return (getFechadevencimiento() * 0.10 * getSaldo())/365;
    };
    
}
