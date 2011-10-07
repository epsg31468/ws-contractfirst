
package de.bjoernhoefling.ws.stub;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "Hello", targetNamespace = "http://ws.bjoernhoefling.de/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Hello {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "greet", targetNamespace = "http://ws.bjoernhoefling.de/", className = "de.bjoernhoefling.ws.stub.Greet")
    @ResponseWrapper(localName = "greetResponse", targetNamespace = "http://ws.bjoernhoefling.de/", className = "de.bjoernhoefling.ws.stub.GreetResponse")
    public String greet();

}
