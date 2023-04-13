package arreglosproductos;

import java.util.Random;
import java.util.Scanner;

public class ArreglosProductos {

    
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        Random n= new Random();
        String productos[]={"Nintendo Switch","Playstation 4","Xbox One","Samsung Galaxy Tab A","IPadPro",
        "Televsion HD LG","Wacom Intuos","IPhone X","Laptop HP","Computadora de escritorio Lenovo"};
        double precios[]={8000.00,8500.00,9000.00,5500.00,12000.00,15000,2000.00,18000.00,5000.00,6000.00};
        System.out.println("Bienvenido a la tienda estan disponibles:");
         for (int i=0;i<productos.length;i++){
             System.out.println(i+1+".-"+productos[i]+"($"+precios[i]+")");
         }
        double venta[];
        double iva[];
        double ventatotal[];
        double sumav=0;
        double sumaiva=0;
        double sumavt=0;
        System.out.println("¿Cuantos tipos de productos quieres comprar?");
        int tam=leer.nextInt();
        venta=new double[tam];
        iva=new double[tam];
        ventatotal=new double[tam];
        double ventaproducto;
        double viva;
        double ventat;
        int cantprod;
        for (int i=0;i<tam;i++){
            System.out.println("Oprime un boton en base de la lista para ordenar algo");
            int p=leer.nextInt();
            switch (p){
                case 1:
                    System.out.println("¿Cuantas unidades quieres comprar?");
                    cantprod=leer.nextInt();
                    venta[i]=precios[0]*cantprod;
                    iva[i]=precios[0]*0.16*cantprod;
                    ventatotal[i]=(precios[0]*cantprod)+
                    (precios[0]*0.16*cantprod);
                    sumav=sumav+precios[0]*cantprod;
                    sumaiva=sumaiva+precios[0]*0.16*cantprod;
                    sumavt=sumavt+(precios[0]*cantprod)+
                    (precios[0]*0.16*cantprod);
                    break;
                case 2:
                    System.out.println("¿Cuantas unidades quieres comprar?");
                    cantprod=leer.nextInt();
                    venta[i]=precios[1]*cantprod;
                    iva[i]=precios[1]*0.16*cantprod;
                    ventatotal[i]=(precios[1]*cantprod)+
                    (precios[1]*0.16*cantprod);
                    sumav=sumav+precios[1]*cantprod;
                    sumaiva=sumaiva+precios[1]*0.16*cantprod;
                    sumavt=sumavt+(precios[1]*cantprod)+
                    (precios[1]*0.16*cantprod);
                    break;
                case 3:
                    System.out.println("¿Cuantas unidades quieres?");
                    cantprod=leer.nextInt();
                    venta[i]=precios[precios.length-8]*cantprod;
                    iva[i]=precios[precios.length-8]*0.16*cantprod;
                    ventatotal[i]=(precios[precios.length-8]*cantprod)+
                    (precios[precios.length-8]*0.16*cantprod);
                    sumav=sumav+precios[precios.length-8]*cantprod;
                    sumaiva=sumaiva+precios[precios.length-8]*0.16*cantprod;
                    sumavt=sumavt+(precios[precios.length-8]*cantprod)+
                    (precios[precios.length-8]*0.16*cantprod);
                    break;
                case 4:
                    System.out.println("¿Cuantas unidades quieres comprar?");
                    cantprod=leer.nextInt();
                    venta[i]=precios[precios.length-7]*cantprod;
                    iva[i]=precios[precios.length-7]*0.16*cantprod;
                    ventatotal[i]=(precios[precios.length-7]*cantprod)+
                    (precios[precios.length-7]*0.16*cantprod);
                    sumav=sumav+precios[precios.length-7]*cantprod;
                    sumaiva=sumaiva+precios[precios.length-7]*0.16*cantprod;
                    sumavt=sumavt+(precios[precios.length-7]*cantprod)+
                    (precios[precios.length-7]*0.16*cantprod);
                    break;
                case 5:
                    System.out.println("¿Cuantas unidades quieres comprar?");
                    cantprod=leer.nextInt();
                    venta[i]=precios[precios.length-6]*cantprod;
                    iva[i]=precios[precios.length-6]*0.16*cantprod;
                    ventatotal[i]=(precios[precios.length-6]*cantprod)+
                    (precios[precios.length-6]*0.16*cantprod);
                    sumav=sumav+precios[precios.length-6]*cantprod;
                    sumaiva=sumaiva+precios[precios.length-6]*0.16*cantprod;
                    sumavt=sumavt+(precios[precios.length-6]*cantprod)+
                    (precios[precios.length-6]*0.16*cantprod);
                    break;
                case 6:
                    System.out.println("¿Cuantas unidades quieres comprar?");
                    cantprod=leer.nextInt();
                    venta[i]=precios[precios.length-5]*cantprod;
                    iva[i]=precios[precios.length-5]*0.16*cantprod;
                    ventatotal[i]=(precios[precios.length-5]*cantprod)+
                    (precios[precios.length-5]*0.16*cantprod);
                    sumav=sumav+precios[precios.length-5]*cantprod;
                    sumaiva=sumaiva+precios[precios.length-5]*0.16*cantprod;
                    sumavt=sumavt+(precios[precios.length-5]*cantprod)+
                    (precios[precios.length-5]*0.16*cantprod);
                    break;
                case 7:
                    System.out.println("¿Cuantas unidades quieres comprar?");
                    cantprod=leer.nextInt();
                    venta[i]=precios[precios.length-4]*cantprod;
                    iva[i]=precios[precios.length-4]*0.16*cantprod;
                    ventatotal[i]=(precios[precios.length-4]*cantprod)+
                    (precios[precios.length-4]*0.16*cantprod);
                    sumav=sumav+precios[precios.length-4]*cantprod;
                    sumaiva=sumaiva+precios[precios.length-4]*0.16*cantprod;
                    sumavt=sumavt+(precios[precios.length-4]*cantprod)+
                    (precios[precios.length-4]*0.16*cantprod);
                    break;
                case 8:
                    System.out.println("¿Cuantas unidades quieres comprar?");
                    cantprod=leer.nextInt();
                    venta[i]=precios[precios.length-3]*cantprod;
                    iva[i]=precios[precios.length-3]*0.16*cantprod;
                    ventatotal[i]=(precios[precios.length-3]*cantprod)+
                    (precios[precios.length-3]*0.16*cantprod);
                    sumav=sumav+precios[precios.length-3]*cantprod;
                    sumaiva=sumaiva+precios[precios.length-3]*0.16*cantprod;
                    sumavt=sumavt+(precios[precios.length-3]*cantprod)+
                    (precios[precios.length-3]*0.16*cantprod);
                    break;
                case 9:
                    System.out.println("¿Cuantas unidades quieres comprar?");
                    cantprod=leer.nextInt();
                    venta[i]=precios[precios.length-2]*cantprod;
                    iva[i]=precios[precios.length-2]*0.16*cantprod;
                    ventatotal[i]=(precios[precios.length-2]*cantprod)+
                    (precios[precios.length-2]*0.16*cantprod);
                    sumav=sumav+precios[precios.length-2]*cantprod;
                    sumaiva=sumaiva+precios[precios.length-2]*0.16*cantprod;
                    sumavt=sumavt+(precios[precios.length-2]*cantprod)+
                    (precios[precios.length-2]*0.16*cantprod);
                    break;
                case 10:
                    System.out.println("¿Cuantas unidades quieres comprar?");
                    cantprod=leer.nextInt();
                    venta[i]=precios[precios.length-1]*cantprod;
                    iva[i]=precios[precios.length-1]*0.16*cantprod;
                    ventatotal[i]=(precios[precios.length-1]*cantprod)+
                    (precios[precios.length-1]*0.16*cantprod);
                    sumav=sumav+precios[precios.length-1]*cantprod;
                    sumaiva=sumaiva+precios[precios.length-1]*0.16*cantprod;
                    sumavt=sumavt+(precios[precios.length-1]*cantprod)+
                    (precios[precios.length-1]*0.16*cantprod);
                    break;
            }
        }
        System.out.println("Sus ventas son:");
        for(int i=0; i<venta.length;i++){
            System.out.print(i+1+".-$"+venta[i]+", ");
        }
        System.out.println("");
        System.out.println("Sus cantidades de IVA son:");
        for(int i=0; i<venta.length;i++){
            System.out.print(i+1+".-$"+iva[i]+", ");
        }
        System.out.println("");
        System.out.println("Sus totalidades son:");
        for(int i=0; i<venta.length;i++){
            System.out.print(i+1+".-$"+ventatotal[i]+", ");
        }
        System.out.println("");
        System.out.println("Su suma de las venta es:$"+sumav);
        System.out.println("Su suma de las cantidades de IVA es:$"+sumaiva);
        System.out.println("Su suma de las ventas totales es:$"+sumavt);
    }
    
}
