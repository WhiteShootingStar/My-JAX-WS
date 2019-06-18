
package pl.edu.pjwstk.tpr.jaxws.client.delayed;

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
@WebServiceClient(name = "CalculatorDelayedService", targetNamespace = "http://delayed.jaxws.tpr.pjwstk.edu.pl/", wsdlLocation = "http://localhost:8081/jax-ws-sample/calculator-delayed?wsdl")
public class CalculatorDelayedService
    extends Service
{

    private final static URL CALCULATORDELAYEDSERVICE_WSDL_LOCATION;
    private final static WebServiceException CALCULATORDELAYEDSERVICE_EXCEPTION;
    private final static QName CALCULATORDELAYEDSERVICE_QNAME = new QName("http://delayed.jaxws.tpr.pjwstk.edu.pl/", "CalculatorDelayedService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8081/jax-ws-sample/calculator-delayed?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CALCULATORDELAYEDSERVICE_WSDL_LOCATION = url;
        CALCULATORDELAYEDSERVICE_EXCEPTION = e;
    }

    public CalculatorDelayedService() {
        super(__getWsdlLocation(), CALCULATORDELAYEDSERVICE_QNAME);
    }

    public CalculatorDelayedService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CALCULATORDELAYEDSERVICE_QNAME, features);
    }

    public CalculatorDelayedService(URL wsdlLocation) {
        super(wsdlLocation, CALCULATORDELAYEDSERVICE_QNAME);
    }

    public CalculatorDelayedService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CALCULATORDELAYEDSERVICE_QNAME, features);
    }

    public CalculatorDelayedService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CalculatorDelayedService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CalculatorDelayed
     */
    @WebEndpoint(name = "CalculatorDelayedPort")
    public CalculatorDelayed getCalculatorDelayedPort() {
        return super.getPort(new QName("http://delayed.jaxws.tpr.pjwstk.edu.pl/", "CalculatorDelayedPort"), CalculatorDelayed.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CalculatorDelayed
     */
    @WebEndpoint(name = "CalculatorDelayedPort")
    public CalculatorDelayed getCalculatorDelayedPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://delayed.jaxws.tpr.pjwstk.edu.pl/", "CalculatorDelayedPort"), CalculatorDelayed.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CALCULATORDELAYEDSERVICE_EXCEPTION!= null) {
            throw CALCULATORDELAYEDSERVICE_EXCEPTION;
        }
        return CALCULATORDELAYEDSERVICE_WSDL_LOCATION;
    }

}