package unidue.ub.settings.fachref;

import javax.persistence.*;

@Entity
@Table(name="elisa_data")
public class ElisaData {

    private String description;

    @Id
    @Column(name="elisa_mail")
    private String elisaUserId;

    @Column(name="elisa_name")
    private String elisaName;

    @Transient
    private int priority;

    public ElisaData() {
        this.priority = 99;
    }

    public ElisaData(String elisaUserId, String elisaName, String description, int priority) {
        this.elisaUserId = elisaUserId;
        this.elisaName = elisaName;
        this.description = description;
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getElisaUserId() {
        return elisaUserId;
    }

    public void setElisaUserId(String elisaUserId) {
        this.elisaUserId = elisaUserId;
    }

    public String getElisaName() {
        return elisaName;
    }

    public void setElisaName(String elisaName) {
        this.elisaName = elisaName;
    }
}
