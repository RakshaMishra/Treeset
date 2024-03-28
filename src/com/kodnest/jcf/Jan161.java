package com.kodnest.jcf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student
{  
	String name;
    int id;
	public Student(int id,String name)
	{  super();
		this.name=name;
		this.id=id;
	}
	
	public String toString()
	{
		return id+"-"+name;
	}

	
	
}




public class Jan161 {
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
		Collections.sort(al,new Comparator<Student>()
		{

			@Override
			public int compare(Student o1, Student o2) {
				 if(o1.id>o2.id)
				    {
				    	return 1;
				    }
				    else if(o1.id<o2.id)
				    {
				    	return -1;
				    }
				return 0;
			}
			
		});
		System.out.println(al);
	}

}
