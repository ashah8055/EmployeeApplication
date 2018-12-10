
package com.EmployeeRestmongoDb.com.EmployeeRest.model;

import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "totalWeekWorkHours",
    "totalWeekBillableHours",
    "totalWeekTimeoffHours",
    "totalWeekHours",
    "comments",
    "status",
    "daySheet",
    "employeeId",
    "timeSheetId"
})
public class WorkWeekDetails {

    @JsonProperty("totalWeekWorkHours")
    private Integer totalWeekWorkHours;
    @JsonProperty("totalWeekBillableHours")
    private Integer totalWeekBillableHours;
    @JsonProperty("totalWeekTimeoffHours")
    private Integer totalWeekTimeoffHours;
    @JsonProperty("totalWeekHours")
    private Integer totalWeekHours;
    @JsonProperty("comments")
    private String comments;
    @JsonProperty("status")
    private String status;
   
    @JsonProperty("daySheet")
    private List<DaySheet> daySheet = null;
    @JsonProperty("employeeId")
    private String employeeId;
   
    @JsonProperty("timeSheetId")
    private String timeSheetId;
   

    public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getTimeSheetId() {
		return timeSheetId;
	}

	public void setTimeSheetId(String timeSheetId) {
		this.timeSheetId = timeSheetId;
	}

	@JsonProperty("daySheet")
    public List<DaySheet> getDaySheet() {
        return daySheet;
    }

    @JsonProperty("daySheet")
    public void setDaySheet(List<DaySheet> daySheet) {
        this.daySheet = daySheet;
    }
   

	

	@JsonProperty("totalWeekWorkHours")
    public Integer getTotalWeekWorkHours() {
        return totalWeekWorkHours;
    }

    @JsonProperty("totalWeekWorkHours")
    public void setTotalWeekWorkHours(Integer totalWeekWorkHours) {
        this.totalWeekWorkHours = totalWeekWorkHours;
    }

    @JsonProperty("totalWeekBillableHours")
    public Integer getTotalWeekBillableHours() {
        return totalWeekBillableHours;
    }

    @JsonProperty("totalWeekBillableHours")
    public void setTotalWeekBillableHours(Integer totalWeekBillableHours) {
        this.totalWeekBillableHours = totalWeekBillableHours;
    }

    @JsonProperty("totalWeekTimeoffHours")
    public Integer getTotalWeekTimeoffHours() {
        return totalWeekTimeoffHours;
    }

    @JsonProperty("totalWeekTimeoffHours")
    public void setTotalWeekTimeoffHours(Integer totalWeekTimeoffHours) {
        this.totalWeekTimeoffHours = totalWeekTimeoffHours;
    }

    @JsonProperty("totalWeekHours")
    public Integer getTotalWeekHours() {
        return totalWeekHours;
    }

    @JsonProperty("totalWeekHours")
    public void setTotalWeekHours(Integer totalWeekHours) {
        this.totalWeekHours = totalWeekHours;
    }

    @JsonProperty("comments")
    public String getComments() {
        return comments;
    }

    @JsonProperty("comments")
    public void setComments(String comments) {
        this.comments = comments;
    }

}
