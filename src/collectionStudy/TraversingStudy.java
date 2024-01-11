package collectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TraversingStudy {

	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList<>();

		al.add(1);
		al.add(3);
		al.add(34);
		al.add(2);
		al.add(22);
		al.add(12);

		System.out.println(al);

		System.out.println("===========for loop===============");

		for(int i=0;i<=al.size()-1;i++)
		{

		System.out.println(al.get(i));
		}

		System.out.println("===========for each loop===============");

		for(Integer a:al)
		{

		System.out.println(a);
		}

		System.out.println("==============Iterator===================");

		Iterator<Integer> it = al.iterator();

		while(it.hasNext())
		{
		System.out.println(it.next());
		}

		System.out.println("==============List-Iterator===================");

		ListIterator<Integer> lit = al.listIterator();

		while(lit.hasNext())
		{
		System.out.println(lit.next());
		}
		System.out.println("======================Using list iterator in reverse direction==========================");

		while(lit.hasPrevious())
		{
		System.out.println(lit.previous());
		}
	}

}
