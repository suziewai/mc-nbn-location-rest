
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="EXACTTARGET"/&gt;
 *     &lt;enumeration value="PRO_CONNECT"/&gt;
 *     &lt;enumeration value="CHANNEL_CONNECT"/&gt;
 *     &lt;enumeration value="CONNECT"/&gt;
 *     &lt;enumeration value="PRO_CONNECT_CLIENT"/&gt;
 *     &lt;enumeration value="LP_MEMBER"/&gt;
 *     &lt;enumeration value="DOTO_MEMBER"/&gt;
 *     &lt;enumeration value="ENTERPRISE_2"/&gt;
 *     &lt;enumeration value="BUSINESS_UNIT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccountTypeEnum")
@XmlEnum
public enum AccountTypeEnum {

    @XmlEnumValue("None")
    NONE("None"),
    EXACTTARGET("EXACTTARGET"),
    PRO_CONNECT("PRO_CONNECT"),
    CHANNEL_CONNECT("CHANNEL_CONNECT"),
    CONNECT("CONNECT"),
    PRO_CONNECT_CLIENT("PRO_CONNECT_CLIENT"),
    LP_MEMBER("LP_MEMBER"),
    DOTO_MEMBER("DOTO_MEMBER"),
    ENTERPRISE_2("ENTERPRISE_2"),
    BUSINESS_UNIT("BUSINESS_UNIT");
    private final String value;

    AccountTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountTypeEnum fromValue(String v) {
        for (AccountTypeEnum c: AccountTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
