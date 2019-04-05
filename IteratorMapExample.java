package com.java.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IteratorMapExample {

	void information() {
		Map<Integer, String> user = new HashMap<>();
		user.put(2, "ravi kiran");
		user.put(1, "koti");
		user.put(4, "uma");
		user.put(3, "ravi");
		String s = user.get(2); // using key
		System.out.println(s);
		String q = user.get(1);
		System.out.println(q);
	}

	void placesinfo() {
		Map<Integer, String> user = new HashMap<>();
		user.put(2, "hyderabad");
		user.put(1, "banglore");
		user.put(4, "chennai");
		user.put(3, "mumbai");
		for (Map.Entry en : user.entrySet()) { // taken as each set
			Integer o = (Integer) en.getKey();
			String y = (String) en.getValue();
			System.out.println(o + " " + y);
		}

	}

	void studentdetails() {
		Map<Integer, String> learn = new HashMap<>();
		learn.put(33, "ramu");
		learn.put(46, "ravi"); // taken keySet in for loop
		learn.put(23, "raj");
		learn.put(76, "kiran");
		for (Integer t : learn.keySet()) {
			String e = learn.get(t);
			System.out.println("students " + t + " and " + e);
		}
	}

	void office() {
		Map<Integer, String> off = new HashMap<>();
		off.put(01, "laptop");
		off.put(02, "internet");
		off.put(03, "learn"); // iterator
		off.put(04, "things");
		Set<Integer> r = off.keySet();
		Iterator d = r.iterator();
		while (d.hasNext()) {
			Integer s = (Integer) d.next();
			String t = off.get(s);
			System.out.println(s + " " + t);
		}
	}

	void shop() {
		Map<Integer, String> shopping = new HashMap<>();
		shopping.put(2, "material");
		shopping.put(5, "style");
		shopping.put(1, "owner");
		Set<Integer> keys = shopping.keySet();
		for (Integer f : keys) {
			String s = shopping.get(f);
			System.out.println(f + " " + s);
		}
	}

}