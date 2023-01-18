package com.jspiders.mplayer.songs;

public class Songs {

	private int id;
	private String name;
	private String movie_album;
	private int length;
	private String singer;
	private String composer;
	private String lyricist;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMovie_album() {
		return movie_album;
	}

	public void setMovie_album(String movie_album) {
		this.movie_album = movie_album;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getLyricist() {
		return lyricist;
	}

	public void setLyricist(String lyricist) {
		this.lyricist = lyricist;
	}

	@Override
	public String toString() {
		return "Songs [id=" + id + ", name=" + name + ", movie_album=" + movie_album + ", length=" + length
				+ ", singer=" + singer + ", composer=" + composer + ", lyricist=" + lyricist + "]";
	}
	

	
}
