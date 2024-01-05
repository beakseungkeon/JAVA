package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String>map=new HashMap<String, String>();
		/*
		 * put(k,v):k와 v값을 이용해서 추가,k가 중복되면 v만 수정하고 이전 v값 리턴
		 */
		map.put("abc", "def");
		String prev=map.put("abc", "xyz");
		System.out.println(map);
		System.out.println(prev);
		
		String str=map.get("abc");
		System.out.println(str);
		/*
		 * containskey(k) k 와 일치하는 key가 있는지 알려줌
		 */
		System.out.println(map.containsKey("abc"));
		//remove(k) k와 일치하는 요소를 삭제 후 value 리턴
		str=map.remove("abc");
		System.out.println(str);
		
		map.put("zxc", "123");
		map.put("hello", "hi");
		
		Set<String>keySet=map.keySet();
		Iterator<String> it=keySet.iterator();
		while(it.hasNext()) {
			String value=it.next();
			System.out.println(value);
		}
	}

}
