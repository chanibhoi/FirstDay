package org.emp;

public class Employee {

	private void empId(){
		System.out.println("09");
	}
	private void empName(){
		System.out.println("Java");
	}
	private void empDob(){
		System.out.println("05 Feb 1999");
	}
	private void empPhone(){
		System.out.println("9934567887");
	}
	private void empEmail(){
		System.out.println("java123@gmail.com");
	}
	private void empAddress(){
		System.out.println("Pune");
	}
	public static void main(String[] args){
		
		Employee emp = new Employee();
		
		emp.empId();
		emp.empName();
		emp.empDob();
		emp.empPhone();
		emp.empEmail();
		emp.empAddress();
	
	}
}
