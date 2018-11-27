package com.EmployeeRestmongoDb.com.EmployeeRest.model;

public class TimeSheetRest {

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


}
