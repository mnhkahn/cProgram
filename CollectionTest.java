import java.util.*;

public class CollectionTest {
	public static void main(String argv[]) {
		int [] arr = {1, 3, 4};
		System.out.println(arr.length);
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(0, 1);
		list.add(3);
		System.out.println(list.size());
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(2);
		set.add(3);
		System.out.println(set.size());
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 3);
		map.put(2, 4);
		System.out.println(map.size());
		
		String str = "hello world";
		System.out.println(str.length());
		
	}
}