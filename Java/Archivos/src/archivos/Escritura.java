
package archivos;

import java.io.FileWriter;
import java.io.IOException;


public class Escritura {
    public static void main(String[] args) throws IOException{
        String [] cadenas ={"Sarely", "Jafet", "Jennifer","Geraldo"};
        FileWriter archivo=null;
        
        try{
            archivo=new FileWriter("archivo_escribir.txt");
            for (String linea: cadenas){
                archivo.write(linea+" ");
            }
            System.out.println("Archivo terminado.....");
            archivo.close();
        }catch (Exception ex){
            System.out.println("Error:"+ex.getMessage());
        }
    }
}
