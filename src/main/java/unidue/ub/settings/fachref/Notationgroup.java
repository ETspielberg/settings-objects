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
	private String subjectID;

	@Column(columnDefinition = "TEXT")
    private String description;

    private String notations;
	
	/**
	 * returns the subject ID
	 * 
	 * @return subjectID the Id of the subject represented by the range of notations
	 */
	public String getSubjectID() {
		return subjectID;
	}

	/**
	 * sets the subject ID
	 * 
	 * @param subjectID the Id of the subject represented by the range of notations
	 * @return Notationgroup the updated <code>Notationgroup</code>-object
	 */
	public Notationgroup setSubjectID(String subjectID) {
		this.subjectID = subjectID;
		return this;
	}

	/**
	 * returns the description
	 * 
	 * @return description the description of the range of notations
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * sets the description
	 * 
	 * @param description the description of the range of notations
	 * @return Notationgroup the updated <code>Notationgroup</code>-object
	 */
	public Notationgroup setDescription(String description) {
		this.description = description;
		return this;
	}

	/**
	 * returns the notations
	 * 
	 * @return notations the range of notations
	 */
	public String getNotations() {
		return notations;
	}

	/**
	 * sets the notations
	 * 
	 * @param notations the range of notations
	 * @return Notationgroup the updated <code>Notationgroup</code>-object
	 */
	public Notationgroup setNotations(String notations) {
		this.notations = notations;
		return this;
	}

	

}
