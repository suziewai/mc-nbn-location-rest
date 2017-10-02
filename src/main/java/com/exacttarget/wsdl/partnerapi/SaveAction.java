
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SaveAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SaveAction"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AddOnly"/&gt;
 *     &lt;enumeration value="Default"/&gt;
 *     &lt;enumeration value="Nothing"/&gt;
 *     &lt;enumeration value="UpdateAdd"/&gt;
 *     &lt;enumeration value="UpdateOnly"/&gt;
 *     &lt;enumeration value="Delete"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SaveAction")
@XmlEnum
public enum SaveAction {

    @XmlEnumValue("AddOnly")
    ADD_ONLY("AddOnly"),
    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Nothing")
    NOTHING("Nothing"),
    @XmlEnumValue("UpdateAdd")
    UPDATE_ADD("UpdateAdd"),
    @XmlEnumValue("UpdateOnly")
    UPDATE_ONLY("UpdateOnly"),
    @XmlEnumValue("Delete")
    DELETE("Delete");
    private final String value;

    SaveAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SaveAction fromValue(String v) {
        for (SaveAction c: SaveAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
