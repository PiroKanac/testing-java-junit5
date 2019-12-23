package guru.springframework.sfgpetclinic.services.springdatajpa;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import guru.springframework.sfgpetclinic.model.Owner;
//all can be disabled
@Disabled(value = "Disabled until I learn Mocking")
class OwnerSDJpaServiceTest
{

	OwnerSDJpaService service;

	@BeforeEach
	void setUp()
	{
		//still not implemented that is why there are null
		service = new OwnerSDJpaService(null, null, null);
	}
	//Disabled because not implemented
	@Disabled
	@Test
	void findByLastName()
	{
		Owner foundOwner = service.findByLastName("Buck");
	}

	@Test
	void findAllByLastNameLike()
	{
	}

	@Test
	void findAll()
	{
	}

	@Test
	void findById()
	{
	}

	@Test
	void save()
	{
	}

	@Test
	void delete()
	{
	}

	@Test
	void deleteById()
	{
	}
}
