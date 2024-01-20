
package agence.web.service.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour adresse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="adresse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code_postale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lieu_dit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="position_gps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ville" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adresse", propOrder = {
    "codePostale",
    "lieuDit",
    "pays",
    "positionGps",
    "rue",
    "ville"
})
public class Adresse {

    @XmlElement(name = "code_postale")
    protected int codePostale;
    @XmlElement(name = "lieu_dit")
    protected String lieuDit;
    protected String pays;
    @XmlElement(name = "position_gps")
    protected String positionGps;
    protected String rue;
    protected String ville;

    /**
     * Obtient la valeur de la propriété codePostale.
     * 
     */
    public int getCodePostale() {
        return codePostale;
    }

    /**
     * Définit la valeur de la propriété codePostale.
     * 
     */
    public void setCodePostale(int value) {
        this.codePostale = value;
    }

    /**
     * Obtient la valeur de la propriété lieuDit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLieuDit() {
        return lieuDit;
    }

    /**
     * Définit la valeur de la propriété lieuDit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLieuDit(String value) {
        this.lieuDit = value;
    }

    /**
     * Obtient la valeur de la propriété pays.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPays() {
        return pays;
    }

    /**
     * Définit la valeur de la propriété pays.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPays(String value) {
        this.pays = value;
    }

    /**
     * Obtient la valeur de la propriété positionGps.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionGps() {
        return positionGps;
    }

    /**
     * Définit la valeur de la propriété positionGps.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionGps(String value) {
        this.positionGps = value;
    }

    /**
     * Obtient la valeur de la propriété rue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRue() {
        return rue;
    }

    /**
     * Définit la valeur de la propriété rue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRue(String value) {
        this.rue = value;
    }

    /**
     * Obtient la valeur de la propriété ville.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVille() {
        return ville;
    }

    /**
     * Définit la valeur de la propriété ville.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVille(String value) {
        this.ville = value;
    }

}
