package unidue.ub.settings.fachref;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class FachrefProcess {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private Date lastTouch;

	private String process;

	private String identifier;

	private String status;

	private String message;
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date date = new Date();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getLastTouch() {
		return lastTouch;
	}

	public void setLastTouch(Date lastTouch) {
		this.lastTouch = lastTouch;
	}

	public String getProcess() {
		return process;
	}

	public void setProcess(String process) {
		this.process = process;
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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void addMessage(String message) {
		this.message += "; " + message;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
