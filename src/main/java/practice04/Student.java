package practice04;

import practice02.Person;

public class Student extends Person{
	
	private int klass;
	public Student(String name, int age, int klass) {
		super(name, age);
		this.klass = klass;
		// TODO Auto-generated constructor stub
	}
	
	public int getKlass() {
		return klass;
	}

	public void setKlass(int klass) {
		this.klass = klass;
	}

	public String introduce() {
		return super.introduce()+" "+"I am a Student. I am at Class "+ klass + ".";
		
	}
}
