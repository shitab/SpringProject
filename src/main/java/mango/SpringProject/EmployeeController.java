/*package mango.SpringProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/helloworld")

public class EmployeeController {
	
	Employee emp = new Employee();
	
	@RequestMapping(value="/{name}", method=RequestMethod.GET, Produces="application/json")
	public @ResponseBody Employee getEmployeeInJSON(@PathVariable String name){
		emp.setName("ABC");
		emp.setEmail("abc@gmail.com");
		return emp;
	}
	
	@RequestMapping(value="/{name}.xml", method= RequestMethod.GET, Consumer="application/xml")
	public @ResponseBody Employee getEmployeeInXML(@PathVariable String name){
		emp.setName("XML");
		emp.setEmail("xml@gmail.com");
		return emp;
	}

}
*/