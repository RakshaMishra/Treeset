package com.kodnest.jcf;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.TreeSet;
public class CollectionQues {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		ArrayList bl=new ArrayList();
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String []split1=s1.split(" ");
		String []split2=s2.split(" ");
		for(Object o1:split1)
		{
			al.add(o1);
		}
		for(Object o2:split2)
		{
			bl.add(o2);
		}
		TreeSet h=new Tree+Set();
		h.addAll(al);
		h.addAll(bl);
		System.out.println(h);
		
		
	}

}
