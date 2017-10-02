
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SMSTriggeredSendDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SMSTriggeredSendDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}SendDefinition"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Publication" type="{http://exacttarget.com/wsdl/partnerAPI}List" minOccurs="0"/&gt;
 *         &lt;element name="DataExtension" type="{http://exacttarget.com/wsdl/partnerAPI}DataExtension" minOccurs="0"/&gt;
 *         &lt;element name="Content" type="{http://exacttarget.com/wsdl/partnerAPI}ContentArea" minOccurs="0"/&gt;
 *         &lt;element name="SendToList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SMSTriggeredSendDefinition", propOrder = {
    "publication",
    "dataExtension",
    "content",
    "sendToList"
})
public class SMSTriggeredSendDefinition
    extends SendDefinition
{

    @XmlElement(name = "Publication")
    protected List publication;
    @XmlElement(name = "DataExtension")
    protected DataExtension dataExtension;
    @XmlElement(name = "Content")
    protected ContentArea content;
    @XmlElement(name = "SendToList")
    protected Boolean sendToList;

    /**
     * Gets the value of the publication property.
     * 
     * @return
     *     possible object is
     *     {@link List }
     *     
     */
    public List getPublication() {
        return publication;
    }

    /**
     * Sets the value of the publication property.
     * 
     * @param value
     *     allowed object is
     *     {@link List }
     *     
     */
    public void setPublication(List value) {
        this.publication = value;
    }

    /**
     * Gets the value of the dataExtension property.
     * 
     * @return
     *     possible object is
     *     {@link DataExtension }
     *     
     */
    public DataExtension getDataExtension() {
        return dataExtension;
    }

    /**
     * Sets the value of the dataExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataExtension }
     *     
     */
    public void setDataExtension(DataExtension value) {
        this.dataExtension = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link ContentArea }
     *     
     */
    public ContentArea getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentArea }
     *     
     */
    public void setContent(ContentArea value) {
        this.content = value;
    }

    /**
     * Gets the value of the sendToList property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendToList() {
        return sendToList;
    }

    /**
     * Sets the value of the sendToList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendToList(Boolean value) {
        this.sendToList = value;
    }

}
