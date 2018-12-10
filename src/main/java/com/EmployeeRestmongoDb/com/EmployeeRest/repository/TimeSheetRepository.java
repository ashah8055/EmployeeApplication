package com.EmployeeRestmongoDb.com.EmployeeRest.repository;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.EmployeeRestmongoDb.com.EmployeeRest.model.DaySheet;
import com.EmployeeRestmongoDb.com.EmployeeRest.model.TimeSheet;

@Repository
public interface TimeSheetRepository extends MongoRepository<TimeSheet, UUID>{

//	public List<TimeSheetDetails> findByApprover(String approver);
	
	
}
