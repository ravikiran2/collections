package com.java.collections;

import java.util.LinkedList;

public class LinkedListExample {
LinkedList<Integer> l=new LinkedList<Integer>();
	void display()
	{
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(50);
		for(int a:l) {
			System.out.println(a);
		}
		l.remove(2);
		System.out.println(l);
	}
	
	void work()
	{
		LinkedList<String> l=new LinkedList<String>();
		l.add("write");
		l.add("number");
		l.add("enter");
		l.add("five");
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
	}
}
