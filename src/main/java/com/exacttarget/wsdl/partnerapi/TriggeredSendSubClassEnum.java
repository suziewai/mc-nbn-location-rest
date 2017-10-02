
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TriggeredSendSubClassEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TriggeredSendSubClassEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Standard"/&gt;
 *     &lt;enumeration value="SenderTemplate"/&gt;
 *     &lt;enumeration value="MarketingCloudTemplate"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TriggeredSendSubClassEnum")
@XmlEnum
public enum TriggeredSendSubClassEnum {

    @XmlEnumValue("Standard")
    STANDARD("Standard"),
    @XmlEnumValue("SenderTemplate")
    SENDER_TEMPLATE("SenderTemplate"),
    @XmlEnumValue("MarketingCloudTemplate")
    MARKETING_CLOUD_TEMPLATE("MarketingCloudTemplate");
    private final String value;

    TriggeredSendSubClassEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TriggeredSendSubClassEnum fromValue(String v) {
        for (TriggeredSendSubClassEnum c: TriggeredSendSubClassEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
