	package oops;
	
	public class Person 
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
	
	class PersonMain
	
	{
		public static void main(String[] args)
		{
			//Creating instance of class Person
			Person e =new Person();
			
			//Setting values
			e.setName("Sakshi");
			e.setAge(20);
			
			//Print values
			System.out.println("Name is:" + e.getName());
			System.out.println("Age is:" + e.getAge());
	}
	}
