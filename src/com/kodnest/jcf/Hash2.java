package com.kodnest.jcf;
import java.util.LinkedHashMap;
import java.util.List;
public class Hash2 {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> h=new LinkedHashMap<Integer,String>();
		h.put(1, "java");
		h.put(5, "HTML");
		h.put(3, "CSS");
		h.put(7, "JS");
		System.out.println(h);
	/*	for(Object ob: h)
		{
			System.out.println(ob);
		}
		Iterator it=h.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		*/
		for(int i=0;i<h.size();i++)
		{
			System.out.println(h.get(i));
		}
		
	}

}
