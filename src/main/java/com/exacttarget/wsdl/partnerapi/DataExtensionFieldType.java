
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataExtensionFieldType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DataExtensionFieldType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Text"/&gt;
 *     &lt;enumeration value="Number"/&gt;
 *     &lt;enumeration value="Date"/&gt;
 *     &lt;enumeration value="Boolean"/&gt;
 *     &lt;enumeration value="EmailAddress"/&gt;
 *     &lt;enumeration value="Phone"/&gt;
 *     &lt;enumeration value="Decimal"/&gt;
 *     &lt;enumeration value="Locale"/&gt;
 *     &lt;enumeration value="Base16Encrypted"/&gt;
 *     &lt;enumeration value="Base16EncryptedEmail"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataExtensionFieldType")
@XmlEnum
public enum DataExtensionFieldType {

    @XmlEnumValue("Text")
    TEXT("Text"),
    @XmlEnumValue("Number")
    NUMBER("Number"),
    @XmlEnumValue("Date")
    DATE("Date"),
    @XmlEnumValue("Boolean")
    BOOLEAN("Boolean"),
    @XmlEnumValue("EmailAddress")
    EMAIL_ADDRESS("EmailAddress"),
    @XmlEnumValue("Phone")
    PHONE("Phone"),
    @XmlEnumValue("Decimal")
    DECIMAL("Decimal"),
    @XmlEnumValue("Locale")
    LOCALE("Locale"),
    @XmlEnumValue("Base16Encrypted")
    BASE_16_ENCRYPTED("Base16Encrypted"),
    @XmlEnumValue("Base16EncryptedEmail")
    BASE_16_ENCRYPTED_EMAIL("Base16EncryptedEmail");
    private final String value;

    DataExtensionFieldType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataExtensionFieldType fromValue(String v) {
        for (DataExtensionFieldType c: DataExtensionFieldType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
