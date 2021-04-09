//package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSettest {
	public static void main(String[] args) {
		HashSet ht = new HashSet();
		ht.add(10);
		ht.add(30);
		ht.add(20);
		ht.add(50);
		Iterator it = ht.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}

