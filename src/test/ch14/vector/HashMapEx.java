package test.ch14.vector;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
//		Map<> map = new HashMap<>();
		//HashMap<key, 객체(저장할 값)>
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("김하서", 85);
		map.put("김명현", 90);
		map.put("양준수", 80);
		map.put("노은비", 95);
		
		System.out.println("총 Entry 수: " + map.size());
		
		//키로 값 얻기
		String key = "김명현";	
		int value = map.get(key);
		System.out.println("점수: " + value);
		
	}

}
