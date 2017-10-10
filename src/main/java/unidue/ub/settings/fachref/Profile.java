package unidue.ub.settings.fachref;

import java.util.Date;

public abstract class Profile {

    private String identifier;

    private String status;

    private Date lastrun;

    public Date getLastrun() {
        return lastrun;
    }

    public void setLastrun(Date lastrun) {
        this.lastrun = lastrun;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
