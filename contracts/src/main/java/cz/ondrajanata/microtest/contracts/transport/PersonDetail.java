package cz.ondrajanata.microtest.contracts.transport;

import java.util.Date;
import java.util.List;

/**
 * Created by Ondrej Janata on 8.8.16.
 * - janaton1@fel.cvut.cz
 */
public class PersonDetail {
    private Long id;
    private String name;
    private Date birthday;

    private List<AttendanceDetail> attendances;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List<AttendanceDetail> getAttendances() {
        return attendances;
    }

    public void setAttendances(List<AttendanceDetail> attendances) {
        this.attendances = attendances;
    }
}
