package com.EmployeeRestmongoDb.com.EmployeeRest.repository;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.EmployeeRestmongoDb.com.EmployeeRest.model.TimeSheetDetails;

public interface TimeSheetDetailRepository extends MongoRepository<TimeSheetDetails,UUID>{

}
