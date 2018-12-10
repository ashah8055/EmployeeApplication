package com.EmployeeRestmongoDb.com.EmployeeRest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeeRestmongoDb.com.EmployeeRest.model.TimeSheet;
import com.EmployeeRestmongoDb.com.EmployeeRest.model.TimeSheetDetails;
import com.EmployeeRestmongoDb.com.EmployeeRest.service.TimeSheetDetailService;
import com.EmployeeRestmongoDb.com.EmployeeRest.service.TimeSheetService;

@RestController
@RequestMapping("/timesheet")
public class TimeSheetController {

	@Autowired
	private TimeSheetService timesheetService;
	@Autowired
	private TimeSheetDetailService timeSheetDetailService;
		
	
	 @GetMapping(path= {"/veiw"},consumes= {
				MediaType.APPLICATION_JSON_VALUE
		},
		produces= {
				MediaType.APPLICATION_JSON_VALUE
				
		})
	 public String viewAll()
	 {
		 
	return timesheetService.getByEmpId();
	  
	 }
	
	@PostMapping(
			path= {"/create"},
			consumes= {
					MediaType.APPLICATION_JSON_VALUE
			},
			produces= {
					MediaType.APPLICATION_JSON_VALUE
					
			})
	public ResponseEntity<TimeSheetDetails> createTimeSheetDetails(@RequestBody TimeSheetDetails timesheetDetails) {
		
		
		
	//	TimeSheetDetails timeSheetDetails = timeSheetDetailService.createTimeSheetDetail(timesheetDetails);	
		
		
		return new ResponseEntity<TimeSheetDetails>(timesheetDetails,HttpStatus.OK);
		
	}
	
	@PostMapping(
			path= {"/submit"},
			consumes= {
					MediaType.APPLICATION_JSON_VALUE
			},
			produces= {
					MediaType.APPLICATION_JSON_VALUE
					
			})
	public ResponseEntity<TimeSheet> createTimeSheet(@RequestBody TimeSheet submitDetails)
	{
		TimeSheetDetails timesheet = new TimeSheetDetails();
	
			TimeSheet submitTimeSheet = timesheetService.createTimeSheet(submitDetails);
		
		
		return new ResponseEntity<TimeSheet>(submitDetails,HttpStatus.OK);

		
	}

	@PostMapping(
			path= {"/save"},
			consumes= {
					MediaType.APPLICATION_JSON_VALUE
			},
			produces= {
					MediaType.APPLICATION_JSON_VALUE
					
			})
	public ResponseEntity<TimeSheet> saveTimeSheet(@RequestBody TimeSheet submitDetails)
	{
				TimeSheet submitTimeSheet = timesheetService.createTimeSheet(submitDetails);
		
		
		return new ResponseEntity<TimeSheet>(submitDetails,HttpStatus.OK);

		
	}

	

}
	