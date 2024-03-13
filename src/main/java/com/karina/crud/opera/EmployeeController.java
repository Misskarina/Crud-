package com.karina.crud.opera;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeRepository erepo;
	@RequestMapping("/testing")
	public String test()
	{
		return "the crud operation";
	}
	@PostMapping("/save")
	public Employee save()
	{
		Employee emp=new Employee();
		emp.setFirstname("Siddhart");
		emp.setLastname("Malhotra");
		emp.setDepartment("ECE");
		emp.setSalary(250000);
		return erepo.save(emp);
	}
	@RequestMapping("/saveall")
	public String saveAll()
	{
		Employee emp1=new Employee();
		emp1.setFirstname("Raj");
		emp1.setLastname("Singh");
		emp1.setDepartment("CE");
		emp1.setSalary(700000);
		
		Employee emp2=new Employee();
		emp2.setFirstname("Deepak");
		emp2.setLastname("Mandal");
		emp2.setDepartment("CE");
		emp2.setSalary(200000);
		
		Employee emp3=new Employee();
		emp3.setFirstname("Jagrit");
		emp3.setLastname("Singh");
		emp3.setDepartment("ECE");
		emp3.setSalary(350000);
		
		Employee emp4=new Employee();
		emp4.setFirstname("Jaydeep");
		emp4.setLastname("Das");
		emp4.setDepartment("MINING");
		emp4.setSalary(750000);
		
		Employee emp5=new Employee();
		emp5.setFirstname("Rajdeep");
		emp5.setLastname("Das");
		emp5.setDepartment("CIVIL");
		emp5.setSalary(850000);
		
		List<Employee>list=Arrays.asList(emp1,emp2,emp3,emp4,emp5);
		 erepo.saveAll(list);
		 return "All data is saved";
	}
	@RequestMapping("/hi/{id}")
	public Employee byid(@PathVariable int id)
	{
		return erepo.findById(id);
	}
	@GetMapping("/all")
	public List<Employee> all()
	{
		return (List<Employee>) erepo.findAll();
		 
	}

}
