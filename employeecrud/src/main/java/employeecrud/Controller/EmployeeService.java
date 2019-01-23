package employeecrud.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	Employee e;
	List<Employee> employeeList = new ArrayList<Employee>(Arrays.asList(
			new Employee("MJ","Mrudula","engineer"),
			new Employee("RP","Rupesh","engineer"),
			new Employee("SPJ","Sulbha","manager"),
			new Employee("UP","Usha","manager"),
			new Employee("RS","Rupali","clark"),
			new Employee("TS","Tanu","trainee")
			));
	
	public List<Employee> getAllEmployee(){
		return employeeList;
	}
	
	public Employee getEmployee(String id){
		
		employeeList.forEach(emp->{
			if(emp.getId().compareTo(id)==0) {
			e = emp; 
		}});
		
			return e;
		}
	
	public void createEmployee(Employee e) {
		employeeList.add(e);
	}
	
	public void updateEmployee(Employee employee, String id) {
		for (int i = 0; i < employeeList.size(); i++) {
			if(employeeList.get(i).getId().equals(id)) {
				employeeList.set(i, employee);
			}
		}
	}
	
	public void deleteEmployee(String id) {
		employeeList.removeIf(f->f.getId().equals(id));	
	}
}

