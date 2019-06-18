
package pl.edu.pjwstk.tpr.jaxws.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pl.edu.pjwstk.tpr.jaxws.client package. 
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

    private final static QName _GetSurnameFiltered_QNAME = new QName("http://jaxws.tpr.pjwstk.edu.pl/", "getSurnameFiltered");
    private final static QName _GetDateFiltered_QNAME = new QName("http://jaxws.tpr.pjwstk.edu.pl/", "getDateFiltered");
    private final static QName _GetDateFilteredResponse_QNAME = new QName("http://jaxws.tpr.pjwstk.edu.pl/", "getDateFilteredResponse");
    private final static QName _GetSurnameFilteredResponse_QNAME = new QName("http://jaxws.tpr.pjwstk.edu.pl/", "getSurnameFilteredResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.edu.pjwstk.tpr.jaxws.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetSurnameFiltered }
     * 
     */
    public GetSurnameFiltered createGetSurnameFiltered() {
        return new GetSurnameFiltered();
    }

    /**
     * Create an instance of {@link GetSurnameFilteredResponse }
     * 
     */
    public GetSurnameFilteredResponse createGetSurnameFilteredResponse() {
        return new GetSurnameFilteredResponse();
    }

    /**
     * Create an instance of {@link GetDateFilteredResponse }
     * 
     */
    public GetDateFilteredResponse createGetDateFilteredResponse() {
        return new GetDateFilteredResponse();
    }

    /**
     * Create an instance of {@link GetDateFiltered }
     * 
     */
    public GetDateFiltered createGetDateFiltered() {
        return new GetDateFiltered();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSurnameFiltered }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.tpr.pjwstk.edu.pl/", name = "getSurnameFiltered")
    public JAXBElement<GetSurnameFiltered> createGetSurnameFiltered(GetSurnameFiltered value) {
        return new JAXBElement<GetSurnameFiltered>(_GetSurnameFiltered_QNAME, GetSurnameFiltered.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDateFiltered }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.tpr.pjwstk.edu.pl/", name = "getDateFiltered")
    public JAXBElement<GetDateFiltered> createGetDateFiltered(GetDateFiltered value) {
        return new JAXBElement<GetDateFiltered>(_GetDateFiltered_QNAME, GetDateFiltered.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDateFilteredResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.tpr.pjwstk.edu.pl/", name = "getDateFilteredResponse")
    public JAXBElement<GetDateFilteredResponse> createGetDateFilteredResponse(GetDateFilteredResponse value) {
        return new JAXBElement<GetDateFilteredResponse>(_GetDateFilteredResponse_QNAME, GetDateFilteredResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSurnameFilteredResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.tpr.pjwstk.edu.pl/", name = "getSurnameFilteredResponse")
    public JAXBElement<GetSurnameFilteredResponse> createGetSurnameFilteredResponse(GetSurnameFilteredResponse value) {
        return new JAXBElement<GetSurnameFilteredResponse>(_GetSurnameFilteredResponse_QNAME, GetSurnameFilteredResponse.class, null, value);
    }

}
