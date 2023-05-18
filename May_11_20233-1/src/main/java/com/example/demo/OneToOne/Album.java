//package com.example.demo.OneToOne;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//@Entity
//public class Album {
//	
//	@Override
//	public String toString() {
//		return "Album [albumId=" + albumId + ", albumName=" + albumName + ", getAlbumId()=" + getAlbumId()
//				+ ", getAlbumName()=" + getAlbumName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
//				+ ", toString()=" + super.toString() + "]";
//	}
//	public Album() {
//		super();
//	}
//	public Album(int albumId, String albumName) {
//		super();
//		this.albumId = albumId;
//		this.albumName = albumName;
//	}
//	public int getAlbumId() {
//		return albumId;
//	}
//	public void setAlbumId(int albumId) {
//		this.albumId = albumId;
//	}
//	public String getAlbumName() {
//		return albumName;
//	}
//	public void setAlbumName(String albumName) {
//		this.albumName = albumName;
//	}
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name="Album_Id")
//	private int albumId;
//	private String albumName;
//
//}
