import java.util.LinkedList;
import java.util.Iterator;
public class LinkedListtest {
	
	public static void main(String[] arg){
		LinkedList<Integer> al = new LinkedList<Integer>();
		al.add(10);
		al.add(20);
		al.add(5);
		al.add(30);
		Iterator it = al.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}