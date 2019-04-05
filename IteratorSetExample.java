package com.java.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorSetExample {
	void info() {
		Set<String> details = new HashSet<String>();
		details.add("book");
		details.add("pen");
		details.add("notes");
		details.add("classroom");
		Iterator<String> it = details.iterator();
		for (String y : details) {
			System.out.println(y);
		}
		System.out.println("---------------------");
	}

	void shop() {
		Set<Integer> numbers = new HashSet<Integer>();
		numbers.add(100);
		numbers.add(200);
		numbers.add(300);
		numbers.add(400);
		numbers.add(500);
		Iterator<Integer> it = numbers.iterator();
		while(it.hasNext()) {
			int u=it.next();
			System.out.println(u);
		}
	}
}
