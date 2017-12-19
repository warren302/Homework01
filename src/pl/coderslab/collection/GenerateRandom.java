package pl.coderslab.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GenerateRandom {

	
	
	public static Map<Integer, Integer> checkRand(int amount, int interval) {
		Random random = new Random();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < amount; i++ ) {
			int a = random.nextInt(interval);
			if (map.containsKey(a)) {  
				map.put(a, map.get(a)+1);
			} else {
				map.put(a, 1);
			} 
		}
		return map;
	}
	
}
