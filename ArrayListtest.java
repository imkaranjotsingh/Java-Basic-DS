import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListtest {
	
	public static void main(String[] arg){
		ArrayList al = new ArrayList();
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