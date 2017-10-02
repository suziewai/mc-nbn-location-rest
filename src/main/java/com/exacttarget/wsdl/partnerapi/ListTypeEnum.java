
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ListTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Public"/&gt;
 *     &lt;enumeration value="Private"/&gt;
 *     &lt;enumeration value="SalesForce"/&gt;
 *     &lt;enumeration value="GlobalUnsubscribe"/&gt;
 *     &lt;enumeration value="Master"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ListTypeEnum")
@XmlEnum
public enum ListTypeEnum {

    @XmlEnumValue("Public")
    PUBLIC("Public"),
    @XmlEnumValue("Private")
    PRIVATE("Private"),
    @XmlEnumValue("SalesForce")
    SALES_FORCE("SalesForce"),
    @XmlEnumValue("GlobalUnsubscribe")
    GLOBAL_UNSUBSCRIBE("GlobalUnsubscribe"),
    @XmlEnumValue("Master")
    MASTER("Master");
    private final String value;

    ListTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListTypeEnum fromValue(String v) {
        for (ListTypeEnum c: ListTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
