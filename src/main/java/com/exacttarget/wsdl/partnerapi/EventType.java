
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EventType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Open"/&gt;
 *     &lt;enumeration value="Click"/&gt;
 *     &lt;enumeration value="HardBounce"/&gt;
 *     &lt;enumeration value="SoftBounce"/&gt;
 *     &lt;enumeration value="OtherBounce"/&gt;
 *     &lt;enumeration value="Unsubscribe"/&gt;
 *     &lt;enumeration value="Sent"/&gt;
 *     &lt;enumeration value="NotSent"/&gt;
 *     &lt;enumeration value="Survey"/&gt;
 *     &lt;enumeration value="ForwardedEmail"/&gt;
 *     &lt;enumeration value="ForwardedEmailOptIn"/&gt;
 *     &lt;enumeration value="DeliveredEvent"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EventType")
@XmlEnum
public enum EventType {

    @XmlEnumValue("Open")
    OPEN("Open"),
    @XmlEnumValue("Click")
    CLICK("Click"),
    @XmlEnumValue("HardBounce")
    HARD_BOUNCE("HardBounce"),
    @XmlEnumValue("SoftBounce")
    SOFT_BOUNCE("SoftBounce"),
    @XmlEnumValue("OtherBounce")
    OTHER_BOUNCE("OtherBounce"),
    @XmlEnumValue("Unsubscribe")
    UNSUBSCRIBE("Unsubscribe"),
    @XmlEnumValue("Sent")
    SENT("Sent"),
    @XmlEnumValue("NotSent")
    NOT_SENT("NotSent"),
    @XmlEnumValue("Survey")
    SURVEY("Survey"),
    @XmlEnumValue("ForwardedEmail")
    FORWARDED_EMAIL("ForwardedEmail"),
    @XmlEnumValue("ForwardedEmailOptIn")
    FORWARDED_EMAIL_OPT_IN("ForwardedEmailOptIn"),
    @XmlEnumValue("DeliveredEvent")
    DELIVERED_EVENT("DeliveredEvent");
    private final String value;

    EventType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EventType fromValue(String v) {
        for (EventType c: EventType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
