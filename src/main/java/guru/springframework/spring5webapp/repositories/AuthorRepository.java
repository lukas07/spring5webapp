package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Bezeichnung : AuthorRepository
 * Beschreibung:
 * Erstellt    : 11/2020 - L. Breit
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
