package cz.ondrajanata.microtest.contracts;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Ondrej Janata on 10.8.16.
 * - janaton1@fel.cvut.cz
 */
@Component
public class EnvConfig {
    @Value("${microtest.url.attendance}")
    private String attendanceUrl;

    public String getAttendanceUrl() {
        return attendanceUrl;
    }
}
