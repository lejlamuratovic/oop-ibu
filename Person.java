package lab9;

public class Person {
	private String name; 
	private int age; 
	
	public Person(String name, int age) {
		if(name == null || name.equals("") || (name.length() > 40)) {
			throw new IllegalArgumentException("The name is not valid");
		}
		
		if(age < 0 || age > 120) {
			throw new IllegalArgumentException("The age is not valid");
		}
		
		this.name = name; 
		this.age = age; 
	}
}
