package cz.ondrajanata.microtest;

import cz.ondrajanata.microtest.contracts.apis.AttendanceServiceContract;
import cz.ondrajanata.microtest.contracts.transport.AttendanceDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Ondrej Janata on 9.8.16.
 * - janaton1@fel.cvut.cz
 */
@Service
public class AttendanceService implements AttendanceServiceContract{
    @Autowired
    private AttendanceRepository attendanceRepository;

    public List<AttendanceDetail> findPersonAttendances(long personId) {
        return attendanceRepository.findByPersonId(personId).stream()
                .map(attendance -> new AttendanceDetail(attendance.getId(), attendance.getArrival(), attendance.getDeparture()))
                .collect(Collectors.toList());
    }
}
