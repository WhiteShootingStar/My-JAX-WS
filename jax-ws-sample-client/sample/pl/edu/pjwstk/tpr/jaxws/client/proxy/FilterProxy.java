package pl.edu.pjwstk.tpr.jaxws.client.proxy;

import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import com.sun.xml.ws.developer.WSBindingProvider;

import pl.edu.pjwstk.tpr.jaxws.client.Calculator;
import pl.edu.pjwstk.tpr.jaxws.client.CalculatorService;
import pl.edu.pjwstk.tpr.jaxws.client.Filter;
import pl.edu.pjwstk.tpr.jaxws.client.FilterService;
import pl.edu.pjwstk.tpr.jaxws.client.Person;
import pl.edu.pjwstk.tpr.jaxws.client.common.ProxyBase;

/**
 * @author あるつぃおむ　ぱりあしゅく <Artsiom@palishchuk.by>
 */


public class FilterProxy  extends ProxyBase implements Filter{
	private FilterService service;
	private Filter filter;
	@Override
	public List<Person> getSurnameFiltered(String arg0) {
		return getPort().getSurnameFiltered(arg0);
	}

	@Override
	public List<Person> getDateFiltered(XMLGregorianCalendar arg0) {
		return getPort().getDateFiltered(arg0);
	}

	@Override
	protected WSBindingProvider getBindingProvider() {
	
		return (WSBindingProvider) getPort();
	}
	private Filter getPort() {
		if (service == null) {
			service = new FilterService();
		}
		if (filter == null) {
			filter = service.getFilterPort();
		}
		return filter;
	}
}
