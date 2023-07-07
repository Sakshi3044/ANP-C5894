// Example of single inheritance

package oops;

public class AM 
{
	
	 String name;
	 int age;
	 
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

class Dg extends AM
{
	String breed;
	

public String getBreed() {
		return breed;
	}


	public void setBreed(String breed) {
		this.breed = breed;
	}
}


class AMmain

{
	public static void main(String[] args)
	{
		//Creating instance of class AM
		Dg e = new Dg();
		
		//Setting values
		e.setName("Puppy");
		e.setAge(10);
		e.setBreed("Aficans");
	
		
		//Print values
		System.out.println("Name is:" + e.getName());
		System.out.println("Age is:" + e.getAge());
		System.out.println("Breed is:" + e.getBreed());
}
}





