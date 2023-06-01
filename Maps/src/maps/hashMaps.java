package maps;

import java.util.HashMap;

public class hashMaps {

	public static void main(String[] args) {
		HashMap hq= new HashMap<>();
		hq.put(12, 's');
		hq.put(true, 3.6);
		hq.put('D', 'R');
		hq.put("OK", false);
		System.out.println(hq);
		System.out.println(hq.containsValue("OK"));
		System.out.println(hq.entrySet());
		
		
	}
}
