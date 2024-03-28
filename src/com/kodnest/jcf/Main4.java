package com.kodnest.jcf;
import java.util.TreeSet;
public class Main4 {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		String s="aaaa";
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
			   String ch=s.substring(i,j);
			   ts.add(ch);
			}
		}
		System.out.println(ts);
	}
}
		
	


