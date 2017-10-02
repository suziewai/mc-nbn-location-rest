
package com.exacttarget.wsdl.partnerapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComplexFilterPart complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComplexFilterPart"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}FilterPart"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LeftOperand" type="{http://exacttarget.com/wsdl/partnerAPI}FilterPart"/&gt;
 *         &lt;element name="LogicalOperator" type="{http://exacttarget.com/wsdl/partnerAPI}LogicalOperators"/&gt;
 *         &lt;element name="RightOperand" type="{http://exacttarget.com/wsdl/partnerAPI}FilterPart" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalOperands" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Operand" type="{http://exacttarget.com/wsdl/partnerAPI}FilterPart" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ComplexFilterPart", propOrder = {
    "leftOperand",
    "logicalOperator",
    "rightOperand",
    "additionalOperands"
})
public class ComplexFilterPart
    extends FilterPart
{

    @XmlElement(name = "LeftOperand", required = true)
    protected FilterPart leftOperand;
    @XmlElement(name = "LogicalOperator", required = true)
    @XmlSchemaType(name = "string")
    protected LogicalOperators logicalOperator;
    @XmlElement(name = "RightOperand")
    protected FilterPart rightOperand;
    @XmlElement(name = "AdditionalOperands")
    protected ComplexFilterPart.AdditionalOperands additionalOperands;

    /**
     * Gets the value of the leftOperand property.
     * 
     * @return
     *     possible object is
     *     {@link FilterPart }
     *     
     */
    public FilterPart getLeftOperand() {
        return leftOperand;
    }

    /**
     * Sets the value of the leftOperand property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterPart }
     *     
     */
    public void setLeftOperand(FilterPart value) {
        this.leftOperand = value;
    }

    /**
     * Gets the value of the logicalOperator property.
     * 
     * @return
     *     possible object is
     *     {@link LogicalOperators }
     *     
     */
    public LogicalOperators getLogicalOperator() {
        return logicalOperator;
    }

    /**
     * Sets the value of the logicalOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogicalOperators }
     *     
     */
    public void setLogicalOperator(LogicalOperators value) {
        this.logicalOperator = value;
    }

    /**
     * Gets the value of the rightOperand property.
     * 
     * @return
     *     possible object is
     *     {@link FilterPart }
     *     
     */
    public FilterPart getRightOperand() {
        return rightOperand;
    }

    /**
     * Sets the value of the rightOperand property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterPart }
     *     
     */
    public void setRightOperand(FilterPart value) {
        this.rightOperand = value;
    }

    /**
     * Gets the value of the additionalOperands property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexFilterPart.AdditionalOperands }
     *     
     */
    public ComplexFilterPart.AdditionalOperands getAdditionalOperands() {
        return additionalOperands;
    }

    /**
     * Sets the value of the additionalOperands property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexFilterPart.AdditionalOperands }
     *     
     */
    public void setAdditionalOperands(ComplexFilterPart.AdditionalOperands value) {
        this.additionalOperands = value;
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
     *         &lt;element name="Operand" type="{http://exacttarget.com/wsdl/partnerAPI}FilterPart" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "operand"
    })
    public static class AdditionalOperands {

        @XmlElement(name = "Operand")
        protected List<FilterPart> operand;

        /**
         * Gets the value of the operand property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the operand property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOperand().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FilterPart }
         * 
         * 
         */
        public List<FilterPart> getOperand() {
            if (operand == null) {
                operand = new ArrayList<FilterPart>();
            }
            return this.operand;
        }

    }

}
