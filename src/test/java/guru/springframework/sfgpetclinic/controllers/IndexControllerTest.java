package guru.springframework.sfgpetclinic.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import java.time.Duration;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;

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

	@Test
	void testAssumptionTrue(){
		assumeTrue("GURU".equalsIgnoreCase(System.getenv("GURU_RUNTIME")));
	}

	@Test
	void testAssumptionIsTrue(){
		assumeTrue("GURU".equalsIgnoreCase("GURU"));
	}

	@EnabledOnOs(OS.MAC)
	@Test
	void testMeOnMacOS()
	{
	}
	@EnabledOnOs(OS.WINDOWS)
	@Test
	void testMeOnWindows()
	{
	}
	@EnabledOnJre(JRE.JAVA_8)
	@Test
	void testMeOnJava8()
	{
	}
	@EnabledOnJre(JRE.JAVA_11)
	@Test
	void testMeOnJava11()
	{
	}
	@EnabledIfEnvironmentVariable(named = "USERNAME", matches = "VladimirN")
	@Test
	void testIfUserVN()
	{
	}
	@EnabledIfEnvironmentVariable(named = "USERNAME", matches = "niri")
	@Test
	void testIfUserElse()
	{
	}
}
