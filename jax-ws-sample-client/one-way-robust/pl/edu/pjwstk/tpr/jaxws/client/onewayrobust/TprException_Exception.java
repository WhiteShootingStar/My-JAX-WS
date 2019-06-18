
package pl.edu.pjwstk.tpr.jaxws.client.onewayrobust;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "TprException", targetNamespace = "http://onewayrobust.jaxws.tpo.glowacki.eu/")
public class TprException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private TprException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public TprException_Exception(String message, TprException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public TprException_Exception(String message, TprException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: pl.edu.pjwstk.tpr.jaxws.client.onewayrobust.TprException
     */
    public TprException getFaultInfo() {
        return faultInfo;
    }

}