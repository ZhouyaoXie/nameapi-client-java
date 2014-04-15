
package org.nameapi.client.services.validator.gender.genericgendervalidator.wsdl;

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
@WebService(name = "SoapGenericGenderValidator", targetNamespace = "http://genericgendervalidator.gender.validator.services.v4_0.soap.server.nameapi.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SoapGenericGenderValidator {


    /**
     * 
     * @param person
     * @param context
     * @return
     *     returns org.nameapi.client.services.validator.gender.genericgendervalidator.wsdl.SoapGenderValidationResult
     * @throws AccessDeniedWebServiceException
     * @throws InvalidInputWebServiceException
     * @throws org.nameapi.client.commonwsdl.exception.InternalServerErrorWebServiceException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "validate", targetNamespace = "http://genericgendervalidator.gender.validator.services.v4_0.soap.server.nameapi.org/", className = "org.nameapi.client.services.validator.gender.genericgendervalidator.wsdl.Validate")
    @ResponseWrapper(localName = "validateResponse", targetNamespace = "http://genericgendervalidator.gender.validator.services.v4_0.soap.server.nameapi.org/", className = "org.nameapi.client.services.validator.gender.genericgendervalidator.wsdl.ValidateResponse")
    @Action(input = "http://genericgendervalidator.gender.validator.services.v4_0.soap.server.nameapi.org/SoapGenericGenderValidator/validateRequest", output = "http://genericgendervalidator.gender.validator.services.v4_0.soap.server.nameapi.org/SoapGenericGenderValidator/validateResponse", fault = {
        @FaultAction(className = InvalidInputWebServiceException.class, value = "http://genericgendervalidator.gender.validator.services.v4_0.soap.server.nameapi.org/SoapGenericGenderValidator/validate/Fault/InvalidInputWebServiceException"),
        @FaultAction(className = AccessDeniedWebServiceException.class, value = "http://genericgendervalidator.gender.validator.services.v4_0.soap.server.nameapi.org/SoapGenericGenderValidator/validate/Fault/AccessDeniedWebServiceException"),
        @FaultAction(className = InternalServerErrorWebServiceException.class, value = "http://genericgendervalidator.gender.validator.services.v4_0.soap.server.nameapi.org/SoapGenericGenderValidator/validate/Fault/InternalServerErrorWebServiceException")
    })
    public SoapGenderValidationResult validate(
        @WebParam(name = "context", targetNamespace = "")
        SoapContext context,
        @WebParam(name = "person", targetNamespace = "")
        SoapSimpleNaturalPerson person)
        throws AccessDeniedWebServiceException, InternalServerErrorWebServiceException, InvalidInputWebServiceException
    ;

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "price", targetNamespace = "http://genericgendervalidator.gender.validator.services.v4_0.soap.server.nameapi.org/", className = "org.nameapi.client.services.validator.gender.genericgendervalidator.wsdl.Price")
    @ResponseWrapper(localName = "priceResponse", targetNamespace = "http://genericgendervalidator.gender.validator.services.v4_0.soap.server.nameapi.org/", className = "org.nameapi.client.services.validator.gender.genericgendervalidator.wsdl.PriceResponse")
    @Action(input = "http://genericgendervalidator.gender.validator.services.v4_0.soap.server.nameapi.org/SoapGenericGenderValidator/priceRequest", output = "http://genericgendervalidator.gender.validator.services.v4_0.soap.server.nameapi.org/SoapGenericGenderValidator/priceResponse")
    public int price();

}