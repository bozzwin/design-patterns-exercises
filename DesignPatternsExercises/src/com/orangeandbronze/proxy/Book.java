package com.orangeandbronze.proxy;


/**
 * We want to restrict access to the Book in order to log changes to its fields. 
 * Create a proxy to Book so that ever time a field is set, the field name and
 * the new value will be written to console.
 */
public class Book {
	private String title;
	private String author;
	private String publisher;

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

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String pubisher) {
		this.publisher = pubisher;
	}
}
