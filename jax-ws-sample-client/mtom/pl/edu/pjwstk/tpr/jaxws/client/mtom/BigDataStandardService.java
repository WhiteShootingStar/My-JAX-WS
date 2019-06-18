
package pl.edu.pjwstk.tpr.jaxws.client.mtom;

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
@WebServiceClient(name = "BigDataStandardService", targetNamespace = "http://mtom.jaxws.tpr.pjwstk.edu.pl/", wsdlLocation = "http://localhost:8081/jax-ws-sample/big-data-standard?wsdl")
public class BigDataStandardService
    extends Service
{

    private final static URL BIGDATASTANDARDSERVICE_WSDL_LOCATION;
    private final static WebServiceException BIGDATASTANDARDSERVICE_EXCEPTION;
    private final static QName BIGDATASTANDARDSERVICE_QNAME = new QName("http://mtom.jaxws.tpr.pjwstk.edu.pl/", "BigDataStandardService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8081/jax-ws-sample/big-data-standard?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BIGDATASTANDARDSERVICE_WSDL_LOCATION = url;
        BIGDATASTANDARDSERVICE_EXCEPTION = e;
    }

    public BigDataStandardService() {
        super(__getWsdlLocation(), BIGDATASTANDARDSERVICE_QNAME);
    }

    public BigDataStandardService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BIGDATASTANDARDSERVICE_QNAME, features);
    }

    public BigDataStandardService(URL wsdlLocation) {
        super(wsdlLocation, BIGDATASTANDARDSERVICE_QNAME);
    }

    public BigDataStandardService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BIGDATASTANDARDSERVICE_QNAME, features);
    }

    public BigDataStandardService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BigDataStandardService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BigDataStandard
     */
    @WebEndpoint(name = "BigDataStandardPort")
    public BigDataStandard getBigDataStandardPort() {
        return super.getPort(new QName("http://mtom.jaxws.tpr.pjwstk.edu.pl/", "BigDataStandardPort"), BigDataStandard.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BigDataStandard
     */
    @WebEndpoint(name = "BigDataStandardPort")
    public BigDataStandard getBigDataStandardPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://mtom.jaxws.tpr.pjwstk.edu.pl/", "BigDataStandardPort"), BigDataStandard.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BIGDATASTANDARDSERVICE_EXCEPTION!= null) {
            throw BIGDATASTANDARDSERVICE_EXCEPTION;
        }
        return BIGDATASTANDARDSERVICE_WSDL_LOCATION;
    }

}
