package com.satish.Lab6;

public class Book {
	private int id;
	private String name;
	private String authoer;
	private int Price;
	private String publications;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Book(int id, String name, String authoer, int price, String publications) {
		super();
		this.id = id;
		this.name = name;
		this.authoer = authoer;
		this.Price = price;
		this.publications = publications;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthoer() {
		return authoer;
	}
	public void setAuthoer(String authoer) {
		this.authoer = authoer;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int Price) {
		this.Price = Price;
	}
	public String getPublications() {
		return publications;
	}
	public void setPublications(String publications) {
		this.publications = publications;
	}
	
	
	
}
