package com.technoelevate.alltest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class OopsInCollection {

	public static void main(String[] args) {

		//List myList = new ArrayList();
		List myList = new LinkedList();
		//List myList = new Vector();
		
		
		myList.add("Jeigyanshu");
		myList.add("Anshu");
		myList.add("Jiggy");
		myList.toString();
		Iterator itr = myList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().toString());
		};
	}

}
