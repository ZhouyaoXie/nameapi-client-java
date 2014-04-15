
package org.nameapi.client.services.nameparser.fieldnameparser.wsdl;

import org.nameapi.client.commonwsdl.context.SoapContext;
import org.nameapi.client.commonwsdl.exception.FaultBean;
import org.nameapi.client.commonwsdl.person.SoapNameField;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.nameapi.client.services.nameparser.fieldnameparser.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Parse_QNAME = new QName("http://fieldnameparser.nameparser.services.v4_0.soap.server.nameapi.org/", "parse");
    private final static QName _InternalServerErrorWebServiceException_QNAME = new QName("http://fieldnameparser.nameparser.services.v4_0.soap.server.nameapi.org/", "InternalServerErrorWebServiceException");
    private final static QName _InvalidInputWebServiceException_QNAME = new QName("http://fieldnameparser.nameparser.services.v4_0.soap.server.nameapi.org/", "InvalidInputWebServiceException");
    private final static QName _ParseResponse_QNAME = new QName("http://fieldnameparser.nameparser.services.v4_0.soap.server.nameapi.org/", "parseResponse");
    private final static QName _AccessDeniedWebServiceException_QNAME = new QName("http://fieldnameparser.nameparser.services.v4_0.soap.server.nameapi.org/", "AccessDeniedWebServiceException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.nameapi.client.services.nameparser.fieldnameparser.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SoapContext }
     * 
     */
    public SoapContext createSoapContext() {
        return new SoapContext();
    }

    /**
     * Create an instance of {@link SoapContext.Properties }
     * 
     */
    public SoapContext.Properties createSoapContextProperties() {
        return new SoapContext.Properties();
    }

    /**
     * Create an instance of {@link FaultBean }
     * 
     */
    public FaultBean createFaultBean() {
        return new FaultBean();
    }

    /**
     * Create an instance of {@link ParseResponse }
     * 
     */
    public ParseResponse createParseResponse() {
        return new ParseResponse();
    }

    /**
     * Create an instance of {@link Parse }
     * 
     */
    public Parse createParse() {
        return new Parse();
    }

    /**
     * Create an instance of {@link SoapMatch }
     * 
     */
    public SoapMatch createSoapMatch() {
        return new SoapMatch();
    }

    /**
     * Create an instance of {@link SoapMatchItem }
     * 
     */
    public SoapMatchItem createSoapMatchItem() {
        return new SoapMatchItem();
    }

    /**
     * Create an instance of {@link SoapNameField }
     * 
     */
    public SoapNameField createSoapNameField() {
        return new SoapNameField();
    }

    /**
     * Create an instance of {@link SoapTerm }
     * 
     */
    public SoapTerm createSoapTerm() {
        return new SoapTerm();
    }

    /**
     * Create an instance of {@link SoapFieldNameParserResult }
     * 
     */
    public SoapFieldNameParserResult createSoapFieldNameParserResult() {
        return new SoapFieldNameParserResult();
    }

    /**
     * Create an instance of {@link SoapContext.Properties.Entry }
     * 
     */
    public SoapContext.Properties.Entry createSoapContextPropertiesEntry() {
        return new SoapContext.Properties.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fieldnameparser.nameparser.services.v4_0.soap.server.nameapi.org/", name = "parse")
    public JAXBElement<Parse> createParse(Parse value) {
        return new JAXBElement<Parse>(_Parse_QNAME, Parse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultBean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fieldnameparser.nameparser.services.v4_0.soap.server.nameapi.org/", name = "InternalServerErrorWebServiceException")
    public JAXBElement<FaultBean> createInternalServerErrorWebServiceException(FaultBean value) {
        return new JAXBElement<FaultBean>(_InternalServerErrorWebServiceException_QNAME, FaultBean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultBean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fieldnameparser.nameparser.services.v4_0.soap.server.nameapi.org/", name = "InvalidInputWebServiceException")
    public JAXBElement<FaultBean> createInvalidInputWebServiceException(FaultBean value) {
        return new JAXBElement<FaultBean>(_InvalidInputWebServiceException_QNAME, FaultBean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fieldnameparser.nameparser.services.v4_0.soap.server.nameapi.org/", name = "parseResponse")
    public JAXBElement<ParseResponse> createParseResponse(ParseResponse value) {
        return new JAXBElement<ParseResponse>(_ParseResponse_QNAME, ParseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultBean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fieldnameparser.nameparser.services.v4_0.soap.server.nameapi.org/", name = "AccessDeniedWebServiceException")
    public JAXBElement<FaultBean> createAccessDeniedWebServiceException(FaultBean value) {
        return new JAXBElement<FaultBean>(_AccessDeniedWebServiceException_QNAME, FaultBean.class, null, value);
    }

}