package cz.ondrajanata.microtest.api;

import cz.ondrajanata.microtest.contracts.AttendanceEndpoint;
import cz.ondrajanata.microtest.contracts.apis.AttendanceServiceContract;
import cz.ondrajanata.microtest.contracts.transport.AttendanceDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by Ondrej Janata on 8.8.16.
 * - janaton1@fel.cvut.cz
 */
@Service
public class AttendanceService implements AttendanceServiceContract {
    private RestTemplate restTemplate = new RestTemplate();

    @Autowired
    private AttendanceEndpoint attendanceEndpoint;

    @Override
    @SuppressWarnings("unchecked")
    public List<AttendanceDetail> findPersonAttendances(long personId) {
        return restTemplate.getForObject(attendanceEndpoint.getPersonAttendanceUrl(personId), List.class);
    }
}
