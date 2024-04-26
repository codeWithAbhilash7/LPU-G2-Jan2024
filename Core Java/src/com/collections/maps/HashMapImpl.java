package com.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapImpl {

	public static void main(String[] args) {
		// map to store population of different countries
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("India", 456789464);
		map.put("USA", 26789464);
		map.put("China", 434554232);
		map.put("Sri Lanka", 123463);
		map.putIfAbsent("Pakistan", 9999999);

		// access values using keys
		// System.out.println(map.get("India"));

//		parsing
//		for (String country : map.keySet()) {
//			System.out.println(country + " = " + map.get(country));
//		}

		for (Map.Entry<String, Integer> m : map.entrySet()) {
			System.out.println(m.getKey() + " = " + m.getValue());
		}

//		System.out.println("contains key = " + map.containsKey("India"));
//		System.out.println("contains key = " + map.containsValue(565));

//		System.out.println("removed = " + map.remove("Pakistan"));

		map.clear();
		System.out.println(map);
	}

}
