package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		
		// Map : key-vaule 형식으로 저장하는 객체
		// HashMap<K,V>
		// 참조 :V get(key)
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		// 요소 추가 : put(T e)
		map.put(new Integer(1), "일번");
		map.put(2, "이번");
		map.put(3, "삼번");
		
		// 참조 :V get(key)
		System.out.println("1번 학생의 이름 : "+ map.get(1));
		System.out.println("2번 학생의 이름 : "+ map.get(new Integer(2)));
		System.out.println("3번 학생의 이름 : "+ map.get(3));
		
		// Set<Key Type>
		Set<Integer> set = map.keySet();
		Iterator<Integer> itr = set.iterator();
		
		while(itr.hasNext()) {
			int key = itr.next();
			System.out.println(key+"번 학생의 이름은 "+map.get(key)); 
			//itr.next()를 두번 넣게되면 아래로 내려가서 서로 다른 정보가 출력됨
			
		}
		
	}

}
