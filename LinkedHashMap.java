import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;

public class LinkedHashMap {
	public static void main(String[] args) {
		LinkedHashMap ht = new LinkedHashMap();
		ht.put(10,"ABC");
		ht.put(30,"XYZ");
		ht.put(20,"abc");
		ht.put(50,"xyz");
		ht.put(50,"qwe");
		ht.put(null,"xyz");
		Set s = ht.entrySet();
		Iterator it = s.iterator();
		while(it.hasNext()){
			Map.Entry me = (Map.Entry)it.next();
			
			System.out.print(me.getKey()+ "  ");
			System.out.println(me.getValue());
			
		}
	}
}
