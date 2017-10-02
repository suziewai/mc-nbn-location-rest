
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OverrideType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OverrideType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DoNotOverride"/&gt;
 *     &lt;enumeration value="Override"/&gt;
 *     &lt;enumeration value="OverrideExceptWhenNull"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OverrideType")
@XmlEnum
public enum OverrideType {

    @XmlEnumValue("DoNotOverride")
    DO_NOT_OVERRIDE("DoNotOverride"),
    @XmlEnumValue("Override")
    OVERRIDE("Override"),
    @XmlEnumValue("OverrideExceptWhenNull")
    OVERRIDE_EXCEPT_WHEN_NULL("OverrideExceptWhenNull");
    private final String value;

    OverrideType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OverrideType fromValue(String v) {
        for (OverrideType c: OverrideType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
