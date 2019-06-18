package pl.edu.pjwstk.tpr.jaxws.client.proxy.test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import pl.edu.pjwstk.tpr.jaxws.client.Filter;
import pl.edu.pjwstk.tpr.jaxws.client.Person;
import pl.edu.pjwstk.tpr.jaxws.client.proxy.FilterProxy;

public class FilterTest {
	private Filter filter;

	@Before
	public void before() {
		filter = new FilterProxy();
	}

	@Test
	public void filterSurname() {
		List<Person> persons = filter.getSurnameFiltered("Glow");
		Assert.assertEquals(1, persons.size());
	}
	@Test 
	public void filterDates() {
		GregorianCalendar now = new GregorianCalendar();
		now.setTime(new Date());
		XMLGregorianCalendar calendar=null;
		try {
			calendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(now);
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<Person> persons =filter.getDateFiltered(calendar);
		Assert.assertEquals(0, persons.size());
	}	
}