package test.ch14.vector;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
//		Map<> map = new HashMap<>();
		//HashMap<key, 객체(저장할 값)>
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("김하서", 85);
		map.put("김명현", 90);
		map.put("양준수", 80);
		map.put("노은비", 95);
		map.put("노은비", 90); //키는 하나여야 한다.
		
		System.out.println("총 Entry 수: " + map.size());
		
		//키로 값 얻기
		String key = "김명현";	
		int value = map.get(key);
		System.out.println("점수: " + value);
		System.out.println();
		
		//반복해서 키와 값을 얻기 첫번째 방법
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator(); //반복된 키를 얻는다. 
		
		while (keyIterator.hasNext()) { //다음 키가 있는지 찾는다.
			String k = keyIterator.next();
			Integer v = map.get(k);
			System.out.println(k + ":" + v); 
		}
		
		System.out.println();
		
		//반복해서 키와 값을 얻기 두번째 방법
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator(); //반복된 키를 얻는다.
		
		while (entryIterator.hasNext()) { //다음 키가 있는지 찾는다.
			Entry<String, Integer> entry = entryIterator.next();
			String k = entry.getKey(); //키를 가져옴
			Integer v = entry.getValue(); //값을 가져옴
			System.out.println(k + ":" + v); 
		}
		
		
		
	}

}
