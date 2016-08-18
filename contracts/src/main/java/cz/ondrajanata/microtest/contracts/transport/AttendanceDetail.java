package cz.ondrajanata.microtest.contracts.transport;

import java.util.Date;

/**
 * Created by Ondrej Janata on 8.8.16.
 * - janaton1@fel.cvut.cz
 */
public class AttendanceDetail {
    private Long id;
    private Date arrival;
    private Date departure;

    public AttendanceDetail() {
    }

    public AttendanceDetail(Long id, Date arrival, Date departure) {
        this.id = id;
        this.arrival = arrival;
        this.departure = departure;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getArrival() {
        return arrival;
    }

    public void setArrival(Date arrival) {
        this.arrival = arrival;
    }

    public Date getDeparture() {
        return departure;
    }

    public void setDeparture(Date departure) {
        this.departure = departure;
    }
}
