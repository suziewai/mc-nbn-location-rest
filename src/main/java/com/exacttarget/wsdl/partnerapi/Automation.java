
package com.exacttarget.wsdl.partnerapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Automation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Automation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}InteractionDefinition"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Schedule" type="{http://exacttarget.com/wsdl/partnerAPI}ScheduleDefinition" minOccurs="0"/&gt;
 *         &lt;element name="AutomationTasks" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AutomationTask" type="{http://exacttarget.com/wsdl/partnerAPI}AutomationTask" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AutomationSource" type="{http://exacttarget.com/wsdl/partnerAPI}AutomationSource" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Notifications" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Notification" type="{http://exacttarget.com/wsdl/partnerAPI}AutomationNotification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ScheduledTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="AutomationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UpdateModified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastRunInstanceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CategoryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastRunTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastSaveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RecurrenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastSavedBy" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Automation", propOrder = {
    "schedule",
    "automationTasks",
    "isActive",
    "automationSource",
    "status",
    "notifications",
    "scheduledTime",
    "automationType",
    "updateModified",
    "lastRunInstanceID",
    "createdBy",
    "categoryID",
    "lastRunTime",
    "lastSaveDate",
    "modifiedBy",
    "recurrenceID",
    "lastSavedBy"
})
@XmlSeeAlso({
    AutomationInstance.class
})
public class Automation
    extends InteractionDefinition
{

    @XmlElement(name = "Schedule")
    protected ScheduleDefinition schedule;
    @XmlElement(name = "AutomationTasks")
    protected Automation.AutomationTasks automationTasks;
    @XmlElement(name = "IsActive")
    protected Boolean isActive;
    @XmlElement(name = "AutomationSource")
    protected AutomationSource automationSource;
    @XmlElement(name = "Status")
    protected Integer status;
    @XmlElement(name = "Notifications")
    protected Automation.Notifications notifications;
    @XmlElement(name = "ScheduledTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledTime;
    @XmlElement(name = "AutomationType")
    protected String automationType;
    @XmlElement(name = "UpdateModified")
    protected Boolean updateModified;
    @XmlElement(name = "LastRunInstanceID")
    protected String lastRunInstanceID;
    @XmlElement(name = "CreatedBy")
    protected Long createdBy;
    @XmlElement(name = "CategoryID")
    protected String categoryID;
    @XmlElement(name = "LastRunTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastRunTime;
    @XmlElement(name = "LastSaveDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastSaveDate;
    @XmlElement(name = "ModifiedBy")
    protected Long modifiedBy;
    @XmlElement(name = "RecurrenceID")
    protected String recurrenceID;
    @XmlElement(name = "LastSavedBy")
    protected Long lastSavedBy;

    /**
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleDefinition }
     *     
     */
    public ScheduleDefinition getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleDefinition }
     *     
     */
    public void setSchedule(ScheduleDefinition value) {
        this.schedule = value;
    }

    /**
     * Gets the value of the automationTasks property.
     * 
     * @return
     *     possible object is
     *     {@link Automation.AutomationTasks }
     *     
     */
    public Automation.AutomationTasks getAutomationTasks() {
        return automationTasks;
    }

    /**
     * Sets the value of the automationTasks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Automation.AutomationTasks }
     *     
     */
    public void setAutomationTasks(Automation.AutomationTasks value) {
        this.automationTasks = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the automationSource property.
     * 
     * @return
     *     possible object is
     *     {@link AutomationSource }
     *     
     */
    public AutomationSource getAutomationSource() {
        return automationSource;
    }

    /**
     * Sets the value of the automationSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutomationSource }
     *     
     */
    public void setAutomationSource(AutomationSource value) {
        this.automationSource = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatus(Integer value) {
        this.status = value;
    }

    /**
     * Gets the value of the notifications property.
     * 
     * @return
     *     possible object is
     *     {@link Automation.Notifications }
     *     
     */
    public Automation.Notifications getNotifications() {
        return notifications;
    }

    /**
     * Sets the value of the notifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link Automation.Notifications }
     *     
     */
    public void setNotifications(Automation.Notifications value) {
        this.notifications = value;
    }

    /**
     * Gets the value of the scheduledTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledTime() {
        return scheduledTime;
    }

    /**
     * Sets the value of the scheduledTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledTime(XMLGregorianCalendar value) {
        this.scheduledTime = value;
    }

    /**
     * Gets the value of the automationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutomationType() {
        return automationType;
    }

    /**
     * Sets the value of the automationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutomationType(String value) {
        this.automationType = value;
    }

    /**
     * Gets the value of the updateModified property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpdateModified() {
        return updateModified;
    }

    /**
     * Sets the value of the updateModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateModified(Boolean value) {
        this.updateModified = value;
    }

    /**
     * Gets the value of the lastRunInstanceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastRunInstanceID() {
        return lastRunInstanceID;
    }

    /**
     * Sets the value of the lastRunInstanceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastRunInstanceID(String value) {
        this.lastRunInstanceID = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreatedBy(Long value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the categoryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryID() {
        return categoryID;
    }

    /**
     * Sets the value of the categoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryID(String value) {
        this.categoryID = value;
    }

    /**
     * Gets the value of the lastRunTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastRunTime() {
        return lastRunTime;
    }

    /**
     * Sets the value of the lastRunTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastRunTime(XMLGregorianCalendar value) {
        this.lastRunTime = value;
    }

    /**
     * Gets the value of the lastSaveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastSaveDate() {
        return lastSaveDate;
    }

    /**
     * Sets the value of the lastSaveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastSaveDate(XMLGregorianCalendar value) {
        this.lastSaveDate = value;
    }

    /**
     * Gets the value of the modifiedBy property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getModifiedBy() {
        return modifiedBy;
    }

    /**
     * Sets the value of the modifiedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setModifiedBy(Long value) {
        this.modifiedBy = value;
    }

    /**
     * Gets the value of the recurrenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurrenceID() {
        return recurrenceID;
    }

    /**
     * Sets the value of the recurrenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurrenceID(String value) {
        this.recurrenceID = value;
    }

    /**
     * Gets the value of the lastSavedBy property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLastSavedBy() {
        return lastSavedBy;
    }

    /**
     * Sets the value of the lastSavedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLastSavedBy(Long value) {
        this.lastSavedBy = value;
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
     *         &lt;element name="AutomationTask" type="{http://exacttarget.com/wsdl/partnerAPI}AutomationTask" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "automationTask"
    })
    public static class AutomationTasks {

        @XmlElement(name = "AutomationTask")
        protected List<AutomationTask> automationTask;

        /**
         * Gets the value of the automationTask property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the automationTask property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAutomationTask().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AutomationTask }
         * 
         * 
         */
        public List<AutomationTask> getAutomationTask() {
            if (automationTask == null) {
                automationTask = new ArrayList<AutomationTask>();
            }
            return this.automationTask;
        }

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
     *         &lt;element name="Notification" type="{http://exacttarget.com/wsdl/partnerAPI}AutomationNotification" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "notification"
    })
    public static class Notifications {

        @XmlElement(name = "Notification")
        protected List<AutomationNotification> notification;

        /**
         * Gets the value of the notification property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the notification property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNotification().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AutomationNotification }
         * 
         * 
         */
        public List<AutomationNotification> getNotification() {
            if (notification == null) {
                notification = new ArrayList<AutomationNotification>();
            }
            return this.notification;
        }

    }

}
