package gress.guru.springframework.didemo.controllers;

import gress.guru.springframework.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @author Roman_Radetskiy.
 */
@Controller
public class PropertyInjectedController {

    @Resource(name = "greetingServiceImpl")
    public GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
