package collectionStudy;

import java.util.LinkedList;

public class LinkedListStudy {

	public static void main(String[] args) {
		LinkedList<Character> ll=new LinkedList<>();
		ll.add('A');
		ll.add(1, 'B');
		ll.add('C');
		ll.add('D');
		ll.add('E');
		ll.add(null);
		ll.add(null);
		ll.add('A');
		ll.add('C');
		System.out.println(ll);
		ll.addFirst('P');
		ll.addLast('Z');
		System.out.println(ll);
		System.out.println(ll.contains('Z'));
		System.out.println(ll.element());
		System.out.println(ll);
		System.out.println("===========================================");
	System.out.println(ll.clone());
	
	

	/*	LinkedList<Character> ll= new LinkedList<>();
		System.out.println(ll);
		ll.add('A');
		ll.add('B');
		ll.add('C');
		ll.add('D');
		ll.add('E');
		ll.add('A');
		ll.add('B');
		ll.add(null);
		ll.add(null);
		System.out.println(ll);
		ll.addFirst('M');
		ll.addLast('Z');
		System.out.println(ll);
		System.out.println(ll.contains('Z'));
		System.out.println(ll.element());
		System.out.println(ll);
		System.out.println(ll.peek());
		System.out.println(ll.poll());
		System.out.println(ll);
		System.out.println(ll.get(0));
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());

		ll.offer('X');
		System.out.println(ll);
		System.out.println(ll.offerFirst('L'));
		ll.offerLast('J');
		System.out.println(ll);*/
	}

}
