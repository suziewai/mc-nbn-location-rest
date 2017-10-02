
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SuppressionListContextEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SuppressionListContextEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Enterprise"/&gt;
 *     &lt;enumeration value="BusinessUnit"/&gt;
 *     &lt;enumeration value="SendClassification"/&gt;
 *     &lt;enumeration value="Send"/&gt;
 *     &lt;enumeration value="Global"/&gt;
 *     &lt;enumeration value="SenderProfile"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SuppressionListContextEnum")
@XmlEnum
public enum SuppressionListContextEnum {

    @XmlEnumValue("Enterprise")
    ENTERPRISE("Enterprise"),
    @XmlEnumValue("BusinessUnit")
    BUSINESS_UNIT("BusinessUnit"),
    @XmlEnumValue("SendClassification")
    SEND_CLASSIFICATION("SendClassification"),
    @XmlEnumValue("Send")
    SEND("Send"),
    @XmlEnumValue("Global")
    GLOBAL("Global"),
    @XmlEnumValue("SenderProfile")
    SENDER_PROFILE("SenderProfile");
    private final String value;

    SuppressionListContextEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SuppressionListContextEnum fromValue(String v) {
        for (SuppressionListContextEnum c: SuppressionListContextEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
