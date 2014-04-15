
package org.nameapi.client.services.email.emailnameparser.wsdl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SoapEmailNameParserService", targetNamespace = "http://emailnameparser.email.services.v4_0.soap.server.nameapi.org/", wsdlLocation = "http://api.nameapi.org:80/soap/v4.0/email/emailnameparser?wsdl")
public class SoapEmailNameParserService
    extends Service
{

    private final static URL SOAPEMAILNAMEPARSERSERVICE_WSDL_LOCATION;
    private final static WebServiceException SOAPEMAILNAMEPARSERSERVICE_EXCEPTION;
    private final static QName SOAPEMAILNAMEPARSERSERVICE_QNAME = new QName("http://emailnameparser.email.services.v4_0.soap.server.nameapi.org/", "SoapEmailNameParserService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://api.nameapi.org:80/soap/v4.0/email/emailnameparser?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SOAPEMAILNAMEPARSERSERVICE_WSDL_LOCATION = url;
        SOAPEMAILNAMEPARSERSERVICE_EXCEPTION = e;
    }

    public SoapEmailNameParserService() {
        super(__getWsdlLocation(), SOAPEMAILNAMEPARSERSERVICE_QNAME);
    }

    public SoapEmailNameParserService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SOAPEMAILNAMEPARSERSERVICE_QNAME, features);
    }

    public SoapEmailNameParserService(URL wsdlLocation) {
        super(wsdlLocation, SOAPEMAILNAMEPARSERSERVICE_QNAME);
    }

    public SoapEmailNameParserService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SOAPEMAILNAMEPARSERSERVICE_QNAME, features);
    }

    public SoapEmailNameParserService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SoapEmailNameParserService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SoapEmailNameParser
     */
    @WebEndpoint(name = "SoapEmailNameParserPort")
    public SoapEmailNameParser getSoapEmailNameParserPort() {
        return super.getPort(new QName("http://emailnameparser.email.services.v4_0.soap.server.nameapi.org/", "SoapEmailNameParserPort"), SoapEmailNameParser.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SoapEmailNameParser
     */
    @WebEndpoint(name = "SoapEmailNameParserPort")
    public SoapEmailNameParser getSoapEmailNameParserPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://emailnameparser.email.services.v4_0.soap.server.nameapi.org/", "SoapEmailNameParserPort"), SoapEmailNameParser.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SOAPEMAILNAMEPARSERSERVICE_EXCEPTION!= null) {
            throw SOAPEMAILNAMEPARSERSERVICE_EXCEPTION;
        }
        return SOAPEMAILNAMEPARSERSERVICE_WSDL_LOCATION;
    }

}