
package archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Archivos {

    
    public static void main(String[] args) throws FileNotFoundException {
        File archivo=new File("archivo_leer.txt");
        Scanner leer=null;
        try{
            leer= new Scanner(archivo);
            while(leer.hasNextLine()){
                String linea=leer.nextLine();
                System.out.println("Imprimiendo linea...."+linea);
            }
        }catch (Exception ex){
            System.out.println("Error:"+ex.getMessage());
        }finally{
            try{
            if(leer!=null)
                leer.close();
            }catch(Exception ex2){
                System.out.println("Error 2:"+ex2.getMessage());
            }
        }
    }
    
}
