
package org.nameapi.client.services.email.disposableemailaddressdetector.wsdl;

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
@WebServiceClient(name = "SoapDisposableEmailAddressDetectorService", targetNamespace = "http://disposableemailaddressdetector.email.services.v4_0.soap.server.nameapi.org/", wsdlLocation = "http://api.nameapi.org:80/soap/v4.0/email/disposableemailaddressdetector?wsdl")
public class SoapDisposableEmailAddressDetectorService
    extends Service
{

    private final static URL SOAPDISPOSABLEEMAILADDRESSDETECTORSERVICE_WSDL_LOCATION;
    private final static WebServiceException SOAPDISPOSABLEEMAILADDRESSDETECTORSERVICE_EXCEPTION;
    private final static QName SOAPDISPOSABLEEMAILADDRESSDETECTORSERVICE_QNAME = new QName("http://disposableemailaddressdetector.email.services.v4_0.soap.server.nameapi.org/", "SoapDisposableEmailAddressDetectorService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://api.nameapi.org:80/soap/v4.0/email/disposableemailaddressdetector?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SOAPDISPOSABLEEMAILADDRESSDETECTORSERVICE_WSDL_LOCATION = url;
        SOAPDISPOSABLEEMAILADDRESSDETECTORSERVICE_EXCEPTION = e;
    }

    public SoapDisposableEmailAddressDetectorService() {
        super(__getWsdlLocation(), SOAPDISPOSABLEEMAILADDRESSDETECTORSERVICE_QNAME);
    }

    public SoapDisposableEmailAddressDetectorService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SOAPDISPOSABLEEMAILADDRESSDETECTORSERVICE_QNAME, features);
    }

    public SoapDisposableEmailAddressDetectorService(URL wsdlLocation) {
        super(wsdlLocation, SOAPDISPOSABLEEMAILADDRESSDETECTORSERVICE_QNAME);
    }

    public SoapDisposableEmailAddressDetectorService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SOAPDISPOSABLEEMAILADDRESSDETECTORSERVICE_QNAME, features);
    }

    public SoapDisposableEmailAddressDetectorService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SoapDisposableEmailAddressDetectorService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SoapDisposableEmailAddressDetector
     */
    @WebEndpoint(name = "SoapDisposableEmailAddressDetectorPort")
    public SoapDisposableEmailAddressDetector getSoapDisposableEmailAddressDetectorPort() {
        return super.getPort(new QName("http://disposableemailaddressdetector.email.services.v4_0.soap.server.nameapi.org/", "SoapDisposableEmailAddressDetectorPort"), SoapDisposableEmailAddressDetector.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SoapDisposableEmailAddressDetector
     */
    @WebEndpoint(name = "SoapDisposableEmailAddressDetectorPort")
    public SoapDisposableEmailAddressDetector getSoapDisposableEmailAddressDetectorPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://disposableemailaddressdetector.email.services.v4_0.soap.server.nameapi.org/", "SoapDisposableEmailAddressDetectorPort"), SoapDisposableEmailAddressDetector.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SOAPDISPOSABLEEMAILADDRESSDETECTORSERVICE_EXCEPTION!= null) {
            throw SOAPDISPOSABLEEMAILADDRESSDETECTORSERVICE_EXCEPTION;
        }
        return SOAPDISPOSABLEEMAILADDRESSDETECTORSERVICE_WSDL_LOCATION;
    }

}