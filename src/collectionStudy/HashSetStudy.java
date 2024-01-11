package collectionStudy;

import java.util.HashSet;
import java.util.Iterator;


public class HashSetStudy {

	public static void main(String[] args) {
	HashSet<Object> hs=new HashSet<>();
	hs.add("hi");
	hs.add('A');
	hs.add(12.5f);
	hs.add(4);
	hs.add("Null");
	hs.add("True");
	hs.add("Null");
	System.out.println("Hashset is "+hs);
	
	HashSet<String> hss= new HashSet<>();
	
	hss.add("Pune");
	hss.add("Sangli");
	hss.add("Delhi");
	hss.add("Kolhapur");
	hss.add("Nagpur");
	hss.add("Pune");
	System.out.println("String Hashset "+hss);
	//Random value taking in Hashset
	
	boolean cont = hss.contains("Pune");
	
	System.out.println("===================================================");
	
	System.out.println(cont);
	//for each,iterator
	
for(Object p:hss)
{
	System.out.println(p);
}
System.out.println("===========================================");
Iterator<String> it = hss.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	

	}

}
