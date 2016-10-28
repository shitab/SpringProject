package mango.SpringProject;


public class Employee {
	
	String name;
	String email;
	
	public Employee(){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + "]";
	}
	

}
