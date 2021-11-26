package com.technoelevate.sortingconcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortingStrings {

	public static void main(String[] args) {
		
		ArrayList myPlaylist = new ArrayList();
		myPlaylist.add("Bad habits");
		myPlaylist.add("In the end");
		myPlaylist.add("Lost in the echo");
		myPlaylist.add("Space bound");
		myPlaylist.add("Adventure of a lifetime");
		
		System.out.println("Before sorting");
		Iterator itr = myPlaylist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Collections.sort(myPlaylist);
		System.out.println("------After sorting-----");
		for(Object song:myPlaylist) {
			System.out.println(song);
		}
	}

}
