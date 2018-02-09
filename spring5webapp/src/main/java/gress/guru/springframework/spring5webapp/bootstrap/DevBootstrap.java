package gress.guru.springframework.spring5webapp.bootstrap;

import gress.guru.springframework.spring5webapp.model.Author;
import gress.guru.springframework.spring5webapp.model.Book;
import gress.guru.springframework.spring5webapp.model.Publisher;
import gress.guru.springframework.spring5webapp.repositories.AuthorRepository;
import gress.guru.springframework.spring5webapp.repositories.BookRepository;
import gress.guru.springframework.spring5webapp.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {

        //Eric
        Author eric = new Author("Eric", "Evans");
        Publisher publisher = new Publisher("Harper Collins", "");
        Book ddd = new Book("DDD", "1234", publisher);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        authorRepository.save(eric);
        bookRepository.save(ddd);

        //Rod
        Author rod = new Author("Rod", "Johnoson");
        Publisher publisher2 = new Publisher("Worx", "");
        Book noEJB = new Book("J2EE Dev withot EJB", "22334", publisher2);
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);
        authorRepository.save(rod);
        bookRepository.save(noEJB);

        publisherRepository.saveAll(Arrays.asList(publisher, publisher2));

    }
}
