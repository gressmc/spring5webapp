package gress.guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

/**
 * @author Roman_Radetskiy.
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Hello Gurus";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
