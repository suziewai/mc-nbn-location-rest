
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SimpleOperators.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SimpleOperators"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="equals"/&gt;
 *     &lt;enumeration value="notEquals"/&gt;
 *     &lt;enumeration value="greaterThan"/&gt;
 *     &lt;enumeration value="lessThan"/&gt;
 *     &lt;enumeration value="isNull"/&gt;
 *     &lt;enumeration value="isNotNull"/&gt;
 *     &lt;enumeration value="greaterThanOrEqual"/&gt;
 *     &lt;enumeration value="lessThanOrEqual"/&gt;
 *     &lt;enumeration value="between"/&gt;
 *     &lt;enumeration value="IN"/&gt;
 *     &lt;enumeration value="like"/&gt;
 *     &lt;enumeration value="existsInString"/&gt;
 *     &lt;enumeration value="existsInStringAsAWord"/&gt;
 *     &lt;enumeration value="notExistsInString"/&gt;
 *     &lt;enumeration value="beginsWith"/&gt;
 *     &lt;enumeration value="endsWith"/&gt;
 *     &lt;enumeration value="contains"/&gt;
 *     &lt;enumeration value="notContains"/&gt;
 *     &lt;enumeration value="isAnniversary"/&gt;
 *     &lt;enumeration value="isNotAnniversary"/&gt;
 *     &lt;enumeration value="greaterThanAnniversary"/&gt;
 *     &lt;enumeration value="lessThanAnniversary"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SimpleOperators")
@XmlEnum
public enum SimpleOperators {

    @XmlEnumValue("equals")
    EQUALS("equals"),
    @XmlEnumValue("notEquals")
    NOT_EQUALS("notEquals"),
    @XmlEnumValue("greaterThan")
    GREATER_THAN("greaterThan"),
    @XmlEnumValue("lessThan")
    LESS_THAN("lessThan"),
    @XmlEnumValue("isNull")
    IS_NULL("isNull"),
    @XmlEnumValue("isNotNull")
    IS_NOT_NULL("isNotNull"),
    @XmlEnumValue("greaterThanOrEqual")
    GREATER_THAN_OR_EQUAL("greaterThanOrEqual"),
    @XmlEnumValue("lessThanOrEqual")
    LESS_THAN_OR_EQUAL("lessThanOrEqual"),
    @XmlEnumValue("between")
    BETWEEN("between"),
    IN("IN"),
    @XmlEnumValue("like")
    LIKE("like"),
    @XmlEnumValue("existsInString")
    EXISTS_IN_STRING("existsInString"),
    @XmlEnumValue("existsInStringAsAWord")
    EXISTS_IN_STRING_AS_A_WORD("existsInStringAsAWord"),
    @XmlEnumValue("notExistsInString")
    NOT_EXISTS_IN_STRING("notExistsInString"),
    @XmlEnumValue("beginsWith")
    BEGINS_WITH("beginsWith"),
    @XmlEnumValue("endsWith")
    ENDS_WITH("endsWith"),
    @XmlEnumValue("contains")
    CONTAINS("contains"),
    @XmlEnumValue("notContains")
    NOT_CONTAINS("notContains"),
    @XmlEnumValue("isAnniversary")
    IS_ANNIVERSARY("isAnniversary"),
    @XmlEnumValue("isNotAnniversary")
    IS_NOT_ANNIVERSARY("isNotAnniversary"),
    @XmlEnumValue("greaterThanAnniversary")
    GREATER_THAN_ANNIVERSARY("greaterThanAnniversary"),
    @XmlEnumValue("lessThanAnniversary")
    LESS_THAN_ANNIVERSARY("lessThanAnniversary");
    private final String value;

    SimpleOperators(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SimpleOperators fromValue(String v) {
        for (SimpleOperators c: SimpleOperators.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
