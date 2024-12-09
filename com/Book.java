package com;

public class Book {

	private String bookTittle;
	private int bookId;
	private String bookAuthor;
	private int bookCost;
	private int noOfPages;
	
	public Book() {}

	public Book(String bookTittle, int bookId, String bookAuthor, int bookCost, int noOfPages) {
		this.bookTittle = bookTittle;
		this.bookId = bookId;
		this.bookAuthor = bookAuthor;
		this.bookCost = bookCost;
		this.noOfPages = noOfPages;
	}

	public String getBookTittle() {
		return bookTittle;
	}

	public void setBookTittle(String bookTittle) {
		this.bookTittle = bookTittle;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public int getBookCost() {
		return bookCost;
	}

	public void setBookCost(int bookCost) {
		this.bookCost = bookCost;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	
	public void displayBooks()
	{
		System.out.println("Tittle:"+getBookTittle());
		System.out.println("Author:"+getBookAuthor());
		System.out.println("Cost:"+getBookCost());
		System.out.println("Id:"+getBookId());
		System.out.println("NoOfpages:"+getNoOfPages());
		System.out.println("---------------------------------------");
		
	}

	@Override
	public String toString() {
		return "\n bookTittle=" + bookTittle + "\n  bookId=" + bookId + "\n  bookAuthor=" + bookAuthor + "\n  bookCost="
				+ bookCost + "\n  noOfPages=" + noOfPages + "\n ----------------------------------------------";
	}
	
	
	
	
}
