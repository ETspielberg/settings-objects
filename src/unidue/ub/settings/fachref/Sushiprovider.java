package unidue.ub.settings.fachref;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Plain Old Java Object as representation of a SUSHI provider with all the necessary data to retrieve the reports.
 * @author Eike Spielberg
 *
 */
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Sushiprovider {
    
    @Id
    @GeneratedValue
    private long id;

    private String name;
    
    private String sushiURL;
    
    private String sushiRequestorID;
    
    private String sushiRequestorName;
    
    private String sushiRequestorEmail;
    
    private String sushiCustomerReferenceID;
    
    private String sushiCustomerReferenceName;
    
    private int sushiRelease;
    
    public Sushiprovider() {
        name = "";
        sushiURL = "";
        sushiRequestorID = "";
        sushiRequestorName = "";
        sushiRequestorEmail = "";
        sushiCustomerReferenceID = "";
        sushiCustomerReferenceName = "";
        sushiRelease = 4;
    }

    /**
	 * returns the name of the SUSHI provider
	 * @return the name
	 */
	public String getName() {
        return name;
    }

	/**
	 * returns the name of the SUSHI provider
	 * @param name the name
	 */
	public void setName(String name) {
        this.name = name;
    }
    
    /**
	 * returns the release of the SUSHI API
	 * @return the release of the SUSHI API
	 */
	public int getSushiRelease() {
        return sushiRelease;
    }

	/**
	 * returns the release of the SUSHI API
	 * @param sushiRelease the release of the SUSHI API
	 */
	public void setSushiRelease(int sushiRelease) {
        this.sushiRelease = sushiRelease;
    }

    /**
	 * returns the URL of the SUSHI API
	 * @return the URL of the SUSHI API
	 */
	public String getSushiURL() {
        return sushiURL;
    }

	/**
	 * sets the URL of the SUSHI API
	 * @param sushiURL the URL of the SUSHI API
	 */
	public void setSushiURL(String sushiURL) {
        this.sushiURL = sushiURL;
    }

    /**
	 * returns the requestor ID used for querying the usage data
	 * @return the requestor ID
	 */
	public String getSushiRequestorID() {
        return sushiRequestorID;
    }

	/**
	 * sets the requestor ID used for querying the usage data
	 * @param sushiRequestorID the requestor ID
	 */
	public void setSushiRequestorID(String sushiRequestorID) {
        this.sushiRequestorID = sushiRequestorID;
    }

    /**
	 * returns the name of the requestor
	 * @return the name of the requestor
	 */
	public String getSushiRequestorName() {
        return sushiRequestorName;
    }

	/**
	 * sets the name of the requestor
	 * @param sushiRequestorName the name of the requestor
	 */
	public void setSushiRequestorName(String sushiRequestorName) {
        this.sushiRequestorName = sushiRequestorName;
    }

    /**
	 * returns the email address of the requestor
	 * @return the email address
	 */
	public String getSushiRequestorEmail() {
        return sushiRequestorEmail;
    }

	/**
	 * sets the email address of the requestor
	 * @param sushiRequestorEmail the email address
	 */
	public void setSushiRequestorEmail(String sushiRequestorEmail) {
        this.sushiRequestorEmail = sushiRequestorEmail;
    }

    /**
	 * returns the reference ID of the customer
	 * @return the reference ID
	 */
	public String getSushiCustomerReferenceID() {
        return sushiCustomerReferenceID;
    }

	/**
	 * sets the reference ID of the customer
	 * @param sushiCustomerReferenceID the reference ID
	 */
	public void setSushiCustomerReferenceID(String sushiCustomerReferenceID) {
        this.sushiCustomerReferenceID = sushiCustomerReferenceID;
    }

    /**
	 * returns the reference name of the customer
	 * @return the reference name
	 */
	public String getSushiCustomerReferenceName() {
        return sushiCustomerReferenceName;
    }

	/**
	 * sets the reference name of the customer
	 * @param sushiCustomerReferenceName the reference name
	 */
	public void setSushiCustomerReferenceName(String sushiCustomerReferenceName) {
        this.sushiCustomerReferenceName = sushiCustomerReferenceName;
    }
}
