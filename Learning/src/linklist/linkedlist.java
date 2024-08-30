package linklist;

import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> name = new LinkedList<String>();
		name.add("rajuu");
		name.add("uday");
		name.add("mihir");
		name.add("jay");
		name.add("sivaa");
		name.addFirst("vraj");
		name.addLast("Raj");
		System.out.println(name);
		System.out.println(name.getFirst());
		System.out.println(name.getLast());
		
	}

}
