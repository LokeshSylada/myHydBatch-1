package com.technoelevate.sortingconcepts;

import java.util.Comparator;

public class MyComparator implements Comparator<Song> {

	
	@Override
	public int compare(Song s1, Song s2) {
		
		if(s1.getSinger().charAt(0)>s2.getSinger().charAt(0)) {
			return +1;
		}else if (s1.getSinger().charAt(0)<s2.getSinger().charAt(0)) {
			return -1;
		}else return 0;
	}

}
