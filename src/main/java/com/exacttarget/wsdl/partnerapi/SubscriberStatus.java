
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriberStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SubscriberStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Active"/&gt;
 *     &lt;enumeration value="Bounced"/&gt;
 *     &lt;enumeration value="Held"/&gt;
 *     &lt;enumeration value="Unsubscribed"/&gt;
 *     &lt;enumeration value="Deleted"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SubscriberStatus")
@XmlEnum
public enum SubscriberStatus {

    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Bounced")
    BOUNCED("Bounced"),
    @XmlEnumValue("Held")
    HELD("Held"),
    @XmlEnumValue("Unsubscribed")
    UNSUBSCRIBED("Unsubscribed"),
    @XmlEnumValue("Deleted")
    DELETED("Deleted");
    private final String value;

    SubscriberStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SubscriberStatus fromValue(String v) {
        for (SubscriberStatus c: SubscriberStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
