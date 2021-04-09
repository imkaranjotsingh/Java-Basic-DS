//package Collection;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSettest {
	public static void main(String[] args) {
		LinkedHashSet ht = new LinkedHashSet();
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
