package com.kodnest.jcf;

import java.util.Hashtable;
import java.util.Properties;
import java.util.Stack;
import java.util.Vector;

public class Legacy {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.add(20);
		s.add(30);
		System.out.println(s);
		
		Vector v = new Vector();
		v.add(20);
		v.add(30);
		System.out.println(v);
		
		Hashtable h = new Hashtable();
		h.put(1,10);
		h.put(3,40);
		System.out.println(h);
		
		Properties p = new Properties();
		p.put(3,10);
		p.put(2, 10);
		System.out.println(p);
		
		
		
//		Stack
//		vector
//		Hashtable
//		Properties
//		Enumeration
//		Dictionary
	}

}
