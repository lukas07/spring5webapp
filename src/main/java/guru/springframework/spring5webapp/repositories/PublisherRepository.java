package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Bezeichnung : PublisherRepository
 * Beschreibung:
 * Erstellt    : 11/2020 - L .Breit
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
