package gress.guru.springframework.didemo.controllers;

import gress.guru.springframework.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Roman_Radetskiy.
 */
public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, setterInjectedController.sayHello());
    }

}