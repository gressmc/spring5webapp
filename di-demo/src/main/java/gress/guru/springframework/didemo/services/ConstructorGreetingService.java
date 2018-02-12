package gress.guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

/**
 * @author Roman_Radetskiy.
 */
@Service
public class ConstructorGreetingService implements GreetingService {

    public static final String HELLO = "Hello ConstructorGreetingService";

    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
