import java.util.Stack;
import java.util.Iterator;
class Stacktest{
	public static void main(String[] args){
		Stack al = new Stack();
		al.add(10);
		al.push(59);
		al.add(10);
		al.add(20);
		al.pop();
		al.add(30);
		al.add(15);
	//	System.out.print("THe Top most element in stack is: ");
		//peak(al);
		Iterator i = al.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}
}