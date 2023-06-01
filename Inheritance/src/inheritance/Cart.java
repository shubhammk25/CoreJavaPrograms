package inheritance;

import java.util.Scanner;

public class Cart {
	
	Books b;
	
	public void addBook(int choice)
	{
		if (this.b==null) {
			Scanner sc=new Scanner (System.in);
			if (choice==1) {
				System.out.println("how many book you wannt to add?");
				int n=sc.nextInt();
				b= new Ramayana(n);
				System.out.println(n+"Books added Successfully in cart..");
				
			}
			else if (choice==2) {
				System.out.println("how many book you wannt to add?");
				int n=sc.nextInt();
				b= new BhagwatGeeta(n);
				System.out.println( n+" Books added Successfully in cart..");
			}
			else {
				System.out.println("Invalid choice");
			}
		
		}
		
	}
	
	public void removeBook()
	{
		if (this.b==null) {
			//this.b=null;
			System.out.println("please Add book in the cart");
		}
		else {
			this.b=null;
			System.out.println("Book removed Successfully from cart..");
		}
	}
	
	public void checkCart()
	{
		if (this.b==null) {
			System.out.println("please Add book in the cart");
		}
		else {
			System.out.println("book is present in the cart");
		}
	}
	
	public void showCart()
	{
		if (this.b==null) {
			System.out.println("please Add book in the cart");
		}
		else {
			if (this.b instanceof Ramayana) {
				Ramayana r1=(Ramayana) b;
				System.out.println("Book name is:" +r1.getName());
				System.out.println("No_of_pages are:"+r1.getNo_of_pages());
				System.out.println("Book Author is: "+r1.getAuthor());
				System.out.println("Books Language is: "+r1.getLangauge());
			}
			else {
				BhagwatGeeta g1=(BhagwatGeeta) b;
				System.out.println("Book name is: "+g1.getName());
				System.out.println("No_of_pages are:"+g1.getNo_of_pages());
				System.out.println("Book Author is: "+g1.getAuthor());
				System.out.println("Books Language is: "+g1.getLangauge());
			}
		}
	}

}
