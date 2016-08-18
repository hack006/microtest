package cz.ondrajanata.microtest.api;

import cz.ondrajanata.microtest.api.dm.Person;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Ondrej Janata on 8.8.16.
 * - janaton1@fel.cvut.cz
 */
public interface PersonRepository extends CrudRepository<Person, Long> {

}
