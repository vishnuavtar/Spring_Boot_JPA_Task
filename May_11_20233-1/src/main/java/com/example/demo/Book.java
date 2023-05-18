//package com.example.demo;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//import org.springframework.beans.factory.annotation.Value;
//
//@Entity
//@Table(name="Books")
//public class Book {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name="Book_Id")
//	private int bid;
//	@Override
//	public String toString() {
//		return "Book [bid=" + bid + ", title=" + title + ", getBid()=" + getBid() + ", getTitle()=" + getTitle()
//				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
//				+ "]";
//	}
//	public Book() {
//		super();
//	}
//	public Book(int bid, String title, Author author) {
//		super();
//		this.bid = bid;
//		this.title = title;
//		this.author = author;
//	}
//	public int getBid() {
//		return bid;
//	}
//	public void setBid(int bid) {
//		this.bid = bid;
//	}
//	public String getTitle() {
//		return title;
//	}
//	public void setTitle(String title) {
//		this.title = title;
//	}
//	public Author getAuthor() {
//		return author;
//	}
//	public void setAuthor(Author author) {
//		this.author = author;
//	}
//	private String title;
//	
//	@OneToOne(cascade = CascadeType.ALL)
//	private Author author;
//
//}
