
package myWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clientDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clientDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cnp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prenume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clientDTO", propOrder = {
    "action",
    "cnp",
    "id",
    "nume",
    "prenume"
})
public class ClientDTO {

    protected String action;
    protected String cnp;
    protected Integer id;
    protected String nume;
    protected String prenume;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the cnp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnp() {
        return cnp;
    }

    /**
     * Sets the value of the cnp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnp(String value) {
        this.cnp = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the nume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNume() {
        return nume;
    }

    /**
     * Sets the value of the nume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNume(String value) {
        this.nume = value;
    }

    /**
     * Gets the value of the prenume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrenume() {
        return prenume;
    }

    /**
     * Sets the value of the prenume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrenume(String value) {
        this.prenume = value;
    }

}
