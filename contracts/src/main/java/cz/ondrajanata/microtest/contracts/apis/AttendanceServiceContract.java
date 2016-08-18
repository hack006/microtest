package cz.ondrajanata.microtest.contracts.apis;

import cz.ondrajanata.microtest.contracts.transport.AttendanceDetail;

import java.util.List;

/**
 * Created by Ondrej Janata on 10.8.16.
 * - janaton1@fel.cvut.cz
 */
public interface AttendanceServiceContract {
    List<AttendanceDetail> findPersonAttendances(long personId);
}
