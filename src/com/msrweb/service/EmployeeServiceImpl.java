package com.msrweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.msrweb.dao.EmployeeDao;
import com.msrweb.model.Employee;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;
	
	public Employee findById(int id) {
		return dao.findById(id);
	}

	public void saveEmployee(Employee employee) {
		dao.saveEmployee(employee);
	}

	
	public void updateEmployee(Employee employee) {
		Employee entity = dao.findById(employee.getId());
		if(entity!=null){
			entity.setFname(employee.getFname());
			entity.setLname(employee.getLname());
			entity.setDob(employee.getDob());
			entity.setSalary(employee.getSalary());
			entity.setTotalExperiecne(employee.getTotalExperiecne());
			entity.setRole(employee.getRole());
			entity.setRManager(employee.getRManager());
			entity.setTeamlMembers(employee.getTeamlMembers());
			entity.setSsn(employee.getSsn());
		}
	}

	public void deleteEmployeeBySsn(String ssn) {
		dao.deleteEmployeeBySsn(ssn);
	}
	
	public List<Employee> findAllEmployees() {
		return dao.findAllEmployees();
	}

	public Employee findEmployeeBySsn(String ssn) {
		return dao.findEmployeeBySsn(ssn);
	}

	public boolean isEmployeeSsnUnique(Integer id, String ssn) {
		Employee employee = findEmployeeBySsn(ssn);
		return ( employee == null || ((id != null) && (employee.getId() == id)));
	}
	
}
