
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AsyncResponseType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AsyncResponseType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="email"/&gt;
 *     &lt;enumeration value="FTP"/&gt;
 *     &lt;enumeration value="HTTPPost"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AsyncResponseType")
@XmlEnum
public enum AsyncResponseType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("email")
    EMAIL("email"),
    FTP("FTP"),
    @XmlEnumValue("HTTPPost")
    HTTP_POST("HTTPPost");
    private final String value;

    AsyncResponseType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AsyncResponseType fromValue(String v) {
        for (AsyncResponseType c: AsyncResponseType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
