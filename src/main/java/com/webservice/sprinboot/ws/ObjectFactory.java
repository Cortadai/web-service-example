//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.09.08 a las 02:44:23 PM CEST 
//


package com.webservice.sprinboot.ws;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.webservice.springboot package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.webservice.springboot
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStoreRequest }
     * 
     */
    public GetStoreRequest createGetStoreRequest() {
        return new GetStoreRequest();
    }

    /**
     * Create an instance of {@link GetStoreResponse }
     * 
     */
    public GetStoreResponse createGetStoreResponse() {
        return new GetStoreResponse();
    }

    /**
     * Create an instance of {@link Store }
     * 
     */
    public Store createStore() {
        return new Store();
    }

    /**
     * Create an instance of {@link Manager }
     * 
     */
    public Manager createManager() {
        return new Manager();
    }

}
