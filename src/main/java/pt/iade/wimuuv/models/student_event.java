package pt.iade.wimuuv.models;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_event")

public class student_event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="stu_ev_id") private int id;
    @Column(name="stu_entry_id") private int entryId;
    @Column(name="stu_ev_entrytime") private Timestamp evEntrytime;
    @Column(name="ev_id") private int evId;

    public Timestamp getEvEntrytime() {
        return evEntrytime;
    }
    public int getId() {
        return id;
    }
    public int getEntryId() {
        return entryId;
    }
    public int getEv_id() {
        return evId;
    }
    
}
