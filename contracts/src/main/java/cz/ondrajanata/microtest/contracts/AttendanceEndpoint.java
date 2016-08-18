package cz.ondrajanata.microtest.contracts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Ondrej Janata on 9.8.16.
 * - janaton1@fel.cvut.cz
 */
@Component
public class AttendanceEndpoint {
    public static final String PERSON_ATTENDANCE = "/person/attendances/{personId}";

    @Autowired
    private EnvConfig envConfig;

    public String getPersonAttendanceUrl(long personId) {
        return envConfig.getAttendanceUrl() + PERSON_ATTENDANCE.replace("{personId}", String.valueOf(personId));
    }
}