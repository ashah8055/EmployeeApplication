package com.EmployeeRestmongoDb.com.EmployeeRest.model;

import java.util.UUID;

import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class TimeSheetDetails {

	@Transient
	private UUID reqId = UUID.randomUUID();
	
	String selectWeek;
	String approver;
	String client;
	String jobTitle;
	String endDate;
	String projectId;
	
	
	

	
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getSelectWeek() {
		return selectWeek;
	}
	public void setSelectWeek(String selectWeek) {
		this.selectWeek = selectWeek;
	}
	public String getApprover() {
		return approver;
	}
	public void setApprover(String approver) {
		this.approver = approver;
	}
	public UUID getReqId() {
		return reqId;
	}
	
		
}
