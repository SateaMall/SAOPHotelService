
package agence.web.service.client;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;



/**
 * <p>Classe Java pour offre complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="offre">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="capacite" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="chambreId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="date_arrive" type="{http://services.service.web.hotel/}localDate" minOccurs="0"/>
 *         &lt;element name="date_depart" type="{http://services.service.web.hotel/}localDate" minOccurs="0"/>
 *         &lt;element name="date_int_arrive" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="date_int_depart" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hotelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="image" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prix" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "offre", propOrder = {
    "capacite",
    "chambreId",
    "dateArrive",
    "dateDepart",
    "dateIntArrive",
    "dateIntDepart",
    "hotelId",
    "id",
    "image",
    "prix"
})
public class Offre {

    protected int capacite;
    protected int chambreId;
    @XmlElement(name = "date_arrive")
    protected LocalDate dateArrive;
    @XmlElement(name = "date_depart")
    protected LocalDate dateDepart;
    @XmlElement(name = "date_int_arrive", nillable = true)
    protected List<Integer> dateIntArrive;
    @XmlElement(name = "date_int_depart", nillable = true)
    protected List<Integer> dateIntDepart;
    protected int hotelId;
    protected int id;
    protected String image;
    protected float prix;

    /**
     * Obtient la valeur de la propriété capacite.
     * 
     */
    public int getCapacite() {
        return capacite;
    }

    /**
     * Définit la valeur de la propriété capacite.
     * 
     */
    public void setCapacite(int value) {
        this.capacite = value;
    }

    /**
     * Obtient la valeur de la propriété chambreId.
     * 
     */
    public int getChambreId() {
        return chambreId;
    }

    /**
     * Définit la valeur de la propriété chambreId.
     * 
     */
    public void setChambreId(int value) {
        this.chambreId = value;
    }

    /**
     * Obtient la valeur de la propriété dateArrive.
     * 
     * @return
     *     possible object is
     *     {@link LocalDate }
     *     
     */
    public LocalDate getDateArrive() {
        return dateArrive;
    }

    /**
     * Définit la valeur de la propriété dateArrive.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDate }
     *     
     */
    public void setDateArrive(LocalDate value) {
        this.dateArrive = value;
    }

    /**
     * Obtient la valeur de la propriété dateDepart.
     * 
     * @return
     *     possible object is
     *     {@link LocalDate }
     *     
     */
    public LocalDate getDateDepart() {
        return dateDepart;
    }

    /**
     * Définit la valeur de la propriété dateDepart.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDate }
     *     
     */
    public void setDateDepart(LocalDate value) {
        this.dateDepart = value;
    }

    /**
     * Gets the value of the dateIntArrive property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateIntArrive property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateIntArrive().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getDateIntArrive() {
        if (dateIntArrive == null) {
            dateIntArrive = new ArrayList<Integer>();
        }
        return this.dateIntArrive;
    }

    /**
     * Gets the value of the dateIntDepart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateIntDepart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateIntDepart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getDateIntDepart() {
        if (dateIntDepart == null) {
            dateIntDepart = new ArrayList<Integer>();
        }
        return this.dateIntDepart;
    }

    /**
     * Obtient la valeur de la propriété hotelId.
     * 
     */
    public int getHotelId() {
        return hotelId;
    }

    /**
     * Définit la valeur de la propriété hotelId.
     * 
     */
    public void setHotelId(int value) {
        this.hotelId = value;
    }

    /**
     * Obtient la valeur de la propriété id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété image.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImage() {
        return image;
    }

    /**
     * Définit la valeur de la propriété image.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImage(String value) {
        this.image = value;
    }

    /**
     * Obtient la valeur de la propriété prix.
     * 
     */
    public float getPrix() {
        return prix;
    }

    /**
     * Définit la valeur de la propriété prix.
     * 
     */
    public void setPrix(float value) {
        this.prix = value;
    }

}
