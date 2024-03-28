package com.kodnest.jcf;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;
public class CollectionQues4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Store s1=new Store(sc.nextInt(),sc.nextLine());
		Store s2=new Store(sc.nextInt(),sc.nextLine());
		Store s3=new Store(sc.nextInt(),sc.nextLine());
		Store s4=new Store(sc.nextInt(),sc.nextLine());
		ArrayList<Store> al=new ArrayList<Store>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		System.out.println(al);
	Collections.sort(al);
		
		
	}

}

class Store implements Comparable <Store>
{   int marks;
    String name;
	public Store(int marks,String name)
	{
		this.marks=marks;
		this.name=name;
	}
	public String toString()
	{
		return marks+"-"+name;
	}
	@Override
	public int compareTo(Store o) {
		if(this.marks>o.marks)
		{
			return 1;
		}
		else if(this.marks<o.marks)
		{
			return -1;
		}
		return 0;
	}
	
}