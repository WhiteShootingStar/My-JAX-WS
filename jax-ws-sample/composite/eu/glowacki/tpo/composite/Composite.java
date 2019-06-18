package eu.glowacki.tpo.composite;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public final class Composite {

	@WebMethod
	public Response getCompositeValue(Request request) {
		Response response = new Response();
		response._protected = request._protected;
		return response;
	}
}