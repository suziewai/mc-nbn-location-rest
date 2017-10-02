
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LayoutType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LayoutType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="HTMLWrapped"/&gt;
 *     &lt;enumeration value="RawText"/&gt;
 *     &lt;enumeration value="SMS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LayoutType")
@XmlEnum
public enum LayoutType {

    @XmlEnumValue("HTMLWrapped")
    HTML_WRAPPED("HTMLWrapped"),
    @XmlEnumValue("RawText")
    RAW_TEXT("RawText"),
    SMS("SMS");
    private final String value;

    LayoutType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LayoutType fromValue(String v) {
        for (LayoutType c: LayoutType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
