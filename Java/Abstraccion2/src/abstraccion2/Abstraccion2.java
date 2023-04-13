
package abstraccion2;


public class Abstraccion2 {

    
    public static void main(String[] args) {
        Violin xx=new Violin();
        System.out.println("Instrumento:"+xx.tipo);
        xx.tocar();
        Guitarra xy=new Guitarra();
        System.out.println("Instrumento:"+xy.tipo);
        xy.tocar();
    }
    
}
