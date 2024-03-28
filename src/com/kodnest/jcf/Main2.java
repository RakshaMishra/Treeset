package com.kodnest.jcf;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Collections;

public class Main2 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(30);
		al.add(50);
		
		al.add(50);
		System.out.println(al);
//		TreeSet ts=new TreeSet(al);
		Collections.sort(al);
//		System.out.println(ts);
		System.out.println(al);
	}

}
