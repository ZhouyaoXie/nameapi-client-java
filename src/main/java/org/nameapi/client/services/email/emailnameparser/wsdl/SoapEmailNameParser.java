
package org.nameapi.client.services.email.emailnameparser.wsdl;

import org.nameapi.client.commonwsdl.context.SoapContext;
import org.nameapi.client.commonwsdl.exception.AccessDeniedWebServiceException;
import org.nameapi.client.commonwsdl.exception.InternalServerErrorWebServiceException;
import org.nameapi.client.commonwsdl.exception.InvalidInputWebServiceException;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SoapEmailNameParser", targetNamespace = "http://emailnameparser.email.services.v4_0.soap.server.nameapi.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SoapEmailNameParser {


    /**
     * 
     * @param context
     * @param emailAddress
     * @return
     *     returns org.nameapi.client.services.email.emailnameparser.wsdl.SoapEmailNameParserResult
     * @throws InvalidInputWebServiceException
     * @throws InternalServerErrorWebServiceException
     * @throws AccessDeniedWebServiceException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "parse", targetNamespace = "http://emailnameparser.email.services.v4_0.soap.server.nameapi.org/", className = "org.nameapi.client.services.email.emailnameparser.wsdl.Parse")
    @ResponseWrapper(localName = "parseResponse", targetNamespace = "http://emailnameparser.email.services.v4_0.soap.server.nameapi.org/", className = "org.nameapi.client.services.email.emailnameparser.wsdl.ParseResponse")
    @Action(input = "http://emailnameparser.email.services.v4_0.soap.server.nameapi.org/SoapEmailNameParser/parseRequest", output = "http://emailnameparser.email.services.v4_0.soap.server.nameapi.org/SoapEmailNameParser/parseResponse", fault = {
        @FaultAction(className = AccessDeniedWebServiceException.class, value = "http://emailnameparser.email.services.v4_0.soap.server.nameapi.org/SoapEmailNameParser/parse/Fault/AccessDeniedWebServiceException"),
        @FaultAction(className = InvalidInputWebServiceException.class, value = "http://emailnameparser.email.services.v4_0.soap.server.nameapi.org/SoapEmailNameParser/parse/Fault/InvalidInputWebServiceException"),
        @FaultAction(className = InternalServerErrorWebServiceException.class, value = "http://emailnameparser.email.services.v4_0.soap.server.nameapi.org/SoapEmailNameParser/parse/Fault/InternalServerErrorWebServiceException")
    })
    public SoapEmailNameParserResult parse(
        @WebParam(name = "context", targetNamespace = "")
        SoapContext context,
        @WebParam(name = "emailAddress", targetNamespace = "")
        String emailAddress)
        throws AccessDeniedWebServiceException, InternalServerErrorWebServiceException, InvalidInputWebServiceException
    ;

}