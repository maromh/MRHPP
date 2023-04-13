
package abstraccion2;


public class Guitarra extends Instrumento {
    
    public Guitarra(){
        tipo="Guitarra";
    }
    
    @Override
    public void tocar(){
        System.out.println("Tocando la guitarra");
    }
}
