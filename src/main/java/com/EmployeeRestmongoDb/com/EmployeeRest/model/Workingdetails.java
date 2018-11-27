
package com.EmployeeRestmongoDb.com.EmployeeRest.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "totalWeekWorkHours",
    "totalWeekBillableHours",
    "totalWeekTimeoffHours",
    "totalWeekHours",
    "comments"
})
public class Workingdetails {

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
