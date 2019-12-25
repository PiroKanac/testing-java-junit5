package guru.springframework.sfgpetclinic.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class OwnerTest
{
	@Test
	void dependentAssertations(){
		Owner owner = new Owner(1l, "Joe", "Doe");
		owner.setCity("Key West");
		owner.setTelephone("123123123123");

		assertAll("Properties Test",
			() -> assertAll("Person Properties",
				() -> assertEquals("Joe", owner.getFirstName(), "First Name Did not Match"),
				() -> assertEquals("Doe", owner.getLastName())),
			() -> assertAll("Owner Properties",
				() -> assertEquals("Key West", owner.getCity(), "City Did not Match"),
				() -> assertEquals("123123123123", owner.getTelephone()))

			);

		assertThat(owner.getCity(), is("Key West"));
	}
}
