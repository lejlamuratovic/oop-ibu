package week6;

import java.util.*; 

public class Library {
	private ArrayList<Book> books;

	public Library() {
		this.books = new ArrayList<>(); //by instansiating we create an empty list
	}
	
	public void addBook(Book newBook) {
		this.books.add(newBook);
	}
	
	public void printBooks() {
		for(Book book : this.books) {
			System.out.println(book);
		}
	}
	
	public ArrayList<Book> searchByTitle(String searchedTitle) {
		ArrayList<Book> found = new ArrayList<Book>();
		for(Book book : this.books) {
			if(StringUtils.included(book.title(), searchedTitle)) {
				found.add(book);
			}
		}
	    return found;
	}
	
	public ArrayList<Book> searchByPublisher(String publisher) {
		ArrayList<Book> found = new ArrayList<Book>();
		for(Book book : this.books) {
			if(StringUtils.included(book.title(), publisher)) {
				found.add(book);
			}
		}
	    return found;
	}
	
	public ArrayList<Book> searchByYear(int year) {
		ArrayList<Book> found = new ArrayList<Book>();
		for(Book book : this.books) {
			if(year == book.year()) {
				found.add(book);
			}
		}
	    return found;
	}

	
}
