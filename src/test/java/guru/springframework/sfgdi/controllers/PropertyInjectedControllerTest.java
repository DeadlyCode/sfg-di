package guru.springframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.services.GreetingServiceImpl;

class PropertyInjectedControllerTest {

	PropertyInjectedController controller;
	
	@BeforeEach
	void setUp() throws Exception {
		controller = new PropertyInjectedController();
		controller.greetingService = new GreetingServiceImpl();
	}
	
	@Test
	void testGetGreeting() {
		System.out.println(controller.getGreeting());
	}

}
