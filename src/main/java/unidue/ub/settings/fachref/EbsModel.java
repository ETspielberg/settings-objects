package unidue.ub.settings.fachref;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EbsModel {

    @Id
    private String id;

    private String publisher;

    private String startOfEbs;

    private String endOfEbs;

    private double priceLimit;

    private String[] issns;

    private String description;

    public double getPriceLimit() {
        return priceLimit;
    }

    public void setPriceLimit(double priceLimit) {
        this.priceLimit = priceLimit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getStartOfEbs() {
        return startOfEbs;
    }

    public void setStartOfEbs(String startOfEbs) {
        this.startOfEbs = startOfEbs;
    }

    public String getEndOfEbs() {
        return endOfEbs;
    }

    public void setEndOfEbs(String endOfEbs) {
        this.endOfEbs = endOfEbs;
    }

    public String[] getIssns() {
        return issns;
    }

    public void setIssns(String[] issns) {
        this.issns = issns;
    }
}
