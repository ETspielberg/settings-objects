package unidue.ub.settings.fachref;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Eike on 08.07.2017.
 */
@Entity
public class Alertcontrol extends Profile{

    @Id
    @Column(unique=true)
    private String identifier;

    private String username;

    @Column(columnDefinition = "TEXT")
    private String description;

    private String notationgroup;

    private boolean performAlert;

    private boolean performReader;

    private Double thresholdReader;

    private Double thresholdAlert;

    private int thresholdDuration;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNotationgroup() {
        return notationgroup;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNotationgroup(String notationgroup) {
        this.notationgroup = notationgroup;
    }

    public boolean isPerformAlert() {
        return performAlert;
    }

    public void setPerformAlert(boolean performAlert) {
        this.performAlert = performAlert;
    }

    public boolean isPerformReader() {
        return performReader;
    }

    public void setPerformReader(boolean performReader) {
        this.performReader = performReader;
    }

    public Double getThresholdReader() {
        return thresholdReader;
    }

    public void setThresholdReader(Double thresholdReader) {
        this.thresholdReader = thresholdReader;
    }

    public Double getThresholdAlert() {
        return thresholdAlert;
    }

    public void setThresholdAlert(Double thresholdAlert) {
        this.thresholdAlert = thresholdAlert;
    }

    public int getThresholdDuration() {
        return thresholdDuration;
    }

    public void setThresholdDuration(int thresholdDuration) {
        this.thresholdDuration = thresholdDuration;
    }
}
