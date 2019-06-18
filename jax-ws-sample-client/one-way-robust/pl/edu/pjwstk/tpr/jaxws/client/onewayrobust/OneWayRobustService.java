
package pl.edu.pjwstk.tpr.jaxws.client.onewayrobust;

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
@WebServiceClient(name = "OneWayRobustService", targetNamespace = "http://onewayrobust.jaxws.tpo.glowacki.eu/", wsdlLocation = "http://localhost:8081/jax-ws-sample/one-way-robust?wsdl")
public class OneWayRobustService
    extends Service
{

    private final static URL ONEWAYROBUSTSERVICE_WSDL_LOCATION;
    private final static WebServiceException ONEWAYROBUSTSERVICE_EXCEPTION;
    private final static QName ONEWAYROBUSTSERVICE_QNAME = new QName("http://onewayrobust.jaxws.tpo.glowacki.eu/", "OneWayRobustService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8081/jax-ws-sample/one-way-robust?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ONEWAYROBUSTSERVICE_WSDL_LOCATION = url;
        ONEWAYROBUSTSERVICE_EXCEPTION = e;
    }

    public OneWayRobustService() {
        super(__getWsdlLocation(), ONEWAYROBUSTSERVICE_QNAME);
    }

    public OneWayRobustService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ONEWAYROBUSTSERVICE_QNAME, features);
    }

    public OneWayRobustService(URL wsdlLocation) {
        super(wsdlLocation, ONEWAYROBUSTSERVICE_QNAME);
    }

    public OneWayRobustService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ONEWAYROBUSTSERVICE_QNAME, features);
    }

    public OneWayRobustService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OneWayRobustService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns OneWayRobust
     */
    @WebEndpoint(name = "OneWayRobustPort")
    public OneWayRobust getOneWayRobustPort() {
        return super.getPort(new QName("http://onewayrobust.jaxws.tpo.glowacki.eu/", "OneWayRobustPort"), OneWayRobust.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OneWayRobust
     */
    @WebEndpoint(name = "OneWayRobustPort")
    public OneWayRobust getOneWayRobustPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://onewayrobust.jaxws.tpo.glowacki.eu/", "OneWayRobustPort"), OneWayRobust.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ONEWAYROBUSTSERVICE_EXCEPTION!= null) {
            throw ONEWAYROBUSTSERVICE_EXCEPTION;
        }
        return ONEWAYROBUSTSERVICE_WSDL_LOCATION;
    }

}