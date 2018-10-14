package co.edureka.model;

// Bean or Object or Model
// Getters and Setters Mandatory for <jsp:useBean> Tag
public class Book {
	
	String isbn;
	String name;
	String author;
	
	public Book() {
	
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}
