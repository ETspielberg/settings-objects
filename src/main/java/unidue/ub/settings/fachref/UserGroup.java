package unidue.ub.settings.fachref;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserGroup {

    @Id
    @Column(unique=true)
    private String name;

    private String systemIdentifier;

    @Column(columnDefinition = "TEXT")
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSystemIdentifier() {
        return systemIdentifier;
    }

    public void setSystemIdentifier(String systemIdentifier) {
        this.systemIdentifier = systemIdentifier;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
