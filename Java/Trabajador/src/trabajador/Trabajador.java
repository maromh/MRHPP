package trabajador;
import java.util.Scanner;

public class Trabajador {
    String nom,puesto,cate;
    int htd,ss;
    public Trabajador(){
        System.out.println("Constryendo");
    }
    public Trabajador(String nom, String puesto, String cate, int htd, int ss){
        this.nom=nom;
        this.puesto=puesto;
        this.cate=cate;
        this.htd=htd;
        this.ss=ss;
        System.out.println("Nombre:"+this.nom);
        System.out.println("Puesto:"+this.puesto);
        System.out.println("Categoria:"+this.cate);
        System.out.println("Horas trabajadaas por dia:"+this.htd);
        System.out.println("Sueldo semanal:"+this.ss);
    }
    public static void main(String[] args) {
        Trabajador obj=new Trabajador();
        Scanner leer=new Scanner(System.in);
        System.out.println("Nombre:");
        obj.nom=leer.nextLine();
        System.out.println("Puesto:");
        obj.puesto=leer.nextLine();
        System.out.println("Categoria:");
        obj.cate=leer.nextLine();
        System.out.println("Horas trabajadas por dia:");
        obj.htd=leer.nextInt();
        System.out.println("Sueldo semanal:");
        obj.ss=leer.nextInt();
        Trabajador obj2=new Trabajador(obj.nom,obj.puesto,obj.cate,obj.htd,obj.ss);
    }
        
}