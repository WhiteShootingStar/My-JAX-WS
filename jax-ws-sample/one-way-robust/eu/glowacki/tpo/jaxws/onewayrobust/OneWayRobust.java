package eu.glowacki.tpo.jaxws.onewayrobust;

import javax.jws.WebMethod;
import javax.jws.WebService;

import pl.edu.pjwstk.tpr.jaxws.ports.TprException;

@WebService
public class OneWayRobust {

	@WebMethod
	public void oneWayRobust(String input) throws TprException {
		System.out.println("input: " + input);
	}
}