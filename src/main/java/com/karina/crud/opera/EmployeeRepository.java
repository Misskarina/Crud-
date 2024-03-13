package com.karina.crud.opera;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository <Employee,Long> {

	Employee findById(int id);

	

	

}
