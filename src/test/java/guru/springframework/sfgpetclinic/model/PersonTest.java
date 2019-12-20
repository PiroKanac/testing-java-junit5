package guru.springframework.sfgpetclinic.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PersonTest
{
	@Test
	void groupedAssertions(){
		//given
		Person person = new Person(1l, "Joe", "Doe");

		//then
		assertAll("Test Props Set",
			() -> assertEquals(person.getFirstName(), "Joe"),
			() -> assertEquals(person.getLastName(), "Doe"));
	}

	@Test
	void groupedAssertionsMsg(){
		//given
		Person person = new Person(1l, "Joe", "Doe");

		//then
		assertAll("Test Props Set",
			() -> assertEquals(person.getFirstName(), "Joe", "First Name Failed"),
			() -> assertEquals(person.getLastName(), "Doe", "Last Name Failed"));
	}

}
