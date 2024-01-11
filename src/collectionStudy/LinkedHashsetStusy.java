package collectionStudy;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetStusy {

	public static void main(String[] args) {
	LinkedHashSet <String> lh=new LinkedHashSet<>();
	lh.add("Akshay");
	lh.add("Anup");
	lh.add("Priya");
	lh.add("Sapana");
	lh.add("Akshay");
	System.out.println(lh);
	System.out.println("==================================================");
	//for each loop
	for(String l:lh) {
		System.out.println(l);
		
	}
	
	//iterator
	System.out.println("==================================================");
	Iterator<String> it = lh.iterator();	
	while(it.hasNext()) {
		System.out.println(it.next());
		
		}

	
	}
}
