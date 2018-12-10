
package com.EmployeeRestmongoDb.com.EmployeeRest.model;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "workingdetails"
})
@Document
public class TimeSheet {

	public TimeSheet()
	{
		
	}
	
    public TimeSheet(WorkWeekDetails workingdetails) {
		super();
		this.workingdetails = workingdetails;
	}

	@Id
    UUID id = UUID.randomUUID();
	  @JsonProperty("workingdetails")
    private WorkWeekDetails workingdetails;

   
	@JsonProperty("workingdetails")
    public WorkWeekDetails getWorkingdetails() {
        return workingdetails;
    }

    @JsonProperty("workingdetails")
    public void setWorkingdetails(WorkWeekDetails workingdetails) {
        this.workingdetails = workingdetails;
    }

    @Override
   	public String toString() {
   		return "TimeSheet [id=" + id + ", workingdetails=" + workingdetails + "]";
   	}
}
