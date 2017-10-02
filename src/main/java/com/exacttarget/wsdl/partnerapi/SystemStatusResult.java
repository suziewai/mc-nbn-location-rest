
package com.exacttarget.wsdl.partnerapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemStatusResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemStatusResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}Result"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SystemStatus" type="{http://exacttarget.com/wsdl/partnerAPI}SystemStatusType"/&gt;
 *         &lt;element name="Outages" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Outage" type="{http://exacttarget.com/wsdl/partnerAPI}SystemOutage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemStatusResult", propOrder = {
    "systemStatus",
    "outages"
})
public class SystemStatusResult
    extends Result
{

    @XmlElement(name = "SystemStatus", required = true)
    @XmlSchemaType(name = "string")
    protected SystemStatusType systemStatus;
    @XmlElement(name = "Outages")
    protected SystemStatusResult.Outages outages;

    /**
     * Gets the value of the systemStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SystemStatusType }
     *     
     */
    public SystemStatusType getSystemStatus() {
        return systemStatus;
    }

    /**
     * Sets the value of the systemStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemStatusType }
     *     
     */
    public void setSystemStatus(SystemStatusType value) {
        this.systemStatus = value;
    }

    /**
     * Gets the value of the outages property.
     * 
     * @return
     *     possible object is
     *     {@link SystemStatusResult.Outages }
     *     
     */
    public SystemStatusResult.Outages getOutages() {
        return outages;
    }

    /**
     * Sets the value of the outages property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemStatusResult.Outages }
     *     
     */
    public void setOutages(SystemStatusResult.Outages value) {
        this.outages = value;
    }


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
     *         &lt;element name="Outage" type="{http://exacttarget.com/wsdl/partnerAPI}SystemOutage" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "outage"
    })
    public static class Outages {

        @XmlElement(name = "Outage")
        protected List<SystemOutage> outage;

        /**
         * Gets the value of the outage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the outage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOutage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SystemOutage }
         * 
         * 
         */
        public List<SystemOutage> getOutage() {
            if (outage == null) {
                outage = new ArrayList<SystemOutage>();
            }
            return this.outage;
        }

    }

}
