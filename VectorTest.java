import java.util.Vector;
import java.util.Enumeration;
import java.util.Iterator;
class VectorTest{
	public static void main(String[] args){
		Vector al = new Vector();
		//al.add(10);
		//al.add(10);
		al.addElement(35);
		al.addElement(25);
		al.addElement(35);
		//al.add(20);
		
	//	al.add(30);
		//al.add(15);
		Enumeration e = al.elements();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
		
//		Iterator i = al.iterator();
//		while(i.hasNext()){
//			System.out.println(i.next());
		}
	}

