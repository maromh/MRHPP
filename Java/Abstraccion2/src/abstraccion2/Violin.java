
package abstraccion2;


public class Violin extends Instrumento {
    
    public Violin(){
        tipo="Violin";
    }
    
    @Override
    public void tocar (){
        System.out.println("Tocando el violin");
    }
}
