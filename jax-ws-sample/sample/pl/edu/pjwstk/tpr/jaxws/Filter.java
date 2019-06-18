package pl.edu.pjwstk.tpr.jaxws;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import javax.jws.WebMethod;
import javax.jws.WebService;

import pl.edu.pjwstk.tpr.jaxws.ports.WebServiceBase;

@WebService
public class Filter extends WebServiceBase {

	private static List<Person> persons = new ArrayList<>();
	static {
		Person a = new Person("Edek", "Glow", getRandomDate());
		Person b = new Person("Sanya", "Sidl", getRandomDate());
		Person c = new Person("Forsen", "E", getRandomDate());
		Person d = new Person("Anya", "Vlas", getRandomDate());
		Person e = new Person("Petya", "Bomj", getRandomDate());
		persons.add(a);
		persons.add(b);
		persons.add(c);
		persons.add(d);
		persons.add(e);
	}

	@WebMethod
	public List<Person> getSurnameFiltered(String surname) {
		//fill();
		return persons.stream().//
				filter(person -> person.getLastName().contains(surname)).//
				collect(Collectors.toList());
	}

	@WebMethod
	public List<Person> getDateFiltered(Date date) {
		//fill();
		return persons.stream().//
				filter(person -> person.getBirthdate().equals(date)).//
				collect(Collectors.toList());
	}
	
	
	private static Date getRandomDate() {
		Calendar calendar = Calendar.getInstance();
		Random random = new Random();
		int years = random.nextInt(20) + 2000;
		int mounts = random.nextInt(12);
		int days = random.nextInt(30) + 1;
		calendar.set(years, mounts, days);
		return calendar.getTime();
	}
	
	
}
