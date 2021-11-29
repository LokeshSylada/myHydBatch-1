package com.technoelevate.sortingconcepts;

public class Song implements Comparable<Song>{
	
	private String name;
	private String singer;
	private Integer releaseYear;
	
	public Song(String name, String singer, Integer releaseYear) {
		this.name = name;
		this.singer = singer;
		this.releaseYear = releaseYear;
	}

	@Override
	public int compareTo(Song s) {
		return this.getReleaseYear().compareTo(s.getReleaseYear());
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public Integer getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(Integer releaseYear) {
		this.releaseYear = releaseYear;
	}

	@Override
	public String toString() {
		return "Song [name=" + name + ", singer=" + singer + ", releaseYear=" + releaseYear + "]";
	}

}
