package com.EmployeeRestmongoDb.com.EmployeeRest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.EmployeeRestmongoDb.com.EmployeeRest.model.DaySheet;
import com.EmployeeRestmongoDb.com.EmployeeRest.model.SubmitTimeSheet;

@Repository
public interface TimeSheetRepository extends MongoRepository<SubmitTimeSheet, String>{

//	public List<TimeSheetDetails> findByApprover(String approver);
	
	
}
