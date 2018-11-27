
package com.EmployeeRestmongoDb.com.EmployeeRest.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "daySheet"
})
public class Workinghours {

    @JsonProperty("daySheet")
    private List<DaySheet> daySheet = null;

    @JsonProperty("daySheet")
    public List<DaySheet> getDaySheet() {
        return daySheet;
    }

    @JsonProperty("daySheet")
    public void setDaySheet(List<DaySheet> daySheet) {
        this.daySheet = daySheet;
    }

}
