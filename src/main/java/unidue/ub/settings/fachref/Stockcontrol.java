package unidue.ub.settings.fachref;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by Eike on 22.06.2017.
 */
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Stockcontrol extends Profile{

    @Id
    @Column(unique=true)
    private String identifier;

    private String description;

    private String subjectID;

    private String systemCode;

    private String collections;

    private String materials;

    private Integer yearsToAverage;

    private Integer minimumYears;

    private Double staticBuffer;

    private Double variableBuffer;

    private String deletionMailBcc;

    private Integer yearsOfRequests;

    private Integer minimumDaysOfRequest;

    private Double blacklistExpire;

    private Boolean groupedAnalysis;

    private String status;

    private Date created;

    private Date lastRun;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID.trim();
    }

    public String getSystemCode() {
        return systemCode;
    }

    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode.trim();
    }

    public String getCollections() {
        return collections;
    }

    public void setCollections(String collections) {
        this.collections = collections.trim();
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials.trim();
    }

    public Integer getYearsToAverage() {
        return yearsToAverage;
    }

    public void setYearsToAverage(Integer yearsToAverage) {
        this.yearsToAverage = yearsToAverage;
    }

    public Integer getMinimumYears() {
        return minimumYears;
    }

    public void setMinimumYears(Integer minimumYears) {
        this.minimumYears = minimumYears;
    }

    public Double getStaticBuffer() {
        return staticBuffer;
    }

    public void setStaticBuffer(Double staticBuffer) {
        this.staticBuffer = staticBuffer;
    }

    public Double getVariableBuffer() {
        return variableBuffer;
    }

    public void setVariableBuffer(Double variableBuffer) {
        this.variableBuffer = variableBuffer;
    }

    public String getDeletionMailBcc() {
        return deletionMailBcc;
    }

    public void setDeletionMailBcc(String deletionMailBcc) {
        this.deletionMailBcc = deletionMailBcc.trim();
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier.trim();
    }

    public Integer getYearsOfRequests() {
        return yearsOfRequests;
    }

    public void setYearsOfRequests(Integer yearsOfRequests) {
        this.yearsOfRequests = yearsOfRequests;
    }

    public Integer getMinimumDaysOfRequest() {
        return minimumDaysOfRequest;
    }

    public void setMinimumDaysOfRequest(Integer minimumDaysOfRequest) {
        this.minimumDaysOfRequest = minimumDaysOfRequest;
    }

    public Double getBlacklistExpire() {
        return blacklistExpire;
    }

    public void setBlacklistExpire(Double blacklistExpire) {
        this.blacklistExpire = blacklistExpire;
    }

    public Boolean isGroupedAnalysis() {
        return groupedAnalysis;
    }

    public void setGroupedAnalysis(Boolean groupedAnalysis) {
        this.groupedAnalysis = groupedAnalysis;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getLastRun() {
        return lastRun;
    }

    public void setLastRun(Date lastRun) {
        this.lastRun = lastRun;
    }
}
