package arreglos2;

import java.util.Scanner;


public class Arreglos2 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String nombre[], apPat[], apMat[];
        char sexo[];
        int edad[];
        System.out.println("¿Cuantos regstros ingresara?");
        int numReg=leer.nextInt();
        nombre=new String[numReg];
        apPat=new String[numReg];
        apMat=new String[numReg];
        sexo=new char[numReg];
        edad=new int[numReg];
        for(int i=0;i<numReg;i++){
            System.out.println("*****Registro"+(i+1)+"******");
            System.out.println("Ingrese nombre:");
            nombre[i]=leer.next();
            System.out.println("Ingrese apellido paterno");
            apPat[i]=leer.next();
            System.out.println("Ingrese apellido materno");
            apMat[i]=leer.next();
            System.out.println("Ingreso sexo(M o F):");
            sexo[i]=leer.next().charAt(0);
            System.out.println("Ingrese edad");
            edad[i]=leer.nextInt();
        }
        boolean band=true;
        do{
            System.out.println("-------------------------------------");
            System.out.println("Ingrese nombre a buscar:");
            String nomb=leer.next();
            boolean encontrado=false;
            int posicion=0;
            for (int i=0;i<numReg;i++){  //nombre[i]
                if(nombre[i].equals(nomb)){ //Compara el nombre que ingreso con el nombre
                    encontrado=true;
                    posicion=i;
                    break;
                }
            }
            if(encontrado){
                System.out.println("-----------------------------------------");
                System.out.println("Registro encontrado:");
                System.out.println(nombre[posicion]+" "+apPat[posicion]+" "
                +apMat[posicion]+" Sexo:"+sexo[posicion]+" Edad:"+edad[posicion]);
                //encontrado=false;
            }
            else{
                System.out.println("-----------------------");
                System.out.println("Registro no encontrado");
            }
            System.out.println("-----------------------");
            System.out.println("¿Desea buscar otro registro?\n1.Si\n2.No");
            int op=leer.nextInt();
            if(op==2)
                band =false;
        }while(band);
    }
    
}

