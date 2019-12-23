package guru.springframework.sfgpetclinic.controllers;

import static org.junit.jupiter.api.Assertions.*;
import java.time.Duration;
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

	@Disabled("Demo of timeout")
	@Test
	void testTimeOut(){
		assertTimeout(Duration.ofMillis(100), () -> {
			Thread.sleep(5000);
			System.out.println("I got here");
		});
	}

	@Disabled("Demo of timeout")
	@Test
	void testTimeOutPrompt(){
		assertTimeoutPreemptively(Duration.ofMillis(100), () -> {
			Thread.sleep(5000);
			System.out.println("I got here 2325415414154");
		});
	}
}
