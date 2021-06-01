package ie.ucdconnect.distLib.models;

import org.springframework.data.annotation.Id;

public class Book {
	@Id
	public int id;
	public String title;
	public String author;

	public static Book createTestBook(int id, String title, String author) {
		return new Book(id, title, author);
	}

	private Book(int id, String title, String author) {
		this.id = id;
		this.title = title;
		this.author = author;
	}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	
}