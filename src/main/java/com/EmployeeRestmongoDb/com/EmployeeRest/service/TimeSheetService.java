package com.EmployeeRestmongoDb.com.EmployeeRest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EmployeeRestmongoDb.com.EmployeeRest.model.TimeSheet;
import com.EmployeeRestmongoDb.com.EmployeeRest.repository.TimeSheetRepository;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

@Service
public class TimeSheetService {

	@Autowired
	private TimeSheetRepository timesheetRepository;




	//Create
	public TimeSheet createTimeSheet(TimeSheet submitTimeSheet)
	{
		return timesheetRepository.save(submitTimeSheet);
	}
	//Retrive All
	public List<TimeSheet> getAll()
	{
		return timesheetRepository.findAll();
	}

	public String getByEmpId()
	{
		JsonArray obj = new  JsonArray();
		
		List<TimeSheet> timeSheets = timesheetRepository.findAll();
		
		for (TimeSheet timeSheet : timeSheets) {

			JsonObject jsonObj = new JsonObject();
			jsonObj.addProperty("id",timeSheet.getWorkingdetails().getEmployeeId());
			jsonObj.addProperty("name", "xyz");
			
			obj.add(jsonObj);



		
		}
		System.out.println(obj);

		return obj.toString();


	}



}
