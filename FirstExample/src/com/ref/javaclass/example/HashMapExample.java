package com.ref.javaclass.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapExample {

	public HashMapExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception {
		
		
		
		
		
		Map<Integer, String> empMap = new HashMap<>();
		empMap.put(1, "Mathan");
		empMap.put(2, "Mathan");
		empMap.put(3, "Mathan");
		empMap.put(4, "Mathan");
		empMap.put(5, "Mathan");

		for (Map.Entry<Integer, String> entry : empMap.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println("key: " + key + ", Value: " + val);

		}

		for (Integer key : empMap.keySet()) {
			System.out.println("key: " + key + ", Value: " + empMap.get(key));

		}
		System.out.println(empMap.containsKey(6));
		System.out.println(empMap.containsKey(1));
		System.out.println(empMap.containsValue("Mathan"));
		System.out.println(empMap.containsValue("Ramadoss"));

		List<String> list = new ArrayList<>();
		list.add("ancd");
		list.add("yest");

		for (String string : list) {
			System.out.println(string);
		}

		list.stream().filter((str) -> {
			return str.startsWith("a");
		}).forEach((str) -> {
			System.out.println(str);
		});
		abcd();
	}

	private static void abcd() throws Exception{
		try {
			//code
		} catch(Exception e) {
			System.out.println(e);
			throw e;
		} finally {
			
		}
	}

}
