package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	ArrayList<String> list = new ArrayList<String>();

	void add() {
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		System.out.println(list);
		list.remove(3);			 // removing with index
		System.out.println(list);
		list.remove("two");		 // removing with String
		System.out.println(list);
	}

	void remove() {
		ArrayList<String> li = new ArrayList<String>();
		li.add("book");
		li.add("pen");
		li.add("laptop");
		li.add("mobile");
		System.out.println(li);
		System.out.println("after deleting elements");
		li.remove(2);
		System.out.println(li);

	}

}
