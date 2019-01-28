package Waehrungsrechner;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import java.util.Date;


@Entity
public class LoggerEntity {


    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;
    private String entry;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }


}
