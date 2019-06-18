
package pl.edu.pjwstk.tpr.jaxws.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SampleService", targetNamespace = "http://jaxws.tpr.pjwstk.edu.pl/", wsdlLocation = "http://localhost:8081/jax-ws-sample/sample?wsdl")
public class SampleService
    extends Service
{

    private final static URL SAMPLESERVICE_WSDL_LOCATION;
    private final static WebServiceException SAMPLESERVICE_EXCEPTION;
    private final static QName SAMPLESERVICE_QNAME = new QName("http://jaxws.tpr.pjwstk.edu.pl/", "SampleService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8081/jax-ws-sample/sample?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SAMPLESERVICE_WSDL_LOCATION = url;
        SAMPLESERVICE_EXCEPTION = e;
    }

    public SampleService() {
        super(__getWsdlLocation(), SAMPLESERVICE_QNAME);
    }

    public SampleService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SAMPLESERVICE_QNAME, features);
    }

    public SampleService(URL wsdlLocation) {
        super(wsdlLocation, SAMPLESERVICE_QNAME);
    }

    public SampleService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SAMPLESERVICE_QNAME, features);
    }

    public SampleService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SampleService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Sample
     */
    @WebEndpoint(name = "SamplePort")
    public Sample getSamplePort() {
        return super.getPort(new QName("http://jaxws.tpr.pjwstk.edu.pl/", "SamplePort"), Sample.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Sample
     */
    @WebEndpoint(name = "SamplePort")
    public Sample getSamplePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://jaxws.tpr.pjwstk.edu.pl/", "SamplePort"), Sample.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SAMPLESERVICE_EXCEPTION!= null) {
            throw SAMPLESERVICE_EXCEPTION;
        }
        return SAMPLESERVICE_WSDL_LOCATION;
    }

}
