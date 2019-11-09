package com.lti;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="mycd")
public class CD extends Item {

	float totalDuration;
	String musicCompany;
	String genre;
	public float getTotalDuration() {
		return totalDuration;
	}
	public CD() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CD(float totalDuration, String musicCompany, String genre) {
		super();
		this.totalDuration = totalDuration;
		this.musicCompany = musicCompany;
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "CD [totalDuration=" + totalDuration + ", musicCompany=" + musicCompany + ", genre=" + genre + "]";
	}
	public void setTotalDuration(float totalDuration) {
		this.totalDuration = totalDuration;
	}
	public String getMusicCompany() {
		return musicCompany;
	}
	public void setMusicCompany(String musicCompany) {
		this.musicCompany = musicCompany;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
}
