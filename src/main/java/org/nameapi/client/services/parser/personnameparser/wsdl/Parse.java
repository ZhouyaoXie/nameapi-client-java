
package org.nameapi.client.services.parser.personnameparser.wsdl;

import org.nameapi.client.commonwsdl.context.SoapContext;
import org.nameapi.client.commonwsdl.person.SoapSimpleNaturalPerson;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for parse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="context" type="{http://personnameparser.parser.services.v4_0.soap.server.nameapi.org/}soapContext"/>
 *         &lt;element name="person" type="{http://personnameparser.parser.services.v4_0.soap.server.nameapi.org/}soapSimpleNaturalPerson"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parse", propOrder = {
    "context",
    "person"
})
public class Parse {

    @XmlElement(required = true)
    protected SoapContext context;
    @XmlElement(required = true)
    protected SoapSimpleNaturalPerson person;

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link SoapContext }
     *     
     */
    public SoapContext getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapContext }
     *     
     */
    public void setContext(SoapContext value) {
        this.context = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link SoapSimpleNaturalPerson }
     *     
     */
    public SoapSimpleNaturalPerson getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapSimpleNaturalPerson }
     *     
     */
    public void setPerson(SoapSimpleNaturalPerson value) {
        this.person = value;
    }

}
