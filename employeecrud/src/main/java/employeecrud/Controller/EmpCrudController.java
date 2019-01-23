package employeecrud.Controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;;

@RestController
public class EmpCrudController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("/employee")
	public List<Employee> getAllEmployee()
	{
		return employeeService.getAllEmployee();
	}
	
	
	  @RequestMapping("/employee/{id}") 
	  public Employee getEmployee(@PathVariable String id) {
		  return employeeService.getEmployee(id);
	  }
	  
	 @RequestMapping(method=RequestMethod.POST,value="/employee") 
	 public void createEmployee(@RequestBody Employee e) {
		 employeeService.createEmployee(e);
	  }
	  
	  @RequestMapping(method=RequestMethod.PUT,value="/employee/{id}") 
	  public void updateEmployee(@RequestBody Employee e,@PathVariable String id) {
		  employeeService.updateEmployee(e, id);
	  }
	  
	  @RequestMapping(method=RequestMethod.DELETE,value="/employee/{id}") 
	  public void deleteEmployee(@PathVariable String id) {
		  employeeService.deleteEmployee(id);
	 }
}
