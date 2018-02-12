package gress.guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

/**
 * @author Roman_Radetskiy.
 */
@Service
public class SetterGreetingService implements GreetingService {

    public static final String HELLO = "Hello SetterGreetingService";

    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
