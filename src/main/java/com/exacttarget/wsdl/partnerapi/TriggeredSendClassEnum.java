
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TriggeredSendClassEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TriggeredSendClassEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Standard"/&gt;
 *     &lt;enumeration value="SMTPRestV1"/&gt;
 *     &lt;enumeration value="SMTPRestV2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TriggeredSendClassEnum")
@XmlEnum
public enum TriggeredSendClassEnum {

    @XmlEnumValue("Standard")
    STANDARD("Standard"),
    @XmlEnumValue("SMTPRestV1")
    SMTP_REST_V_1("SMTPRestV1"),
    @XmlEnumValue("SMTPRestV2")
    SMTP_REST_V_2("SMTPRestV2");
    private final String value;

    TriggeredSendClassEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TriggeredSendClassEnum fromValue(String v) {
        for (TriggeredSendClassEnum c: TriggeredSendClassEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
