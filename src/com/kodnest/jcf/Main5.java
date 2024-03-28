package com.kodnest.jcf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main5 {
	public static void main(String[] args) {
		CopyOnWriteArrayList al = new CopyOnWriteArrayList();
//		LinkedList ll = new LinkedList();
		al.add(20);
		al.add(30);
		al.add(40);
//		for(int i=0;i<al.size();i++) {
//			System.out.println(al.get(i));
//			al.add(99);
			
//		}
//		int i=0;
//		while(i<al.size()) {
//			System.out.println(al.get(i));
//			i++;
//			al.add(99);
//		}
//		int i=0;
//		for(Object o:al) {
//			System.out.println(o);
//			al.add(99);
//		}
		
		Iterator it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			al.add(99);
		
		
		
		}
		System.out.println(al);
	}

}
