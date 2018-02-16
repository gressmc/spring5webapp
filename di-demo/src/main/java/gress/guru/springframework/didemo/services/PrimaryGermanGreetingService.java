package gress.guru.springframework.didemo.services;

import gress.guru.springframework.didemo.repositories.GreeatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("de")
public class PrimaryGermanGreetingService implements GreetingService{

    private GreeatingRepository greeatingRepository;

    public PrimaryGermanGreetingService(GreeatingRepository greeatingRepository) {
        this.greeatingRepository = greeatingRepository;
    }

    @Override
    public String sayGreeting() {
        return greeatingRepository.getGermanGreeting();
    }
}
