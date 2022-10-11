package com.euronet.main.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BookDetails {
	private int bookCode;
	private String title;
	private String author;
	private double price;
	private boolean isIssuable;

	public BookDetails() {
		System.out.println("Default Constructor Of BookDetails()");
	}

	public BookDetails(int bookCode, String title, String author, double price, boolean isIssuable) {
		System.out.println("Parameterized Constrcutor Of BookDetails()");
		this.bookCode = bookCode;
		this.title = title;
		this.author = author;
		this.price = price;
		this.isIssuable = isIssuable;
	}

	public int getBookCode() {
		System.out.println("getBookCode()");
		return bookCode;
	}

	public void setBookCode(int bookCode) {
		System.out.println("setBookCode " + bookCode);
		this.bookCode = bookCode;
	}

	public String getTitle() {
		System.out.println("getTitle()");
		return title;
	}

	public void setTitle(String title) {
		System.out.println("setTitle() " + title);
		this.title = title;
	}

	public String getAuthor() {
		System.out.println("getAuthor()");
		return author;
	}

	public void setAuthor(String author) {
		System.out.println("setAuthor() " + author);
		this.author = author;
	}

	public double getPrice() {
		System.out.println("getPrice()");
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setPrice() " + price);
		this.price = price;
	}

	public boolean getIsIssuable() {
		System.out.println("isIssuable()");
		return isIssuable;
	}

	public void setIsIssuable(boolean isIssuable) {
		System.out.println("setIssuable() " + isIssuable);
		this.isIssuable = isIssuable;
	}

	@Override
	public String toString() {
		return "BookDetails [bookCode=" + bookCode + ", title=" + title + ", author=" + author + ", price=" + price
				+ ", isIssuable=" + isIssuable + "]";
	}

}
