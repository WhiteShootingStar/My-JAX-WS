
package pl.edu.pjwstk.tpr.jaxws.client.onewayrobust;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pl.edu.pjwstk.tpr.jaxws.client.onewayrobust package. 
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

    private final static QName _TprException_QNAME = new QName("http://onewayrobust.jaxws.tpo.glowacki.eu/", "TprException");
    private final static QName _OneWayRobustResponse_QNAME = new QName("http://onewayrobust.jaxws.tpo.glowacki.eu/", "oneWayRobustResponse");
    private final static QName _OneWayRobust_QNAME = new QName("http://onewayrobust.jaxws.tpo.glowacki.eu/", "oneWayRobust");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.edu.pjwstk.tpr.jaxws.client.onewayrobust
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TprException }
     * 
     */
    public TprException createTprException() {
        return new TprException();
    }

    /**
     * Create an instance of {@link OneWayRobust_Type }
     * 
     */
    public OneWayRobust_Type createOneWayRobust_Type() {
        return new OneWayRobust_Type();
    }

    /**
     * Create an instance of {@link OneWayRobustResponse }
     * 
     */
    public OneWayRobustResponse createOneWayRobustResponse() {
        return new OneWayRobustResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TprException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://onewayrobust.jaxws.tpo.glowacki.eu/", name = "TprException")
    public JAXBElement<TprException> createTprException(TprException value) {
        return new JAXBElement<TprException>(_TprException_QNAME, TprException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OneWayRobustResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://onewayrobust.jaxws.tpo.glowacki.eu/", name = "oneWayRobustResponse")
    public JAXBElement<OneWayRobustResponse> createOneWayRobustResponse(OneWayRobustResponse value) {
        return new JAXBElement<OneWayRobustResponse>(_OneWayRobustResponse_QNAME, OneWayRobustResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OneWayRobust_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://onewayrobust.jaxws.tpo.glowacki.eu/", name = "oneWayRobust")
    public JAXBElement<OneWayRobust_Type> createOneWayRobust(OneWayRobust_Type value) {
        return new JAXBElement<OneWayRobust_Type>(_OneWayRobust_QNAME, OneWayRobust_Type.class, null, value);
    }

}
