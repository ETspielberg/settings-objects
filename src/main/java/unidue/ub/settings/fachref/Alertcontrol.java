package unidue.ub.settings.fachref;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Eike on 08.07.2017.
 */
@Entity
public class Alertcontrol extends Profile{

    @Column(columnDefinition = "TEXT")
    private String description;

    private String notationgroup;

    private double thresholdRatio;

    private int thresholdRequests;

    private int thresholdDuration;

    private long timeperiod;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
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

    public double thresholdRatio() {
        return thresholdRatio;
    }

    public void setThresholdRatio(Double thresholdRatio) {
        this.thresholdRatio = thresholdRatio;
    }

    public int getThresholdRequests() {
        return thresholdRequests;
    }

    public void setThresholdRequests(int thresholdRequests) {
        this.thresholdRequests = thresholdRequests;
    }

    public int getThresholdDuration() {
        return thresholdDuration;
    }

    public void setThresholdDuration(int thresholdDuration) {
        this.thresholdDuration = thresholdDuration;
    }

    public double getThresholdRatio() {
        return thresholdRatio;
    }

    public void setThresholdRatio(double thresholdRatio) {
        this.thresholdRatio = thresholdRatio;
    }

    public long getTimeperiod() {
        return timeperiod;
    }

    public void setTimeperiod(long timeperiod) {
        this.timeperiod = timeperiod;
    }
}
