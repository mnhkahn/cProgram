import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.List;
import java.util.Map.Entry;

class Wanmei {
	int removeValue(Map<Integer, Integer> mymap, int value) {
		int count = 0;
		List<Integer> list = new LinkedList<Integer>();
		Iterator<Entry<Integer, Integer>> iter = mymap.entrySet().iterator();
		Entry<Integer, Integer> entry;
		while (iter.hasNext()) {
			entry = iter.next();
			if (entry.getValue() == value) {
				list.add(entry.getKey());
			}
		}
		
		// 
		count = list.size();
		for (int i = 0; i < list.size(); i++) {
			mymap.remove(list.get(i));
		}
		
		return count;
	}
	public static void main(String argv[]) {
		Map<Integer, Integer> mymap = new HashMap<Integer, Integer>();
		mymap.put(1, 3);
		mymap.put(2, 4);
		mymap.put(3, 1);
		mymap.put(4, 3);
		System.out.println(new Wanmei().removeValue(mymap, 3));
		Iterator<Entry<Integer, Integer>> iter = mymap.entrySet().iterator();
		Entry<Integer, Integer> entry;
		while (iter.hasNext()) {
			entry = iter.next();
			System.out.println(entry);
		}
	}
}