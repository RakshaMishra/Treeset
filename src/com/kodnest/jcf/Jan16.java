package com.kodnest.jcf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
 class Student implements Comparable<Student>{
	 int id;
	 String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override 
	public String toString()
	{
		return id+"-"+name;
	}
	@Override
	public int compareTo(Student o) {
	    if(this.name.compareTo(o.name)<0)
	    {
	    	return 1;
	    }
	    else if(this.name.compareTo(o.name)>0)
	    {
	    	return -1;
	    }
		return 0;
	
	}
	
	 
	
}





public class Jan16 {
	public static void main(String[] args) {
		Student s1=new Student(44,"john");
		Student s2=new Student(35,"raksha");
		Student s3=new Student(56,"doe");
		Student s4=new Student(88,"aditi");
		Student s5=new Student(98,"joseph");
		ArrayList<Student> al=new ArrayList();
		al.add(s1);
		al.add(s2);
		
		al.add(s3);
		
		al.add(s4);
		
		al.add(s5);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
		
		
	}

}
