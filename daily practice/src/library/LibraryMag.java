package library;

import java.util.ArrayList;

class Book
{
	public String name,author;
	
	public Book(String string, String string2) {
		// TODO Auto-generated constructor stub
		this.name=string;
		this.author=string2;
		
	}

	public String toString()
	{
		return ("Books{name='"+name+"',author='"+author+"'}");
		
	}
}

class MyLibrary
{
	public ArrayList<Book> books;
	
	public MyLibrary(ArrayList<Book> book)
	{
		this.books=book;
	}
	
	public void addBook(Book book)
	{
		books.add(book);
		System.out.println(book+" Book is added");
	}
	public void issueBook(Book book,String issuedTo)
	{
		books.remove(book);
		System.out.println(book+" Book is issued to "+issuedTo);
	}
	public void returnBook(Book book)
	{
		books.add(book);
		System.out.println(book+" Book is returned");
	}
}
public class LibraryMag 
{
	public static void main(String[] args) {
		ArrayList<Book> bk=new ArrayList<>();
		Book b1=new Book("Algorithm","CLRs");
		bk.add(b1);	//Array:List wala add mthd
		
		Book b2=new Book("Algorithm2","CLRs2");
		bk.add(b2);
		
		Book b3=new Book("Algorithm3","CLRs3");
		bk.add(b3);
		
		Book b4=new Book("Algorithm4","CLRs4");
		bk.add(b4);
		
		System.out.println(bk);
 		
		MyLibrary l=new MyLibrary(bk);
		l.addBook(new Book("algo","auth"));
		System.out.println(l.books);
		
		l.issueBook(b2,"Aniket");
		System.out.println(l.books);
		
		l.returnBook(b2);
		System.out.println(l.books);
		
		
		
	}
}
