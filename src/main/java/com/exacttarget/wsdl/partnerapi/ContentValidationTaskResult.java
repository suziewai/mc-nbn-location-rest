
package com.exacttarget.wsdl.partnerapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentValidationTaskResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentValidationTaskResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}TaskResult"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ValidationResults" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ValidationResult" type="{http://exacttarget.com/wsdl/partnerAPI}ValidationResult" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ContentValidationTaskResult", propOrder = {
    "validationResults"
})
public class ContentValidationTaskResult
    extends TaskResult
{

    @XmlElement(name = "ValidationResults")
    protected ContentValidationTaskResult.ValidationResults validationResults;

    /**
     * Gets the value of the validationResults property.
     * 
     * @return
     *     possible object is
     *     {@link ContentValidationTaskResult.ValidationResults }
     *     
     */
    public ContentValidationTaskResult.ValidationResults getValidationResults() {
        return validationResults;
    }

    /**
     * Sets the value of the validationResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentValidationTaskResult.ValidationResults }
     *     
     */
    public void setValidationResults(ContentValidationTaskResult.ValidationResults value) {
        this.validationResults = value;
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
     *         &lt;element name="ValidationResult" type="{http://exacttarget.com/wsdl/partnerAPI}ValidationResult" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "validationResult"
    })
    public static class ValidationResults {

        @XmlElement(name = "ValidationResult")
        protected List<ValidationResult> validationResult;

        /**
         * Gets the value of the validationResult property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the validationResult property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getValidationResult().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ValidationResult }
         * 
         * 
         */
        public List<ValidationResult> getValidationResult() {
            if (validationResult == null) {
                validationResult = new ArrayList<ValidationResult>();
            }
            return this.validationResult;
        }

    }

}
