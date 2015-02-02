
package org.nameapi.client.services.email.emailnameparser2.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for parseResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parseResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://emailnameparser2.email.services.v4_0.soap.server.nameapi.org/}soapEmailNameParserResult2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parseResponse", propOrder = {
    "_return"
})
public class ParseResponse {

    @XmlElement(name = "return")
    protected SoapEmailNameParserResult2 _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link SoapEmailNameParserResult2 }
     *     
     */
    public SoapEmailNameParserResult2 getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapEmailNameParserResult2 }
     *     
     */
    public void setReturn(SoapEmailNameParserResult2 value) {
        this._return = value;
    }

}