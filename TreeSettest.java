//package Collection;

import java.util.TreeSet;
import java.util.Iterator;

public class TreeSettest {
	public static void main(String[] args) {
		TreeSet ht = new TreeSet();
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
