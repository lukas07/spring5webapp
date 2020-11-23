package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Bezeichnung : AuthorController
 * Beschreibung: Controller-Klasse der Author-Entity
 * Erstellt    : 11/2020 - L .Breit
 */
@Controller
public class AuthorController {

    /* VARIABLEN */
    private final AuthorRepository authorRepository;

    /* KONSTRUKTOR */
    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    /* METHODEN */
    @RequestMapping("/authors")
    public String getAuthors(Model model) {

        model.addAttribute("authors", authorRepository.findAll());

        return "authors/list";
    }

}
