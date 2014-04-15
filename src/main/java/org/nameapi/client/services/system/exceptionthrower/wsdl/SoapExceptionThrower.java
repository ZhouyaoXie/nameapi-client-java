
package org.nameapi.client.services.system.exceptionthrower.wsdl;

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
@WebService(name = "SoapExceptionThrower", targetNamespace = "http://exceptionthrower.system.services.v4_0.soap.server.nameapi.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SoapExceptionThrower {


    /**
     * 
     * @param context
     * @return
     *     returns java.lang.String
     * @throws InternalServerErrorWebServiceException
     * @throws InvalidInputWebServiceException
     * @throws AccessDeniedWebServiceException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "throwInternal", targetNamespace = "http://exceptionthrower.system.services.v4_0.soap.server.nameapi.org/", className = "org.nameapi.client.services.system.exceptionthrower.wsdl.ThrowInternal")
    @ResponseWrapper(localName = "throwInternalResponse", targetNamespace = "http://exceptionthrower.system.services.v4_0.soap.server.nameapi.org/", className = "org.nameapi.client.services.system.exceptionthrower.wsdl.ThrowInternalResponse")
    @Action(input = "http://exceptionthrower.system.services.v4_0.soap.server.nameapi.org/SoapExceptionThrower/throwInternalRequest", output = "http://exceptionthrower.system.services.v4_0.soap.server.nameapi.org/SoapExceptionThrower/throwInternalResponse", fault = {
        @FaultAction(className = AccessDeniedWebServiceException.class, value = "http://exceptionthrower.system.services.v4_0.soap.server.nameapi.org/SoapExceptionThrower/throwInternal/Fault/AccessDeniedWebServiceException"),
        @FaultAction(className = InvalidInputWebServiceException.class, value = "http://exceptionthrower.system.services.v4_0.soap.server.nameapi.org/SoapExceptionThrower/throwInternal/Fault/InvalidInputWebServiceException"),
        @FaultAction(className = InternalServerErrorWebServiceException.class, value = "http://exceptionthrower.system.services.v4_0.soap.server.nameapi.org/SoapExceptionThrower/throwInternal/Fault/InternalServerErrorWebServiceException")
    })
    public String throwInternal(
        @WebParam(name = "context", targetNamespace = "")
        SoapContext context)
        throws AccessDeniedWebServiceException, InternalServerErrorWebServiceException, InvalidInputWebServiceException
    ;

    /**
     * 
     * @param context
     * @return
     *     returns java.lang.String
     * @throws InternalServerErrorWebServiceException
     * @throws InvalidInputWebServiceException
     * @throws AccessDeniedWebServiceException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "throwInvalidInput", targetNamespace = "http://exceptionthrower.system.services.v4_0.soap.server.nameapi.org/", className = "org.nameapi.client.services.system.exceptionthrower.wsdl.ThrowInvalidInput")
    @ResponseWrapper(localName = "throwInvalidInputResponse", targetNamespace = "http://exceptionthrower.system.services.v4_0.soap.server.nameapi.org/", className = "org.nameapi.client.services.system.exceptionthrower.wsdl.ThrowInvalidInputResponse")
    @Action(input = "http://exceptionthrower.system.services.v4_0.soap.server.nameapi.org/SoapExceptionThrower/throwInvalidInputRequest", output = "http://exceptionthrower.system.services.v4_0.soap.server.nameapi.org/SoapExceptionThrower/throwInvalidInputResponse", fault = {
        @FaultAction(className = AccessDeniedWebServiceException.class, value = "http://exceptionthrower.system.services.v4_0.soap.server.nameapi.org/SoapExceptionThrower/throwInvalidInput/Fault/AccessDeniedWebServiceException"),
        @FaultAction(className = InvalidInputWebServiceException.class, value = "http://exceptionthrower.system.services.v4_0.soap.server.nameapi.org/SoapExceptionThrower/throwInvalidInput/Fault/InvalidInputWebServiceException"),
        @FaultAction(className = InternalServerErrorWebServiceException.class, value = "http://exceptionthrower.system.services.v4_0.soap.server.nameapi.org/SoapExceptionThrower/throwInvalidInput/Fault/InternalServerErrorWebServiceException")
    })
    public String throwInvalidInput(
        @WebParam(name = "context", targetNamespace = "")
        SoapContext context)
        throws AccessDeniedWebServiceException, InternalServerErrorWebServiceException, InvalidInputWebServiceException
    ;

    /**
     * 
     * @param context
     * @return
     *     returns java.lang.String
     * @throws InternalServerErrorWebServiceException
     * @throws InvalidInputWebServiceException
     * @throws AccessDeniedWebServiceException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "throwAccessDeniedNoSuchAccount", targetNamespace = "http://exceptionthrower.system.services.v4_0.soap.server.nameapi.org/", className = "org.nameapi.client.services.system.exceptionthrower.wsdl.ThrowAccessDeniedNoSuchAccount")
    @ResponseWrapper(localName = "throwAccessDeniedNoSuchAccountResponse", targetNamespace = "http://exceptionthrower.system.services.v4_0.soap.server.nameapi.org/", className = "org.nameapi.client.services.system.exceptionthrower.wsdl.ThrowAccessDeniedNoSuchAccountResponse")
    @Action(input = "http://exceptionthrower.system.services.v4_0.soap.server.nameapi.org/SoapExceptionThrower/throwAccessDeniedNoSuchAccountRequest", output = "http://exceptionthrower.system.services.v4_0.soap.server.nameapi.org/SoapExceptionThrower/throwAccessDeniedNoSuchAccountResponse", fault = {
        @FaultAction(className = AccessDeniedWebServiceException.class, value = "http://exceptionthrower.system.services.v4_0.soap.server.nameapi.org/SoapExceptionThrower/throwAccessDeniedNoSuchAccount/Fault/AccessDeniedWebServiceException"),
        @FaultAction(className = InvalidInputWebServiceException.class, value = "http://exceptionthrower.system.services.v4_0.soap.server.nameapi.org/SoapExceptionThrower/throwAccessDeniedNoSuchAccount/Fault/InvalidInputWebServiceException"),
        @FaultAction(className = InternalServerErrorWebServiceException.class, value = "http://exceptionthrower.system.services.v4_0.soap.server.nameapi.org/SoapExceptionThrower/throwAccessDeniedNoSuchAccount/Fault/InternalServerErrorWebServiceException")
    })
    public String throwAccessDeniedNoSuchAccount(
        @WebParam(name = "context", targetNamespace = "")
        SoapContext context)
        throws AccessDeniedWebServiceException, InternalServerErrorWebServiceException, InvalidInputWebServiceException
    ;

    /**
     * 
     * @param context
     * @return
     *     returns java.lang.String
     * @throws InternalServerErrorWebServiceException
     * @throws InvalidInputWebServiceException
     * @throws AccessDeniedWebServiceException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "throwAccessDeniedRequestLimitExceeded", targetNamespace = "http://exceptionthrower.system.services.v4_0.soap.server.nameapi.org/", className = "org.nameapi.client.services.system.exceptionthrower.wsdl.ThrowAccessDeniedRequestLimitExceeded")
    @ResponseWrapper(localName = "throwAccessDeniedRequestLimitExceededResponse", targetNamespace = "http://exceptionthrower.system.services.v4_0.soap.server.nameapi.org/", className = "org.nameapi.client.services.system.exceptionthrower.wsdl.ThrowAccessDeniedRequestLimitExceededResponse")
    @Action(input = "http://exceptionthrower.system.services.v4_0.soap.server.nameapi.org/SoapExceptionThrower/throwAccessDeniedRequestLimitExceededRequest", output = "http://exceptionthrower.system.services.v4_0.soap.server.nameapi.org/SoapExceptionThrower/throwAccessDeniedRequestLimitExceededResponse", fault = {
        @FaultAction(className = AccessDeniedWebServiceException.class, value = "http://exceptionthrower.system.services.v4_0.soap.server.nameapi.org/SoapExceptionThrower/throwAccessDeniedRequestLimitExceeded/Fault/AccessDeniedWebServiceException"),
        @FaultAction(className = InvalidInputWebServiceException.class, value = "http://exceptionthrower.system.services.v4_0.soap.server.nameapi.org/SoapExceptionThrower/throwAccessDeniedRequestLimitExceeded/Fault/InvalidInputWebServiceException"),
        @FaultAction(className = InternalServerErrorWebServiceException.class, value = "http://exceptionthrower.system.services.v4_0.soap.server.nameapi.org/SoapExceptionThrower/throwAccessDeniedRequestLimitExceeded/Fault/InternalServerErrorWebServiceException")
    })
    public String throwAccessDeniedRequestLimitExceeded(
        @WebParam(name = "context", targetNamespace = "")
        SoapContext context)
        throws AccessDeniedWebServiceException, InternalServerErrorWebServiceException, InvalidInputWebServiceException
    ;

    /**
     * 
     * @param context
     * @return
     *     returns java.lang.String
     * @throws InternalServerErrorWebServiceException
     * @throws InvalidInputWebServiceException
     * @throws AccessDeniedWebServiceException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "throwAccessDeniedTooManyConcurrentRequests", targetNamespace = "http://exceptionthrower.system.services.v4_0.soap.server.nameapi.org/", className = "org.nameapi.client.services.system.exceptionthrower.wsdl.ThrowAccessDeniedTooManyConcurrentRequests")
    @ResponseWrapper(localName = "throwAccessDeniedTooManyConcurrentRequestsResponse", targetNamespace = "http://exceptionthrower.system.services.v4_0.soap.server.nameapi.org/", className = "org.nameapi.client.services.system.exceptionthrower.wsdl.ThrowAccessDeniedTooManyConcurrentRequestsResponse")
    @Action(input = "http://exceptionthrower.system.services.v4_0.soap.server.nameapi.org/SoapExceptionThrower/throwAccessDeniedTooManyConcurrentRequestsRequest", output = "http://exceptionthrower.system.services.v4_0.soap.server.nameapi.org/SoapExceptionThrower/throwAccessDeniedTooManyConcurrentRequestsResponse", fault = {
        @FaultAction(className = AccessDeniedWebServiceException.class, value = "http://exceptionthrower.system.services.v4_0.soap.server.nameapi.org/SoapExceptionThrower/throwAccessDeniedTooManyConcurrentRequests/Fault/AccessDeniedWebServiceException"),
        @FaultAction(className = InvalidInputWebServiceException.class, value = "http://exceptionthrower.system.services.v4_0.soap.server.nameapi.org/SoapExceptionThrower/throwAccessDeniedTooManyConcurrentRequests/Fault/InvalidInputWebServiceException"),
        @FaultAction(className = InternalServerErrorWebServiceException.class, value = "http://exceptionthrower.system.services.v4_0.soap.server.nameapi.org/SoapExceptionThrower/throwAccessDeniedTooManyConcurrentRequests/Fault/InternalServerErrorWebServiceException")
    })
    public String throwAccessDeniedTooManyConcurrentRequests(
        @WebParam(name = "context", targetNamespace = "")
        SoapContext context)
        throws AccessDeniedWebServiceException, InternalServerErrorWebServiceException, InvalidInputWebServiceException
    ;

}