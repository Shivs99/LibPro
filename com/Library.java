package com;

import java.util.ArrayList;
import java.util.Iterator;

public class Library {

	private Book b;
	private ArrayList<Book> book = new ArrayList<Book>();

	// addBook
	public void addBook(Book b) {
		book.add(b);
		System.out.println("Book Addedd Successfully..");
	}

	// showBooks
	public void showBooks() {
		if (book.isEmpty()) {
			System.out.println("Books are Not Yet Addedd..");
		} else {
			for (Book b : book) {
				b.displayBooks();
			}
		}
	}

	// searchBookBasedOnId
	public void searchBookById(int id) {
		boolean isFound = false;
		if (book.isEmpty()) {
			System.out.println("No Books Are Addedd");
		} else {
			for (Book b : book) {
				if (b.getBookId() == id) {
					System.out.println("Book Found..." + b.getBookTittle());
					isFound = true;
				}
			}
		}
		if (isFound == false) {
			System.out.println("Given Id is Invalid,,,No Book Found....");
		}

	}

	// Search Book Based On Author
	public void searchBookByAuthor(String author) {
		boolean isFound = false;
		if (book.isEmpty()) {
			System.out.println("No Books are Addedd");
		} else {
			for (Book b : book) {
				if (b.getBookAuthor().equals(author)) {
					System.out.println("Book Found..." + b.getBookTittle() + " Written By " + b.getBookAuthor());
					isFound = true;

				}
			}
		}
		if (isFound != true) {
			System.out.println("Invalid Author,,,No Book Found");
		}
	}

	public void updatedCostByPages(int noOfPages) {
		boolean isUpdated = false;
		if (book.isEmpty())
			System.out.println("Book is Not Addedd");
		else {
			for (Book b : book) {
				if (b.getNoOfPages() == noOfPages) {
					b.setBookCost(1000);
					System.out.println("Book Cost Is Updated....");
					isUpdated = true;

				}
			}
		}
		if (isUpdated != true) {
			System.out.println("Invaid NoOfPages...Book Not Found");
		}
		
	}
	public void removeBookById(int id)
	{
		Iterator<Book> itr=book.iterator();
	    boolean isRemoved=false;
	    if(book.isEmpty())
	    	System.out.println("No Books are addedd");
	    else
	    {
	    	while(itr.hasNext())
	    	{
	    		Book b=itr.next();
	    		if(b.getBookId()==id)
	    		{
	    			itr.remove();
	    			System.out.println("Book Removed");
	    			isRemoved=true;
	    		}
	    	}
	    }
	    if(isRemoved!=true)
	    {
	    	System.out.println("Invalid Id ,,Book Not Found....");
	    }
	}
	

}
