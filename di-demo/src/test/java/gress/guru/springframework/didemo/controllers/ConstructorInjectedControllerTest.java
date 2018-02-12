package gress.guru.springframework.didemo.controllers;

import gress.guru.springframework.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Roman_Radetskiy.
 */
public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, constructorInjectedController.sayHello());
    }
}