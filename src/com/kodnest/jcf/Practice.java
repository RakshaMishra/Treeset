package com.kodnest.jcf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
public class Practice {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al.size());
	
		for(int i=0;i<5;i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("using while loop");
		int j=0;
		while(j<5)
		{
			System.out.println(al.get(j));
			j++;
		}
		System.out.println("using do while loop");
		int k=0;
		do
		{
			System.out.println(al.get(k));
			k++;
		}while(k<5);
		
		for(Object ob : al)
		{
			System.out.println(ob);
		}
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		LinkedList ll=new LinkedList();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		System.out.println("using linked list");
		for(Object ob : ll)
		{
			System.out.println(ob);
		}
		Iterator iit=ll.iterator();
		while(iit.hasNext())
		{
			System.out.print(iit.next()+" ");
		}
		
	}
}
		
	
		


