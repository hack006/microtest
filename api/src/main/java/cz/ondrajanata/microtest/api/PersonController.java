package cz.ondrajanata.microtest.api;

import cz.ondrajanata.microtest.contracts.transport.PersonDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ondrej Janata on 8.8.16.
 * - janaton1@fel.cvut.cz
 */
@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/api/person/{id}", method = RequestMethod.GET)
    public PersonDetail getPersonDetail(@PathVariable("id") long personId) {
        return personService.getPersonDetail(personId);
    }
}