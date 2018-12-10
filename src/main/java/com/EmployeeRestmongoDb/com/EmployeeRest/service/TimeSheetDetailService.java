package com.EmployeeRestmongoDb.com.EmployeeRest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EmployeeRestmongoDb.com.EmployeeRest.model.TimeSheetDetails;
import com.EmployeeRestmongoDb.com.EmployeeRest.repository.TimeSheetDetailRepository;
@Service
public class TimeSheetDetailService {

	@Autowired
	TimeSheetDetailRepository timeSheetRepository;
	
	
	
	//Create
	
	public TimeSheetDetails createTimeSheetDetail(TimeSheetDetails TimeSheetDetails)
	{
		return timeSheetRepository.save(TimeSheetDetails);
	}
	//public SubmitTimeSheet createTimeSheet(SubmitTimeSheet submitTimeSheet)
	//	{
	//		return timesheetRepository.save(submitTimeSheet);
	//	}
}
