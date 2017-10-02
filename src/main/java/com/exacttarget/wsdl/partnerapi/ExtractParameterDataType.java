
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtractParameterDataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExtractParameterDataType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="datetime"/&gt;
 *     &lt;enumeration value="bool"/&gt;
 *     &lt;enumeration value="string"/&gt;
 *     &lt;enumeration value="integer"/&gt;
 *     &lt;enumeration value="dropdown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExtractParameterDataType")
@XmlEnum
public enum ExtractParameterDataType {

    @XmlEnumValue("datetime")
    DATETIME("datetime"),
    @XmlEnumValue("bool")
    BOOL("bool"),
    @XmlEnumValue("string")
    STRING("string"),
    @XmlEnumValue("integer")
    INTEGER("integer"),
    @XmlEnumValue("dropdown")
    DROPDOWN("dropdown");
    private final String value;

    ExtractParameterDataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExtractParameterDataType fromValue(String v) {
        for (ExtractParameterDataType c: ExtractParameterDataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
