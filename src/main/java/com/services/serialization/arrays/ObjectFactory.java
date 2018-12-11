
package com.services.serialization.arrays;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.services.serialization.arrays package.
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

    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _ArrayOfKeyValueOfintEarlyPayoutStatusNNSPdE8A_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfKeyValueOfintEarlyPayoutStatusNNSPdE8A");
    private final static QName _ArrayOfKeyValueOfintBetNNSPdE8A_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfKeyValueOfintBetNNSPdE8A");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.services.serialization.arrays
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfintBetNNSPdE8A }
     * 
     */
    public ArrayOfKeyValueOfintBetNNSPdE8A createArrayOfKeyValueOfintBetNNSPdE8A() {
        return new ArrayOfKeyValueOfintBetNNSPdE8A();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfintEarlyPayoutStatusNNSPdE8A }
     * 
     */
    public ArrayOfKeyValueOfintEarlyPayoutStatusNNSPdE8A createArrayOfKeyValueOfintEarlyPayoutStatusNNSPdE8A() {
        return new ArrayOfKeyValueOfintEarlyPayoutStatusNNSPdE8A();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfintBetNNSPdE8A.KeyValueOfintBetNNSPdE8A }
     * 
     */
    public ArrayOfKeyValueOfintBetNNSPdE8A.KeyValueOfintBetNNSPdE8A createArrayOfKeyValueOfintBetNNSPdE8AKeyValueOfintBetNNSPdE8A() {
        return new ArrayOfKeyValueOfintBetNNSPdE8A.KeyValueOfintBetNNSPdE8A();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfintEarlyPayoutStatusNNSPdE8A.KeyValueOfintEarlyPayoutStatusNNSPdE8A }
     * 
     */
    public ArrayOfKeyValueOfintEarlyPayoutStatusNNSPdE8A.KeyValueOfintEarlyPayoutStatusNNSPdE8A createArrayOfKeyValueOfintEarlyPayoutStatusNNSPdE8AKeyValueOfintEarlyPayoutStatusNNSPdE8A() {
        return new ArrayOfKeyValueOfintEarlyPayoutStatusNNSPdE8A.KeyValueOfintEarlyPayoutStatusNNSPdE8A();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfstring")
    public JAXBElement<ArrayOfstring> createArrayOfstring(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ArrayOfstring_QNAME, ArrayOfstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfintEarlyPayoutStatusNNSPdE8A }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfKeyValueOfintEarlyPayoutStatusNNSPdE8A")
    public JAXBElement<ArrayOfKeyValueOfintEarlyPayoutStatusNNSPdE8A> createArrayOfKeyValueOfintEarlyPayoutStatusNNSPdE8A(ArrayOfKeyValueOfintEarlyPayoutStatusNNSPdE8A value) {
        return new JAXBElement<ArrayOfKeyValueOfintEarlyPayoutStatusNNSPdE8A>(_ArrayOfKeyValueOfintEarlyPayoutStatusNNSPdE8A_QNAME, ArrayOfKeyValueOfintEarlyPayoutStatusNNSPdE8A.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfintBetNNSPdE8A }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfKeyValueOfintBetNNSPdE8A")
    public JAXBElement<ArrayOfKeyValueOfintBetNNSPdE8A> createArrayOfKeyValueOfintBetNNSPdE8A(ArrayOfKeyValueOfintBetNNSPdE8A value) {
        return new JAXBElement<ArrayOfKeyValueOfintBetNNSPdE8A>(_ArrayOfKeyValueOfintBetNNSPdE8A_QNAME, ArrayOfKeyValueOfintBetNNSPdE8A.class, null, value);
    }

}
