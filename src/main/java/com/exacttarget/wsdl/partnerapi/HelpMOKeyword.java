
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HelpMOKeyword complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HelpMOKeyword"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}BaseMOKeyword"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FriendlyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DefaultHelpMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MenuText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MoreChoicesPrompt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HelpMOKeyword", propOrder = {
    "friendlyName",
    "defaultHelpMessage",
    "menuText",
    "moreChoicesPrompt"
})
public class HelpMOKeyword
    extends BaseMOKeyword
{

    @XmlElement(name = "FriendlyName")
    protected String friendlyName;
    @XmlElement(name = "DefaultHelpMessage")
    protected String defaultHelpMessage;
    @XmlElement(name = "MenuText")
    protected String menuText;
    @XmlElement(name = "MoreChoicesPrompt")
    protected String moreChoicesPrompt;

    /**
     * Gets the value of the friendlyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFriendlyName() {
        return friendlyName;
    }

    /**
     * Sets the value of the friendlyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFriendlyName(String value) {
        this.friendlyName = value;
    }

    /**
     * Gets the value of the defaultHelpMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultHelpMessage() {
        return defaultHelpMessage;
    }

    /**
     * Sets the value of the defaultHelpMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultHelpMessage(String value) {
        this.defaultHelpMessage = value;
    }

    /**
     * Gets the value of the menuText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMenuText() {
        return menuText;
    }

    /**
     * Sets the value of the menuText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMenuText(String value) {
        this.menuText = value;
    }

    /**
     * Gets the value of the moreChoicesPrompt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoreChoicesPrompt() {
        return moreChoicesPrompt;
    }

    /**
     * Sets the value of the moreChoicesPrompt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoreChoicesPrompt(String value) {
        this.moreChoicesPrompt = value;
    }

}
