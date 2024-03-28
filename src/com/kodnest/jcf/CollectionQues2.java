package com.kodnest.jcf;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class CollectionQues2 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		ArrayList bl=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter-1");
		String s1=sc.nextLine();
		System.out.println("Enter-2");
		String s2=sc.nextLine();
		String []split1=s1.split(" ");
		String []split2=s2.split(" ");
		for(Object o1:split1)
		{
			al.add(o1);
		}
		System.out.println(al+"???");
		for(Object o2:split2)
		{
			bl.add(o2);
		}
		System.out.println(bl+">>>");

		TreeSet ts=new TreeSet();
		for(Object ob:al)
		{
			ts.add(ob);
		}
		System.out.println(ts+"***********");
		for(Object ob1:bl)
		{
			ts.add(ob1);
		}
		System.out.println(ts+"****************");
		System.out.println(ts);
//		ts.addAll(al);
//		ts.addAll(bl);
//		System.out.println(ts);

	}
}
