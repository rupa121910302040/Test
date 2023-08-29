package ems;

public class Employee_Access {

	public static void main(String[] args) {
		//Creating Employee Object(instance) here 
		Employee emp=new Employee();
		
//		set the values
		emp.setEid(40);
		emp.setEname("dhanu");
		emp.setEsalary(899.3343f);
		emp.setEdept("IT");
		
//		get the values
		System.out.println(emp.getEid());
		System.out.println(emp.getEname());
		System.out.println(emp.getEsalary());
		System.out.println(emp.getEdept());
	}

}