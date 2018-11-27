
package com.EmployeeRestmongoDb.com.EmployeeRest.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "day",
    "workHours",
    "timeOffHour",
    "date",
    "billableHours",
    "totalHour",
    "notes"
})

public class DaySheet {

	
	
	

	@JsonProperty("day")
    private String day;
    @JsonProperty("workHours")
    private String workHours;
    @JsonProperty("timeOffHour")
    private String timeOffHour;
    @JsonProperty("date")
    private String date;
    @JsonProperty("billableHours")
    private String billableHours;
    @JsonProperty("totalHour")
    private String totalHour;
    @JsonProperty("notes")
    private String notes;

    @JsonProperty("day")
    public String getDay() {
        return day;
    }

    @JsonProperty("day")
    public void setDay(String day) {
        this.day = day;
    }

    @JsonProperty("workHours")
    public String getWorkHours() {
        return workHours;
    }

    @JsonProperty("workHours")
    public void setWorkHours(String workHours) {
        this.workHours = workHours;
    }

    @JsonProperty("timeOffHour")
    public String getTimeOffHour() {
        return timeOffHour;
    }

    @JsonProperty("timeOffHour")
    public void setTimeOffHour(String timeOffHour) {
        this.timeOffHour = timeOffHour;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("billableHours")
    public String getBillableHours() {
        return billableHours;
    }

    @JsonProperty("billableHours")
    public void setBillableHours(String billableHours) {
        this.billableHours = billableHours;
    }

    @JsonProperty("totalHour")
    public String getTotalHour() {
        return totalHour;
    }

    @JsonProperty("totalHour")
    public void setTotalHour(String totalHour) {
        this.totalHour = totalHour;
    }

    @JsonProperty("notes")
    public String getNotes() {
        return notes;
    }

    @JsonProperty("notes")
    public void setNotes(String notes) {
        this.notes = notes;
    }

}
