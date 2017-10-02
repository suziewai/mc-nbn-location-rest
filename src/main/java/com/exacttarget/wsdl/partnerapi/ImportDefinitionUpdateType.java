
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImportDefinitionUpdateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ImportDefinitionUpdateType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AddAndUpdate"/&gt;
 *     &lt;enumeration value="AddAndDoNotUpdate"/&gt;
 *     &lt;enumeration value="UpdateButDoNotAdd"/&gt;
 *     &lt;enumeration value="Merge"/&gt;
 *     &lt;enumeration value="Overwrite"/&gt;
 *     &lt;enumeration value="ColumnBased"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ImportDefinitionUpdateType")
@XmlEnum
public enum ImportDefinitionUpdateType {

    @XmlEnumValue("AddAndUpdate")
    ADD_AND_UPDATE("AddAndUpdate"),
    @XmlEnumValue("AddAndDoNotUpdate")
    ADD_AND_DO_NOT_UPDATE("AddAndDoNotUpdate"),
    @XmlEnumValue("UpdateButDoNotAdd")
    UPDATE_BUT_DO_NOT_ADD("UpdateButDoNotAdd"),
    @XmlEnumValue("Merge")
    MERGE("Merge"),
    @XmlEnumValue("Overwrite")
    OVERWRITE("Overwrite"),
    @XmlEnumValue("ColumnBased")
    COLUMN_BASED("ColumnBased");
    private final String value;

    ImportDefinitionUpdateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImportDefinitionUpdateType fromValue(String v) {
        for (ImportDefinitionUpdateType c: ImportDefinitionUpdateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
