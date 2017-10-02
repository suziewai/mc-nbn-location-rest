
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutomationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AutomationStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Error"/&gt;
 *     &lt;enumeration value="BuildingError"/&gt;
 *     &lt;enumeration value="Building"/&gt;
 *     &lt;enumeration value="Ready"/&gt;
 *     &lt;enumeration value="Running"/&gt;
 *     &lt;enumeration value="Paused"/&gt;
 *     &lt;enumeration value="Stopped"/&gt;
 *     &lt;enumeration value="Scheduled"/&gt;
 *     &lt;enumeration value="AwaitingTrigger"/&gt;
 *     &lt;enumeration value="InactiveTrigger"/&gt;
 *     &lt;enumeration value="Skipped"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="New"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AutomationStatus")
@XmlEnum
public enum AutomationStatus {

    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("BuildingError")
    BUILDING_ERROR("BuildingError"),
    @XmlEnumValue("Building")
    BUILDING("Building"),
    @XmlEnumValue("Ready")
    READY("Ready"),
    @XmlEnumValue("Running")
    RUNNING("Running"),
    @XmlEnumValue("Paused")
    PAUSED("Paused"),
    @XmlEnumValue("Stopped")
    STOPPED("Stopped"),
    @XmlEnumValue("Scheduled")
    SCHEDULED("Scheduled"),
    @XmlEnumValue("AwaitingTrigger")
    AWAITING_TRIGGER("AwaitingTrigger"),
    @XmlEnumValue("InactiveTrigger")
    INACTIVE_TRIGGER("InactiveTrigger"),
    @XmlEnumValue("Skipped")
    SKIPPED("Skipped"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("New")
    NEW("New");
    private final String value;

    AutomationStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AutomationStatus fromValue(String v) {
        for (AutomationStatus c: AutomationStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
