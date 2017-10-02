
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutomationSourceTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AutomationSourceTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="FileTrigger"/&gt;
 *     &lt;enumeration value="UserInterface"/&gt;
 *     &lt;enumeration value="UserAPI"/&gt;
 *     &lt;enumeration value="RESTApi"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AutomationSourceTypes")
@XmlEnum
public enum AutomationSourceTypes {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("FileTrigger")
    FILE_TRIGGER("FileTrigger"),
    @XmlEnumValue("UserInterface")
    USER_INTERFACE("UserInterface"),
    @XmlEnumValue("UserAPI")
    USER_API("UserAPI"),
    @XmlEnumValue("RESTApi")
    REST_API("RESTApi");
    private final String value;

    AutomationSourceTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AutomationSourceTypes fromValue(String v) {
        for (AutomationSourceTypes c: AutomationSourceTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
