package gress.guru.springframework.didemo.controllers;

import gress.guru.springframework.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * @author Roman_Radetskiy.
 */
@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        System.out.println("Hello!!!"); // Noncompliant
        return greetingService.sayGreeting();
    }
}
