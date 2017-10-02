
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryProfileSourceAddressTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliveryProfileSourceAddressTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DefaultPrivateIPAddress"/&gt;
 *     &lt;enumeration value="CustomPrivateIPAddress"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeliveryProfileSourceAddressTypeEnum")
@XmlEnum
public enum DeliveryProfileSourceAddressTypeEnum {

    @XmlEnumValue("DefaultPrivateIPAddress")
    DEFAULT_PRIVATE_IP_ADDRESS("DefaultPrivateIPAddress"),
    @XmlEnumValue("CustomPrivateIPAddress")
    CUSTOM_PRIVATE_IP_ADDRESS("CustomPrivateIPAddress");
    private final String value;

    DeliveryProfileSourceAddressTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeliveryProfileSourceAddressTypeEnum fromValue(String v) {
        for (DeliveryProfileSourceAddressTypeEnum c: DeliveryProfileSourceAddressTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
