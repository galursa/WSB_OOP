/*
 * Books
--
Author: String
Title: String
Price: double
VAT: double
Cover: String
--
void info()
double baseOfPrice()
void compare(Books book)
 */

class Books
{
	String author;
	String title;
	double price;
	double VAT;
	String cover;
	void info()
	{
		System.out.println("Author:"+author);
		System.out.println("Title:"+title);
		System.out.println("Price: "+price+" PLN");
		System.out.println("VAT: "+VAT*100+" %");
		System.out.println("Cover: "+cover);
	}
	
	double baseOfPrice()
	{
		return price*(1-VAT);
	}
	void compare(Books book)
	{
		if(((author==book.author)&&(title==book.title))&&((price==book.price)&&(cover==book.cover))&&(VAT==book.VAT))
		{
			System.out.println("Books are the same.");
		}
		else
		{
			System.out.println("Books are different");
		}
	}
}


public class BookDatabase {
	public static void main(String[] args) {
		Books book1 = new Books();
		book1.author = "J.K.Rowling";
		book1.title = "Harry Potter";
		book1.price = 100.00;
		book1.VAT = 0.10;
		book1.cover = "Hard";
		book1.info();
		System.out.println("Netto Price: "+book1.baseOfPrice());
		Books book2 = new Books();
		book2.author = "J.K.Rowling";
		book2.title = "Harry Potter";
		book2.price = 100.00;
		book2.VAT = 0.10;
		book2.cover = "Hard";
		book2.info();
		book1.compare(book2);
		
		
	}
}
