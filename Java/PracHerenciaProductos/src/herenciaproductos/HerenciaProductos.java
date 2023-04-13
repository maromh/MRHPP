
package herenciaproductos;

import java.util.Scanner;


public class HerenciaProductos {

   
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        Productos p1=new Productos();
        System.out.println("Introduce la fecha de caducidad del producto");
        String pfc=r.next();
        p1.setFechadecaducidad(pfc);
        System.out.println("Introduce el numero de lote del producto");
        int pnl=r.nextInt();
        p1.setNumerodelote(pnl);
        ProductoFresco pf2=new ProductoFresco();
        System.out.println("Introduce la fecha de caducidad del producto fresco");
        String pffc=r.next();
        pf2.setFechadecaducidad(pffc);
        System.out.println("Introduce el numero de lote del producto fresco");
        int pfnl=r.nextInt();
        pf2.setNumerodelote(pfnl);
        System.out.println("Introduce la fecha de envasado del producto fresco");
        String pffe=r.next();
        pf2.setFechadeenvasado(pffe);
        System.out.println("Introduce el pais de origen del producto fresco");
        String pfpo=r.next();
        pf2.setPaisdeorigen(pfpo);
        ProductoRefrigerado pr3=new ProductoRefrigerado();
        System.out.println("Introduce la fecha de caducidad del producto refrigerado");
        String prfc=r.next();
        pr3.setFechadecaducidad(prfc);
        System.out.println("Introduce el numero de lote del producto refrigerado");
        int prnl=r.nextInt();
        pr3.setNumerodelote(prnl);
        System.out.println("Introduce el codigo de organismo de supervision alimentaria del producto refrigerado");
        String prcdodsa=r.next();
        pr3.setCdodsa(prcdodsa);
        ProductoCongelado pc4= new ProductoCongelado();
        System.out.println("Introduce la fecha de caducidad del producto congelado");
        String pcfc=r.next();
        pc4.setFechadecaducidad(prcdodsa);
        System.out.println("Introduce el numero de lote del producto congelado");
        int pcnl=r.nextInt();
        pc4.setNumerodelote(prnl);
        System.out.println("Introduce la temperatura de congelación recomendada del producto congelado");
        double pctcr=r.nextDouble();
        pc4.setTcr(pctcr);
        System.out.println(p1.mostrardatos());
        System.out.println(pf2.mostrardatosPF());
        System.out.println(pr3.mostrardatosPR());
        System.out.println(pc4.mostrardatosPC());
    }
    
}
