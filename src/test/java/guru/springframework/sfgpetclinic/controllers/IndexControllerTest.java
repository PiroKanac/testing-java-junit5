package guru.springframework.sfgpetclinic.controllers;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class IndexControllerTest
{
	IndexController controller;

	@BeforeEach
	void setUp()
	{
		controller = new IndexController();
	}

	@DisplayName("Test Proper View name is returned for index page")
	@Test
	void index()
	{
		assertEquals("index", controller.index());
		assertEquals("index", controller.index(), "Wrong View Returned");
		assertEquals("index", controller.index(), () -> "Another Expensive Message " + "Make me only if you have to");
	}

	@DisplayName("Test exception")
	@Test
	void oupsHandler()
	{
		//assertTrue("notimplemented".equals(controller.oopsHandler()), () -> "This is some expensive " + "Message to build" + "for my test");

		assertThrows(ValueNotFoundException.class, () -> {controller.oopsHandler();});

	}
}
