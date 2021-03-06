package unidue.ub.settings.fachref;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
public abstract class Profile {

    @Id
    @Column(unique=true)
    String identifier;

    @Enumerated(EnumType.STRING)
    Status status = Status.CREATED;

    Timestamp lastrun;

    Timestamp created = Timestamp.valueOf(LocalDateTime.now());

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Timestamp getLastrun() {
        return lastrun;
    }

    public void setLastrun(Timestamp lastrun) {
        this.lastrun = lastrun;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
