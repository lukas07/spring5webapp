package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.model.Author;
import guru.springframework.spring5webapp.model.Book;
import guru.springframework.spring5webapp.model.Publisher;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;
import guru.springframework.spring5webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Bezeichnung : BootStrapData
 * Beschreibung:
 * Erstellt    : 11/2020 - L .Breit
 */
@Component
public class BootStrapData implements CommandLineRunner {

    /* VARIABLEN */
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    /* KONSTRUKTOR */

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    /* Override - Methoden */
    @Override
    public void run(String... args) throws Exception {

        System.out.println("Started in Bootstrap");

        Publisher publisher = new Publisher("Dana's Verlag", "ABC-Straße 12", "Beispielstadt", "RLP", "123465");
        publisherRepository.save(publisher);

        System.out.println("Number of publisher: " + publisherRepository.count());

        Author dana = new Author("Dana", "Bollig");
        Book ddd = new Book("Design Driven Design", "123123");
        dana.getBooks().add(ddd);
        ddd.getAuthors().add(dana);

        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);

        authorRepository.save(dana);
        bookRepository.save(ddd);
        publisherRepository.save(publisher);

        Author lukas = new Author("Lukas", "Breit");
        Book noEJB = new Book("J2EE Development without EJB", "123123123");
        lukas.getBooks().add(noEJB);
        noEJB.getAuthors().add(lukas);

        noEJB.setPublisher(publisher);
        publisher.getBooks().add(noEJB);

        authorRepository.save(lukas);
        bookRepository.save(noEJB);
        publisherRepository.save(publisher);

        System.out.println("Number of books: " + bookRepository.count());
        System.out.println("Publisher number of books: " + publisher.getBooks().size());
    }
}
