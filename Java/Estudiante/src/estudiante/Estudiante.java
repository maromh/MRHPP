/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiante;
import java.util.Scanner;

public class Estudiante {
    String nom, matrz, carrera;
    int grop;
    public Estudiante(){
        System.out.println("Construyendo");
    }
    public Estudiante(String nom, String matrz, String carrera, int grop){
       this.nom=nom;
       this.matrz=matrz;
       this.carrera=carrera;
       this.grop=grop;
       System.out.println("Nombre:"+this.nom);
       System.out.println("Apellido paterno:"+this.matrz);
       System.out.println("Apellido materno:"+this.carrera);
       System.out.println("Grupo:"+this.grop);
    }
    public static void main(String[] args) {
        Estudiante obj=new Estudiante();
        Estudiante obj2=new Estudiante("Beto","Malpica","Romero",4104);
    }
}
    

