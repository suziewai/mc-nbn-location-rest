
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InteractionDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InteractionDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}InteractionBaseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InteractionObjectID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InteractionDefinition", propOrder = {
    "interactionObjectID"
})
@XmlSeeAlso({
    Campaign.class,
    SendDefinition.class,
    SalesforceSendActivity.class,
    DataExtractActivity.class,
    MessageSendActivity.class,
    SmsSendActivity.class,
    MobileConnectRefreshListActivity.class,
    MobileConnectSendSmsActivity.class,
    MobilePushSendMessageActivity.class,
    ReportActivity.class,
    ImportDefinition.class,
    FilterActivity.class,
    GroupDefinition.class,
    GroupConnectActivity.class,
    FileTransferActivity.class,
    QueryDefinition.class,
    HiveQueryDefinition.class,
    Automation.class,
    AutomationChain.class
})
public class InteractionDefinition
    extends InteractionBaseObject
{

    @XmlElement(name = "InteractionObjectID")
    protected String interactionObjectID;

    /**
     * Gets the value of the interactionObjectID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInteractionObjectID() {
        return interactionObjectID;
    }

    /**
     * Sets the value of the interactionObjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInteractionObjectID(String value) {
        this.interactionObjectID = value;
    }

}
