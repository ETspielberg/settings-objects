package unidue.ub.settings.fachref;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class UserCategory {

    @Id
    @Column(unique=true)
    private String name;

    private List<UserGroup> usergroups;

    @Column(columnDefinition = "TEXT")
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<UserGroup> getUsergroups() {
        return usergroups;
    }

    public void setUsergroups(List<UserGroup> usergroups) {
        this.usergroups = usergroups;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
