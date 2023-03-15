package PracticeQuestionarres.LinkedList;

import java.util.LinkedList;

public class LLBasic {
public static void main(String[] args) {
	LinkedList<String> ll=new LinkedList<>();
	ll.add("A");
	ll.add("B");
	ll.addLast("C");
	ll.addFirst("D");
	ll.add(2,"F");
	System.out.println(ll);
	 ll.remove("B");
     ll.remove(3);
     ll.removeFirst();
     ll.removeLast();
 	System.out.println(ll);

}
}
