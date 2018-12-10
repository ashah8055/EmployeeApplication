
package com.EmployeeRestmongoDb.com.EmployeeRest.model;

import java.util.UUID;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "selectWeek",
    "jobTitle",
    "endClient",
    "client",
    "approver",
    "endDate",
    "projectId",
    "employeeId"
})
public class TimeSheetDetails {

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public UUID getId() {
		return id;
	}

	@Id
    UUID id = UUID.randomUUID();
	
    @JsonProperty("selectWeek")
    private String selectWeek;
    @JsonProperty("jobTitle")
    private String jobTitle;
    @JsonProperty("endClient")
    private String endClient;
    @JsonProperty("client")
    private String client;
    @JsonProperty("approver")
    private String approver;
    @JsonProperty("endDate")
    private String endDate;
    @JsonProperty("projectId")
    private String projectId;
    @JsonProperty("employeeId")
    private String employeeId	;
    @JsonProperty("selectWeek")
    public String getSelectWeek() {
        return selectWeek;
    }

    @JsonProperty("selectWeek")
    public void setSelectWeek(String selectWeek) {
        this.selectWeek = selectWeek;
    }

    @JsonProperty("jobTitle")
    public String getJobTitle() {
        return jobTitle;
    }

    @JsonProperty("jobTitle")
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @JsonProperty("endClient")
    public String getEndClient() {
        return endClient;
    }

    @JsonProperty("endClient")
    public void setEndClient(String endClient) {
        this.endClient = endClient;
    }

    @JsonProperty("client")
    public String getClient() {
        return client;
    }

    @JsonProperty("client")
    public void setClient(String client) {
        this.client = client;
    }

    @JsonProperty("approver")
    public String getApprover() {
        return approver;
    }

    @JsonProperty("approver")
    public void setApprover(String approver) {
        this.approver = approver;
    }

    @JsonProperty("endDate")
    public String getEndDate() {
        return endDate;
    }

    @JsonProperty("endDate")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("projectId")
    public String getProjectId() {
        return projectId;
    }

    @JsonProperty("projectId")
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

}
