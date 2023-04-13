
package paqserv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para suma complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="suma"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numero1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="numero2" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "suma", propOrder = {
    "numero1",
    "numero2"
})
public class Suma {

    protected int numero1;
    protected int numero2;

    /**
     * Obtiene el valor de la propiedad numero1.
     * 
     */
    public int getNumero1() {
        return numero1;
    }

    /**
     * Define el valor de la propiedad numero1.
     * 
     */
    public void setNumero1(int value) {
        this.numero1 = value;
    }

    /**
     * Obtiene el valor de la propiedad numero2.
     * 
     */
    public int getNumero2() {
        return numero2;
    }

    /**
     * Define el valor de la propiedad numero2.
     * 
     */
    public void setNumero2(int value) {
        this.numero2 = value;
    }

}
