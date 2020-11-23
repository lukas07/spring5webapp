package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Bezeichnung : BookController
 * Beschreibung: Controller-Klasse der Book-Entity
 * Erstellt    : 11/2020 - L .Breit
 */
@Controller
public class BookController {

    /* VARIABLEN */
    private final BookRepository bookRepository;

    /* KONSTRUKTOR */
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    /* METHODEN */
    @RequestMapping("/books")
    public String getBooks(Model model) {

        model.addAttribute("books", bookRepository.findAll());

        return "books/list";
    }

}
