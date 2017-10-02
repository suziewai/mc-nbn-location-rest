
package com.exacttarget.wsdl.partnerapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutomationInstances complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AutomationInstances"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InstanceCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AutomationInstanceCollection" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AutomationInstance" type="{http://exacttarget.com/wsdl/partnerAPI}AutomationInstance" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "AutomationInstances", propOrder = {
    "instanceCount",
    "automationInstanceCollection"
})
public class AutomationInstances
    extends APIObject
{

    @XmlElement(name = "InstanceCount")
    protected Integer instanceCount;
    @XmlElement(name = "AutomationInstanceCollection")
    protected AutomationInstances.AutomationInstanceCollection automationInstanceCollection;

    /**
     * Gets the value of the instanceCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }

    /**
     * Sets the value of the instanceCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInstanceCount(Integer value) {
        this.instanceCount = value;
    }

    /**
     * Gets the value of the automationInstanceCollection property.
     * 
     * @return
     *     possible object is
     *     {@link AutomationInstances.AutomationInstanceCollection }
     *     
     */
    public AutomationInstances.AutomationInstanceCollection getAutomationInstanceCollection() {
        return automationInstanceCollection;
    }

    /**
     * Sets the value of the automationInstanceCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutomationInstances.AutomationInstanceCollection }
     *     
     */
    public void setAutomationInstanceCollection(AutomationInstances.AutomationInstanceCollection value) {
        this.automationInstanceCollection = value;
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
     *         &lt;element name="AutomationInstance" type="{http://exacttarget.com/wsdl/partnerAPI}AutomationInstance" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "automationInstance"
    })
    public static class AutomationInstanceCollection {

        @XmlElement(name = "AutomationInstance")
        protected List<AutomationInstance> automationInstance;

        /**
         * Gets the value of the automationInstance property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the automationInstance property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAutomationInstance().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AutomationInstance }
         * 
         * 
         */
        public List<AutomationInstance> getAutomationInstance() {
            if (automationInstance == null) {
                automationInstance = new ArrayList<AutomationInstance>();
            }
            return this.automationInstance;
        }

    }

}
