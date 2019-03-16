package unidue.ub.settings.fachref;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Plain old java object holding a subject and the corresponding description and range of notation.
 * 
 * @author Eike Spielberg
 * @version 1
 */
@Entity
public class Notationgroup {

	@Id
	private String notationgroupName;

	@Column(columnDefinition = "TEXT")
    private String description;

    private String notationsStart;

    private String notationsEnd;

    private String elisaMail;

	public String getElisaMail() {
		return elisaMail;
	}

	public void setElisaMail(String elisaMail) {
		this.elisaMail = elisaMail;
	}

	public String getNotationgroupName() {
		return notationgroupName;
	}

	public String type;

	public void setNotationgroupName(String notationgroupName) {
		this.notationgroupName = notationgroupName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNotationsStart() {
		return notationsStart;
	}

	public void setNotationsStart(String notationsStart) {
		this.notationsStart = notationsStart;
	}

	public String getNotationsEnd() {
		return notationsEnd;
	}

	public void setNotationsEnd(String notationsEnd) {
		this.notationsEnd = notationsEnd;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
