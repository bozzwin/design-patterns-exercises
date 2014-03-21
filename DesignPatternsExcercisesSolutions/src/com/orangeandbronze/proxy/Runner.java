package com.orangeandbronze.proxy;

public class Runner {

	public static void main(String[] args) {
		Book book = new Book();
		book = new BookProxy(book);
		book.setTitle("Harry Potter");
		book.setAuthor("JK Rowling");
		book.setPublisher("Bloomsbury Publishing");

	}

}
