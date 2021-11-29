package com.technoelevate.sortingconcepts;

import java.util.ArrayList;
import java.util.Collections;

public class MyMusicPlaylist {

	public static void main(String[] args) {
		ArrayList<Song> myPlaylist = new ArrayList<Song>();
		Song song1 = new Song("Bad Habits", "Ed Sherren", 2021);
		Song song2 = new Song("In the end", "Linkin Park", 2001);
		Song song3 = new Song("Lost in the echo", "Linkin Park", 2012);
		Song song4 = new Song("Space Bound", "Eminem", 2010);
		Song song5 = new Song("Adventure of a lifetime", "Coldplay", 2016);

		myPlaylist.add(song4);
		myPlaylist.add(song2);
		myPlaylist.add(song3);
		myPlaylist.add(song1);
		myPlaylist.add(song5);

		System.out.println("-----Before sorting-----");
		for (Song song : myPlaylist) {
			System.out.println(song);
		}

		Collections.sort(myPlaylist, new MyComparator());
		//Collections.sort(myPlaylist);
		System.out.println("-----After sorting-----");
		for (Song song : myPlaylist) {
			System.out.println(song);
		}

	}

}
