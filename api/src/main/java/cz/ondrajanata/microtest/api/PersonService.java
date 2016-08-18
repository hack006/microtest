package cz.ondrajanata.microtest.api;

import cz.ondrajanata.microtest.api.dm.Person;
import cz.ondrajanata.microtest.contracts.transport.AttendanceDetail;
import cz.ondrajanata.microtest.contracts.transport.PersonDetail;
import org.apache.commons.lang3.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ondrej Janata on 10.8.16.
 * - janaton1@fel.cvut.cz
 */
@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    @Autowired AttendanceService attendanceService;

    public PersonDetail getPersonDetail(long personId) {
        Person foundPerson = personRepository.findOne(personId);
        Validate.notNull(foundPerson, "Person with id=%d was not found :/", personId);

        PersonDetail personDetail = new PersonDetail();
        personDetail.setId(foundPerson.getId());
        personDetail.setName(foundPerson.getName());
        personDetail.setBirthday(foundPerson.getBirthday());

        List<AttendanceDetail> personAttendances = attendanceService.findPersonAttendances(personId);
        personDetail.setAttendances(personAttendances);

        return personDetail;
    }
}
