package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

	void info() {
		List<String> list = new ArrayList<String>();
		list.add("hyderabad");
		list.add("banglore");
		list.add("manglore");
		list.add("kodihalli");
		list.add("hal");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) { // using while loop
			String s = it.next();
			System.out.println(s);
		}
		for (String e : list) {		//using for each
			System.out.println(e);
		}

	}
}
