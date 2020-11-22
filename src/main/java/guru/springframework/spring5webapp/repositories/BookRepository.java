package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Bezeichnung : BookRepository
 * Beschreibung:
 * Erstellt    : 11/2020 - L .Breit
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
