package oops;

public class Person1 
{
	 private String name;
	 private int age;
	 
		public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	}


 class Employe extends Person1
 {
	 int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
 }
 
  
 class Manager extends Employe
 {
	 String department;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
 }
 
 
 class Person1Main

 {
 	public static void main(String[] args)
 	{
 		//Creating instance of class Person1
 		Manager e = new Manager();
 		
 		//Setting values
 		e.setName("Sakshi");
		e.setAge(20);
 		e.setSalary (30000);
 		e.setDepartment("cashier");
 		
 		//Print values
 		System.out.println("Name is:" + e.getName());
 		System.out.println("Age is:" + e.getAge());
 		System.out.println("Salary is:" + e.getSalary());
 		System.out.println("Department is:" + e.getDepartment());
 }
 }
 
