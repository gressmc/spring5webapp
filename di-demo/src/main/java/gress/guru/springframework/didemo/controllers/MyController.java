package gress.guru.springframework.didemo.controllers;

import org.springframework.stereotype.Controller;

/**
 * @author Roman_Radetskiy.
 */
@Controller
public class MyController {

    public String hello(){
        System.out.println("Hello!!!"); // Noncompliant
        return "foooo";
    }
}
