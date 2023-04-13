/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia3.pkg3;

/**
 *
 * @author Hildeberto
 */
public class Consultor extends Trabajador {
    private int horas;
    private double tarifa;

    public Consultor(int horas, double tarifa, String nombre, String nss) {
        super(nombre, nss);
        this.horas = horas;
        this.tarifa = tarifa;
    }
    
    public double calcularPaga(){
        return horas*tarifa;
    }
    
    @Override
    public String mostrarString(){
        return "Consultor:"+super.mostrarString();
    }
}
