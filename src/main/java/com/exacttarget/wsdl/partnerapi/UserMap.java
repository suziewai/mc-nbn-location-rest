
package com.exacttarget.wsdl.partnerapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserMap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserMap"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}APIProperty"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ETAccountUser" type="{http://exacttarget.com/wsdl/partnerAPI}AccountUser"/&gt;
 *         &lt;element name="AdditionalData" type="{http://exacttarget.com/wsdl/partnerAPI}APIProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserMap", propOrder = {
    "etAccountUser",
    "additionalData"
})
public class UserMap
    extends APIProperty
{

    @XmlElement(name = "ETAccountUser", required = true)
    protected AccountUser etAccountUser;
    @XmlElement(name = "AdditionalData")
    protected List<APIProperty> additionalData;

    /**
     * Gets the value of the etAccountUser property.
     * 
     * @return
     *     possible object is
     *     {@link AccountUser }
     *     
     */
    public AccountUser getETAccountUser() {
        return etAccountUser;
    }

    /**
     * Sets the value of the etAccountUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountUser }
     *     
     */
    public void setETAccountUser(AccountUser value) {
        this.etAccountUser = value;
    }

    /**
     * Gets the value of the additionalData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link APIProperty }
     * 
     * 
     */
    public List<APIProperty> getAdditionalData() {
        if (additionalData == null) {
            additionalData = new ArrayList<APIProperty>();
        }
        return this.additionalData;
    }

}
