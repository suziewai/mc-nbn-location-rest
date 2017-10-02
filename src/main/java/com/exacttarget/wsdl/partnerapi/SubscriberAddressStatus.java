
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriberAddressStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SubscriberAddressStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OptedIn"/&gt;
 *     &lt;enumeration value="OptedOut"/&gt;
 *     &lt;enumeration value="InActive"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SubscriberAddressStatus")
@XmlEnum
public enum SubscriberAddressStatus {

    @XmlEnumValue("OptedIn")
    OPTED_IN("OptedIn"),
    @XmlEnumValue("OptedOut")
    OPTED_OUT("OptedOut"),
    @XmlEnumValue("InActive")
    IN_ACTIVE("InActive");
    private final String value;

    SubscriberAddressStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SubscriberAddressStatus fromValue(String v) {
        for (SubscriberAddressStatus c: SubscriberAddressStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
