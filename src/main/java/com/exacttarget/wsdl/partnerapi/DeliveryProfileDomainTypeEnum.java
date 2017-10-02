
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryProfileDomainTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliveryProfileDomainTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DefaultDomain"/&gt;
 *     &lt;enumeration value="CustomDomain"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeliveryProfileDomainTypeEnum")
@XmlEnum
public enum DeliveryProfileDomainTypeEnum {

    @XmlEnumValue("DefaultDomain")
    DEFAULT_DOMAIN("DefaultDomain"),
    @XmlEnumValue("CustomDomain")
    CUSTOM_DOMAIN("CustomDomain");
    private final String value;

    DeliveryProfileDomainTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeliveryProfileDomainTypeEnum fromValue(String v) {
        for (DeliveryProfileDomainTypeEnum c: DeliveryProfileDomainTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
