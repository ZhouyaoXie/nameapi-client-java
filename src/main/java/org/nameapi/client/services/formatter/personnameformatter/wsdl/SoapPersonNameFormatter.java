
package org.nameapi.client.services.formatter.personnameformatter.wsdl;

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
@WebService(name = "SoapPersonNameFormatter", targetNamespace = "http://personnameformatter.formatter.services.v4_0.soap.server.nameapi.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SoapPersonNameFormatter {


    /**
     * 
     * @param person
     * @param context
     * @param properties
     * @return
     *     returns org.nameapi.client.services.formatter.personnameformatter.wsdl.SoapFormatterResult
     * @throws InternalServerErrorWebServiceException
     * @throws AccessDeniedWebServiceException
     * @throws InvalidInputWebServiceException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "format", targetNamespace = "http://personnameformatter.formatter.services.v4_0.soap.server.nameapi.org/", className = "org.nameapi.client.services.formatter.personnameformatter.wsdl.Format")
    @ResponseWrapper(localName = "formatResponse", targetNamespace = "http://personnameformatter.formatter.services.v4_0.soap.server.nameapi.org/", className = "org.nameapi.client.services.formatter.personnameformatter.wsdl.FormatResponse")
    @Action(input = "http://personnameformatter.formatter.services.v4_0.soap.server.nameapi.org/SoapPersonNameFormatter/formatRequest", output = "http://personnameformatter.formatter.services.v4_0.soap.server.nameapi.org/SoapPersonNameFormatter/formatResponse", fault = {
        @FaultAction(className = AccessDeniedWebServiceException.class, value = "http://personnameformatter.formatter.services.v4_0.soap.server.nameapi.org/SoapPersonNameFormatter/format/Fault/AccessDeniedWebServiceException"),
        @FaultAction(className = InvalidInputWebServiceException.class, value = "http://personnameformatter.formatter.services.v4_0.soap.server.nameapi.org/SoapPersonNameFormatter/format/Fault/InvalidInputWebServiceException"),
        @FaultAction(className = InternalServerErrorWebServiceException.class, value = "http://personnameformatter.formatter.services.v4_0.soap.server.nameapi.org/SoapPersonNameFormatter/format/Fault/InternalServerErrorWebServiceException")
    })
    public SoapFormatterResult format(
        @WebParam(name = "context", targetNamespace = "")
        SoapContext context,
        @WebParam(name = "person", targetNamespace = "")
        SoapSimpleNaturalPerson person,
        @WebParam(name = "properties", targetNamespace = "")
        SoapFormatterProperties properties)
        throws AccessDeniedWebServiceException, InternalServerErrorWebServiceException, InvalidInputWebServiceException
    ;

}