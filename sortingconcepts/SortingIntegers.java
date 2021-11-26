package com.technoelevate.sortingconcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortingIntegers {

	public static void main(String[] args) {
		ArrayList myInt = new ArrayList();
		myInt.add(10);
		myInt.add(9);
		myInt.add(23);
		myInt.add(9);
		myInt.add(13);
		myInt.add(19);
		myInt.add(49);

		System.out.println("List before sorting");

		Iterator itr = myInt.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
				
		System.out.println("List after sorting");
		Collections.sort(myInt);
		Iterator myItr = myInt.iterator();
		while (myItr.hasNext()) {
			System.out.println(myItr.next());
			
		}
		

	}

}
