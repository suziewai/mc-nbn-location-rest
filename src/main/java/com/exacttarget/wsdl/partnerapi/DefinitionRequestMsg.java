
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DescribeRequests" type="{http://exacttarget.com/wsdl/partnerAPI}ArrayOfObjectDefinitionRequest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "describeRequests"
})
@XmlRootElement(name = "DefinitionRequestMsg")
public class DefinitionRequestMsg {

    @XmlElement(name = "DescribeRequests")
    protected ArrayOfObjectDefinitionRequest describeRequests;

    /**
     * Gets the value of the describeRequests property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfObjectDefinitionRequest }
     *     
     */
    public ArrayOfObjectDefinitionRequest getDescribeRequests() {
        return describeRequests;
    }

    /**
     * Sets the value of the describeRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfObjectDefinitionRequest }
     *     
     */
    public void setDescribeRequests(ArrayOfObjectDefinitionRequest value) {
        this.describeRequests = value;
    }

}
