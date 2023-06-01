package swiggy;

import java.util.Scanner;

public class swiggy {
	String restruantName;
	customer c;
	
	public void place_Order(customer c)
	{
		if (this.c==null) {
			this.c=c;
			System.out.println("Order Placed successfully");
			System.out.println("................");
			System.out.println("Order Name:-"+c.getOrder());
			System.out.println("Order Number:-"+c.getOrderNumber());
			System.out.println("....................");
		}
		else {
			System.out.println("Order Not Placed ");
			
		}
	}
	
	public void displayOrder() 
	{
		if (this.c==null) {
			try {
			throw new PlaceOrderFrist();
			}
			catch(RuntimeException d) {
				System.out.println("you dont have any order");
			}
		}
		else {
			System.out.println("*****Welcome*****");
			System.out.println("Restruant Name:-"+restruantName);
			System.out.println("User Name:- "+c.getUserName());
			System.out.println("User Contact Number:-"+c.getContactNumber());
			System.out.println("User Address:-"+c.getArea());
			System.out.println("Order Name:-"+c.getOrder());
			System.out.println("Order Number:-"+c.getOrderNumber());
			System.out.println(".................");
			System.out.println("Thank you('_') visit again");
		}
	}
	
	public void updateDetails()
	{
		if (this.c==null) {
			System.out.println("You dont have any order");
		}
		else {
			Scanner sc=new Scanner (System.in);
			System.out.println("Enter your choice \n1.To update Restruant Name \n2.To update Customer Name \n3.To update Contact Number \n4.To update area \n5.To update Order");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:
				{
					System.out.println("Enter Restraunt Name to update");
					String restrauntName=sc.next();
					this.restruantName=restrauntName;
					System.out.println("Name updated successfully");
				}
				break;
				case 2:
				{
					System.out.println("Enter Customer name to update");
					String userName=sc.next();
					c.setUserName(userName);
					System.out.println("User name Updated successfully");
					
				}
				break;
				case 3:
				{
					System.out.println("Enter contact Number to Update");
					long contactNumber=sc.nextLong();
					c.setContactNumber(contactNumber);
					System.out.println("Contact Name updated successfully");
				}
				break;
				case 4:
				{
					System.out.println("Enter your area or home address to update");
					String narea=sc.next();
					c.setArea(narea);
					System.out.println("area or home address updated  successfully");
				}
				case 5:
				{
					System.out.println("choice the new order to update\n1.Biryani \n2.Pav Bhaji \n3. ICE cream");
					int norder=sc.nextInt();
					int orderNumber=c.getOrderNumber();
					orderNumber++;
					switch(norder)
					{
						case 1:
							{
								c.setOrder("Biryani");
								c.setOrderNumber(orderNumber);
								System.out.println("............");
								System.out.println("Order Name:-"+c.getOrder());
								System.out.println("Order Number:-"+c.getOrderNumber());
								System.out.println("...................");
							}
						break;
						case 2:
							{
								c.setOrder("Pav Bhaji");
								c.setOrderNumber(orderNumber);
								System.out.println("............");
								System.out.println("Order Name:-"+c.getOrder());
								System.out.println("Order Number:-"+c.getOrderNumber());
								System.out.println("...................");
							}
						break;
						case 3:
							{
								c.setOrder("ICE creame");
								c.setOrderNumber(orderNumber);
								System.out.println("............");
								System.out.println("Order Name:-"+c.getOrder());
								System.out.println("Order Number:-"+c.getOrderNumber());
								System.out.println("...................");
							}
						break;
						case 4:
						{
							c.setOrder("idli");
							c.setOrderNumber(orderNumber);
							System.out.println("............");
							System.out.println("Order Name:-"+c.getOrder());
							System.out.println("Order Number:-"+c.getOrderNumber());
							System.out.println("...................");
						}
						break;
						case 5:
						{
							c.setOrder("Dosa");
							c.setOrderNumber(orderNumber);
							System.out.println("............");
							System.out.println("Order Name:-"+c.getOrder());
							System.out.println("Order Number:-"+c.getOrderNumber());
							System.out.println("...................");
						}
						break;
						case 6:
						{
							c.setOrder("kathiyawadi thali");
							c.setOrderNumber(orderNumber);
							System.out.println("............");
							System.out.println("Order Name:-"+c.getOrder());
							System.out.println("Order Number:-"+c.getOrderNumber());
							System.out.println("...................");
						}
						break;
						case 7:
						{
							c.setOrder("chicken fired rice");
							c.setOrderNumber(orderNumber);
							System.out.println("............");
							System.out.println("Order Name:-"+c.getOrder());
							System.out.println("Order Number:-"+c.getOrderNumber());
							System.out.println("...................");
						}
						break;
						case 8:
						{
							c.setOrder("dhokla");
							c.setOrderNumber(orderNumber);
							System.out.println("............");
							System.out.println("Order Name:-"+c.getOrder());
							System.out.println("Order Number:-"+c.getOrderNumber());
							System.out.println("...................");
						}
						break;
						case 9:
						{
							c.setOrder("fafda jalebi");
							c.setOrderNumber(orderNumber);
							System.out.println("............");
							System.out.println("Order Name:-"+c.getOrder());
							System.out.println("Order Number:-"+c.getOrderNumber());
							System.out.println("...................");
						}
						break;
						case 10:
						{
							c.setOrder("chole bhature");
							c.setOrderNumber(orderNumber);
							System.out.println("............");
							System.out.println("Order Name:-"+c.getOrder());
							System.out.println("Order Number:-"+c.getOrderNumber());
							System.out.println("...................");
						}
						break;
						default:
							{
								System.out.println("Invalid choice");
							}
						
					}
				}
				break;
				default:
				{
					System.out.println("Invalid choice");
				}
			
			}
		}
	}
	
	public void cancleOrder()
	{
		if (this.c==null) {
			System.out.println("you dont have any order");
		}
		else {
			this.c=null;
			System.out.println("Order cancelled successfully");
		}
	}

}
