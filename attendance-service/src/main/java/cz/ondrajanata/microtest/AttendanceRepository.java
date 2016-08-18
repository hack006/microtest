package cz.ondrajanata.microtest;

import cz.ondrajanata.microtest.dm.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Ondrej Janata on 9.8.16.
 * - janaton1@fel.cvut.cz
 */
public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
    public List<Attendance> findByPersonId(long personId);
}
