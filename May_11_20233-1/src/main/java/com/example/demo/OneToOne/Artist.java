//package com.example.demo.OneToOne;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToOne;
//
//@Entity
//public class Artist {
//	
//	public Artist() {
//		super();
//	}
//
//	public Artist(int artistId, String artistName, String email, Album album) {
//		super();
//		this.artistId = artistId;
//		this.artistName = artistName;
//		this.email = email;
//		this.album = album;
//	}
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name="Artist_id")
//	private int artistId;
//	private String artistName;
//	private String email;
//	
//	@OneToOne(cascade = CascadeType.ALL)
//	private Album album;
//
//	public int getArtistId() {
//		return artistId;
//	}
//
//	public void setArtistId(int artistId) {
//		this.artistId = artistId;
//	}
//
//	public String getArtistName() {
//		return artistName;
//	}
//
//	public void setArtistName(String artistName) {
//		this.artistName = artistName;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public Album getAlbum() {
//		return album;
//	}
//
//	public void setAlbum(Album album) {
//		this.album = album;
//	}
//
//	@Override
//	public String toString() {
//		return "Artist [artistId=" + artistId + ", artistName=" + artistName + ", email=" + email + ", album=" + album
//				+ ", getArtistId()=" + getArtistId() + ", getArtistName()=" + getArtistName() + ", getEmail()="
//				+ getEmail() + ", getAlbum()=" + getAlbum() + ", getClass()=" + getClass() + ", hashCode()="
//				+ hashCode() + ", toString()=" + super.toString() + "]";
//	}
//
//}
