
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataExtensionFieldStorageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DataExtensionFieldStorageType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unspecified"/&gt;
 *     &lt;enumeration value="Plain"/&gt;
 *     &lt;enumeration value="Obfuscated"/&gt;
 *     &lt;enumeration value="Encrypted"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataExtensionFieldStorageType")
@XmlEnum
public enum DataExtensionFieldStorageType {

    @XmlEnumValue("Unspecified")
    UNSPECIFIED("Unspecified"),
    @XmlEnumValue("Plain")
    PLAIN("Plain"),
    @XmlEnumValue("Obfuscated")
    OBFUSCATED("Obfuscated"),
    @XmlEnumValue("Encrypted")
    ENCRYPTED("Encrypted");
    private final String value;

    DataExtensionFieldStorageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataExtensionFieldStorageType fromValue(String v) {
        for (DataExtensionFieldStorageType c: DataExtensionFieldStorageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
