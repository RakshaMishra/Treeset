package com.kodnest.jcf;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Hash {
	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(40);
		h.add(50);
		System.out.println(h);
		
		LinkedHashSet lh =new LinkedHashSet();
		lh.add(1);
		lh.add(2);
		lh.add(3);
		lh.add(4);
		lh.add(5);
		System.out.println(lh);
	}

}
