
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutomationTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AutomationTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="scheduled"/&gt;
 *     &lt;enumeration value="triggered"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AutomationTypes")
@XmlEnum
public enum AutomationTypes {

    @XmlEnumValue("scheduled")
    SCHEDULED("scheduled"),
    @XmlEnumValue("triggered")
    TRIGGERED("triggered");
    private final String value;

    AutomationTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AutomationTypes fromValue(String v) {
        for (AutomationTypes c: AutomationTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
