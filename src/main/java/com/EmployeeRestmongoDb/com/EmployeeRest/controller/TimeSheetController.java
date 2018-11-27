package com.EmployeeRestmongoDb.com.EmployeeRest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeeRestmongoDb.com.EmployeeRest.model.DaySheet;
import com.EmployeeRestmongoDb.com.EmployeeRest.model.Employee;
import com.EmployeeRestmongoDb.com.EmployeeRest.model.SubmitTimeSheet;
import com.EmployeeRestmongoDb.com.EmployeeRest.model.TimeSheetDetails;
import com.EmployeeRestmongoDb.com.EmployeeRest.model.TimeSheetRest;
import com.EmployeeRestmongoDb.com.EmployeeRest.service.TimeSheetService;

@RestController
public class TimeSheetController {

	@Autowired
	private TimeSheetService timesheetService;
		
//	@RequestMapping("/createTimesheet")
//	public String create(@RequestParam String ddljob,@RequestParam String selectWeek,@RequestParam String jobId,@RequestParam String approver) {
//		TimeSheetDetails t = timesheetService.create(ddljob, selectWeek, jobId, approver);
//		return t.toString();
//	}
	
	 @GetMapping(path= {"/viewTimeSheetCalander"},consumes= {
				MediaType.APPLICATION_JSON_VALUE
		},
		produces= {
				MediaType.APPLICATION_JSON_VALUE
				
		})
	 public String status()
	 {
	  return "working";
	 }
	
	@PostMapping(
			path= {"/timesheet"},
			consumes= {
					MediaType.APPLICATION_JSON_VALUE
			},
			produces= {
					MediaType.APPLICATION_JSON_VALUE
					
			})
	public ResponseEntity<TimeSheetDetails> createTimeSheetDetails(@RequestBody TimeSheetRest timesheetDetails) {
		
		
		TimeSheetDetails returnValue = new TimeSheetDetails();
		returnValue.setSelectWeek(timesheetDetails.getSelectWeek());
		returnValue.setApprover(timesheetDetails.getApprover());
		returnValue.setClient(timesheetDetails.getClient());
		returnValue.setJobTitle(timesheetDetails.getJobTitle());
		returnValue.setEndDate(timesheetDetails.getEndDate());
		returnValue.setProjectId(timesheetDetails.getProjectId());
		return new ResponseEntity<TimeSheetDetails>(returnValue,HttpStatus.OK);
		
	}
	
//	@RequestMapping("/employee")
//	public Employee create(@RequestParam String firstname,@RequestParam String lastname,@RequestParam int age)
//	{
//		Employee emp = employeeservice.create(firstname, lastname, age);
//		return emp;
//	}
	@PostMapping(
			path= {"/submitTimeSheet"},
			consumes= {
					MediaType.APPLICATION_JSON_VALUE
			},
			produces= {
					MediaType.APPLICATION_JSON_VALUE
					
			})
	public ResponseEntity<SubmitTimeSheet> createTimeSheet(@RequestBody SubmitTimeSheet submitDetails)
	{
	
		System.err.println(submitDetails.getWorkinghours().getDaySheet().size());

			SubmitTimeSheet submitTimeSheet = timesheetService.createTimeSheet(submitDetails.getWorkinghours(), submitDetails.getWorkingdetails());
		
		
		return new ResponseEntity<SubmitTimeSheet>(submitDetails,HttpStatus.OK);

		
	}

//	@PostMapping(
//			path= {"/submitTimeSheet"},
//			consumes= {
//					MediaType.APPLICATION_JSON_VALUE
//			},
//			produces= {
//					MediaType.APPLICATION_JSON_VALUE
//					
//			})
//	public ResponseEntity<SubmitTimeSheetRequest> createTimeSheetWeekDetails(@RequestBody SubmitTimeSheetRequest submitDetails) {
//		System.out.println("Dads" + submitDetails.getWorkingHours());
//		
//	
//	
//	return null;	
//	//	return new ResponseEntity<SubmitTimeSheetRequest>(returnValue,HttpStatus.OK);
//		
//		
//	}
}
	