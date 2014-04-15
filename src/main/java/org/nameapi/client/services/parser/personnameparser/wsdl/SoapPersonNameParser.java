
package org.nameapi.client.services.parser.personnameparser.wsdl;

import org.nameapi.client.commonwsdl.context.SoapContext;
import org.nameapi.client.commonwsdl.exception.AccessDeniedWebServiceException;
import org.nameapi.client.commonwsdl.exception.InternalServerErrorWebServiceException;
import org.nameapi.client.commonwsdl.exception.InvalidInputWebServiceException;
import org.nameapi.client.commonwsdl.person.SoapSimpleNaturalPerson;

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
@WebService(name = "SoapPersonNameParser", targetNamespace = "http://personnameparser.parser.services.v4_0.soap.server.nameapi.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SoapPersonNameParser {


    /**
     * 
     * @param person
     * @param context
     * @return
     *     returns org.nameapi.client.services.parser.personnameparser.wsdl.SoapPersonNameParserResult
     * @throws AccessDeniedWebServiceException
     * @throws InvalidInputWebServiceException
     * @throws InternalServerErrorWebServiceException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "parse", targetNamespace = "http://personnameparser.parser.services.v4_0.soap.server.nameapi.org/", className = "org.nameapi.client.services.parser.personnameparser.wsdl.Parse")
    @ResponseWrapper(localName = "parseResponse", targetNamespace = "http://personnameparser.parser.services.v4_0.soap.server.nameapi.org/", className = "org.nameapi.client.services.parser.personnameparser.wsdl.ParseResponse")
    @Action(input = "http://personnameparser.parser.services.v4_0.soap.server.nameapi.org/SoapPersonNameParser/parseRequest", output = "http://personnameparser.parser.services.v4_0.soap.server.nameapi.org/SoapPersonNameParser/parseResponse", fault = {
        @FaultAction(className = AccessDeniedWebServiceException.class, value = "http://personnameparser.parser.services.v4_0.soap.server.nameapi.org/SoapPersonNameParser/parse/Fault/AccessDeniedWebServiceException"),
        @FaultAction(className = InvalidInputWebServiceException.class, value = "http://personnameparser.parser.services.v4_0.soap.server.nameapi.org/SoapPersonNameParser/parse/Fault/InvalidInputWebServiceException"),
        @FaultAction(className = InternalServerErrorWebServiceException.class, value = "http://personnameparser.parser.services.v4_0.soap.server.nameapi.org/SoapPersonNameParser/parse/Fault/InternalServerErrorWebServiceException")
    })
    public SoapPersonNameParserResult parse(
        @WebParam(name = "context", targetNamespace = "")
        SoapContext context,
        @WebParam(name = "person", targetNamespace = "")
        SoapSimpleNaturalPerson person)
        throws AccessDeniedWebServiceException, InternalServerErrorWebServiceException, InvalidInputWebServiceException
    ;

}