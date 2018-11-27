
package com.EmployeeRestmongoDb.com.EmployeeRest.model;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "workinghours",
    "workingdetails"
})
@Document
public class SubmitTimeSheet {

	
	
    public SubmitTimeSheet(Workinghours workinghours, Workingdetails workingdetails) {
		super();
		this.workinghours = workinghours;
		this.workingdetails = workingdetails;
	}
    @Id
    UUID id = UUID.randomUUID();
	@JsonProperty("workinghours")
    private Workinghours workinghours;
    @JsonProperty("workingdetails")
    private Workingdetails workingdetails;

    @JsonProperty("workinghours")
    public Workinghours getWorkinghours() {
        return workinghours;
    }

    @Override
	public String toString() {
		return "SubmitTimeSheet [workinghours=" + workinghours + ", workingdetails=" + workingdetails + "]";
	}

	@JsonProperty("workinghours")
    public void setWorkinghours(Workinghours workinghours) {
        this.workinghours = workinghours;
    }

    @JsonProperty("workingdetails")
    public Workingdetails getWorkingdetails() {
        return workingdetails;
    }

    @JsonProperty("workingdetails")
    public void setWorkingdetails(Workingdetails workingdetails) {
        this.workingdetails = workingdetails;
    }

}
