package com.euronet.main.domain;

public class BookDetails {
	private String title;
	private String author;
	private double price;
	private boolean isIssuable;

	public BookDetails() {
		// TODO Auto-generated constructor stub
	}

	public BookDetails(String title, String author, double price, boolean isIssuable) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.isIssuable = isIssuable;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean getIsIssuable() {
		return isIssuable;
	}

	public void setIsIssuable(boolean isIssuable) {
		this.isIssuable = isIssuable;
	}

	@Override
	public String toString() {
		return "BookDetails [title=" + title + ", author=" + author + ", price=" + price + ", isIssuable=" + isIssuable
				+ "]";
	}

}
