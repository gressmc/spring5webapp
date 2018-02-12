package gress.guru.springframework.didemo.controllers;

import gress.guru.springframework.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @author Roman_Radetskiy.
 */
@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

    @Resource(name = "setterGreetingService")
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
