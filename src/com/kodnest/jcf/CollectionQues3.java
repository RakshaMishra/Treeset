package com.kodnest.jcf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;
public class CollectionQues3 {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		String s="apple banana cheery banana orange";
		String []s1=s.split(" ");
		for(Object ob:s1)
		{
			hs.add(ob);
		}
	
//		ArrayList al=new ArrayList();
//		al.addAll(hs);
//		Collections.sort(al);
//		System.out.println(al);
		TreeSet ts=new TreeSet();
		ts.addAll(hs);
		System.out.println(ts);
	}

}
