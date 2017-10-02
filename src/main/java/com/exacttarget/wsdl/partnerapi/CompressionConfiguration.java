
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompressionConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompressionConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://exacttarget.com/wsdl/partnerAPI}CompressionType" minOccurs="0"/&gt;
 *         &lt;element name="Encoding" type="{http://exacttarget.com/wsdl/partnerAPI}CompressionEncoding" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompressionConfiguration", propOrder = {
    "type",
    "encoding"
})
public class CompressionConfiguration {

    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected CompressionType type;
    @XmlElement(name = "Encoding")
    @XmlSchemaType(name = "string")
    protected CompressionEncoding encoding;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CompressionType }
     *     
     */
    public CompressionType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompressionType }
     *     
     */
    public void setType(CompressionType value) {
        this.type = value;
    }

    /**
     * Gets the value of the encoding property.
     * 
     * @return
     *     possible object is
     *     {@link CompressionEncoding }
     *     
     */
    public CompressionEncoding getEncoding() {
        return encoding;
    }

    /**
     * Sets the value of the encoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompressionEncoding }
     *     
     */
    public void setEncoding(CompressionEncoding value) {
        this.encoding = value;
    }

}
