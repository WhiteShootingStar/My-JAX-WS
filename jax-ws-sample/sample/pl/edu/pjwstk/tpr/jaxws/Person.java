package pl.edu.pjwstk.tpr.jaxws;

import java.util.Date;

public class Person {
	private String Firstname, LastName;
	private Date Birthdate;

	public Person(String firstname, String lastName, Date birthdate) {
		Firstname = firstname;
		LastName = lastName;
		Birthdate = birthdate;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public Date getBirthdate() {
		return Birthdate;
	}

	public void setBirthdate(Date birthdate) {
		Birthdate = birthdate;
	}

}
