package gress.guru.springframework.didemo.repositories;

import org.springframework.stereotype.Component;

@Component
public class GreeatingRepositoryImpl implements GreeatingRepository {

    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting Service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Hola Primaria Saludo De Servicio";
    }

    @Override
    public String getGermanGreeting() {
        return "Hallo - Primär-Gruß-Service";
    }
}
