package com.EmployeeRestmongoDb.com.EmployeeRest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EmployeeRestmongoDb.com.EmployeeRest.model.DaySheet;
import com.EmployeeRestmongoDb.com.EmployeeRest.model.Employee;
import com.EmployeeRestmongoDb.com.EmployeeRest.model.SubmitTimeSheet;
import com.EmployeeRestmongoDb.com.EmployeeRest.model.TimeSheetDetails;
import com.EmployeeRestmongoDb.com.EmployeeRest.model.Workingdetails;
import com.EmployeeRestmongoDb.com.EmployeeRest.model.Workinghours;
import com.EmployeeRestmongoDb.com.EmployeeRest.repository.TimeSheetRepository;
import com.fasterxml.jackson.annotation.JsonProperty;

@Service
public class TimeSheetService {

	@Autowired
	private TimeSheetRepository timesheetRepository;




	//Create
	public SubmitTimeSheet createTimeSheet(Workinghours workinghours,Workingdetails workingdetails)
	{
		return timesheetRepository.save(new SubmitTimeSheet(workinghours,workingdetails));
	}
	
	
}
