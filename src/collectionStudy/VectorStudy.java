package collectionStudy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) {
		Vector<String> v=new Vector<>();
		v.add("Sangli");
		v.add("Kolhapur");
		v.add("Solapur");
		v.add("Mumbai");
		v.add("Pune");
		v.add("Latur");
		v.add("Beed");
		v.add("Nagpur");
		v.add("Kolhapur");
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.println("----------------------------------------");
		System.out.println(v.contains("Beed"));
		System.out.println(v.get(2));
		System.out.println(v.elementAt(4));
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		v.insertElementAt("SambhajiNagar", 1);
		System.out.println(v);
		System.out.println("----------------------------------------");
		System.out.println(v.remove(6));
		System.out.println(v.remove("Nagpur"));
		System.out.println(v);
		// v.setSize(15);
		System.out.println("=============Traversing through vector============");
		System.out.println(v);
		System.out.println("========== for each loop ===============");
		for(String vect:v) {
			System.out.println(vect);
		}
		System.out.println("========== iterator ===============");
		Iterator<String> it = v.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("========== enumeration ===============");
		Enumeration<String> ele = v.elements();
		while(ele.hasMoreElements()) {
			System.out.println(ele.nextElement());
		}
		
	}

}




