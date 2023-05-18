package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Value;

@Entity
@Table(name = "Artist")
public class Artist {

	
	public Artist() {
		super();
	}
	public Artist(int artistId, String artistName, String email) {
		super();
		this.artistId = artistId;
		this.artistName = artistName;
		this.email = email;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Artist Id")
	private int artistId;
	@Column(name = "Artist Name")
	private String artistName;
	@Column(name = "Artist Email")
	private String email;
	public int getArtistId() {
		return artistId;
	}
	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Artist [artistId=" + artistId + ", artistName=" + artistName + ", email=" + email + ", getArtistId()="
				+ getArtistId() + ", getArtistName()=" + getArtistName() + ", getEmail()=" + getEmail()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
