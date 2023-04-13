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
public class Empleado extends Trabajador{
    private double sueldo;
    private double impuestos;
    private int PAGAS=15;

    public Empleado(double sueldo, String nombre, String nss) {
        super(nombre, nss);
        this.sueldo = sueldo;
        this.impuestos=0.2*sueldo;
    }
    
    public double calcularPaga(){
        return (sueldo-impuestos)*PAGAS;
    }
    
    @Override
    public String mostrarString(){
        return "El empleado "+super.mostrarString(); 
    }
}
