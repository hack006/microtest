package cz.ondrajanata.microtest;

import cz.ondrajanata.microtest.contracts.AttendanceEndpoint;
import cz.ondrajanata.microtest.contracts.transport.AttendanceDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Ondrej Janata on 9.8.16.
 * - janaton1@fel.cvut.cz
 */
@RestController
public class AttendanceController {
    @Autowired
    private AttendanceService attendanceService;

    @RequestMapping(value = AttendanceEndpoint.PERSON_ATTENDANCE, method = RequestMethod.GET)
    public List<AttendanceDetail> findPersonAttendances(@PathVariable("personId") long personId) {
        return attendanceService.findPersonAttendances(personId);
    }
}
