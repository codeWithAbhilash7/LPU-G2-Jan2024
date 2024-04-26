package com.collections.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapImpl {

	public static void main(String[] args) {
		// map to store population of different countries
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();

		map.put("India", 456789464);
		map.put("USA", 26789464);
		map.put("China", 434554232);
		map.put("Sri Lanka", 123463);
		map.putIfAbsent("Pakistan", 9999999);

		for (Map.Entry<String, Integer> m : map.entrySet()) {
			System.out.println(m.getKey() + " = " + m.getValue());
		}

	}

}
