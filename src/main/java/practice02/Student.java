package practice02;

public class Student extends Person{
	
	private String klass;
	public Student(String name, int age, String klass) {
		super(name, age);
		this.klass = klass;
		// TODO Auto-generated constructor stub
	}
	public String introduce() {
		return " I am a Student. I am at Class "+ klass;
		
	}
}
