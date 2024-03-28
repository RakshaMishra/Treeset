package com.kodnest.jcf;

class Student{
	int age;
	String name;
	public Student(int age, String name) {
		this.age=age;
		this.name=name;
	}
	
	@Override
	public String toString() {
		
		
		return "student{name:"+name+",age:"+age+"}";
	}
}

public class Main3 {
	public static void main(String[] args) {
		Student student=new Student(10, "John");
		System.out.println(student);
		Student student1=new Student(11, "raksha");
		System.out.println(student1);
	}

}
