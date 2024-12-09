package com;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
       
		Scanner sc=new Scanner(System.in);
		Library l=new Library();
		boolean start=true;
		while(start)
		{
			System.out.println("Enter The Choice \n 1.AddBook \n 2.ShowBooks \n 3.SearchBookById \n 4.SearchBookByAuthor \n 5.UpdateCostByNoOfPages \n 6.RemoveBookById \n 7.Exit");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
			{
				System.out.println("Enter The Book Tittle");
				String tittle=sc.next();
				System.out.println("Enter The Book Id");
				int id=sc.nextInt();
				System.out.println("Enter The BookAuthor");
				String author=sc.next();
				System.out.println("Enter The Book Cost");
				int cost=sc.nextInt();
				System.out.println("Enter The Noofpages");
				int noofpages=sc.nextInt();
				l.addBook(new Book(tittle, id, author, cost, noofpages));
				
			}
			break;
			case 2:
			{
				l.showBooks();
			}
			break;
			case 3:
			{
				System.out.println("Enter The Book Id");
				int id=sc.nextInt();
				l.searchBookById(id);
			}
			break;
			case 4:
			{
				System.out.println("Enter The Author");
				String author=sc.next();
				l.searchBookByAuthor(author);
			}
			break;
			case 5:
			{
				System.out.println("Enter The NoOfPages");
				int noofPages=sc.nextInt();
				l.updatedCostByPages(noofPages);
			}
			break;
			case 6:
			{
				System.out.println("Enter The Id");
				int id=sc.nextInt();
				l.removeBookById(id);
			}
			break;
			case 7:
			{
				start=false;
				System.out.println("Thank You....");
			}
			break;
			default:System.out.println("Enter Valid Choice.....");
			
			}
		}
		
	}
}
