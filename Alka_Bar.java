package food;

import java.util.Scanner;

public class Alka_Bar extends Menu
{
	public void menu()
	{
		{
			System.out.println("Happy Hours 7-9Pm");
		}
		Scanner s=new Scanner(System.in);
		System.out.println("1.Starters");
		System.out.println("2.Desert");
		System.out.println("3.Drinks");
		System.out.println("4.Types Of Loncha");
		System.out.println("5.Go Black");

		int choice=s.nextInt();
		
		switch (choice) 
		{
		case 1: 
		{
			Starters();
			break;
		}
		case 5:
		{
			Menu m=new Menu();
			m.Restorents();
			break;
		}
		default:
		}
	}
	public void Starters()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Choice:-");
		System.out.println("1.Veg");
		System.out.println("2.Non-veg");
		System.out.println("3.Go Black");
		int ch=s.nextInt();
		
		if(ch==1)
		{
			System.out.println("1.Paneer Chilly");
			System.out.println("2.Veg Crispy");
			System.out.println("3.Privious Menu");
			int a=s.nextInt();
			
			if(a==1)
			{
				System.out.println("Price Of Paneer Chilly is RS.150");
				System.out.println("Press 1. TO Confirm Order");
				System.out.println("Press Any other number to go back");
				int order=s.nextInt();
					
				if(order==1)
				{
					Menu m=new Menu();
					if(Menu.mno!=0)
					{
					System.out.println("Oreder Palced!!");
					Menu.totalPrice=Menu.totalPrice+150;
					System.out.println("Press 1. TO Order From Same Menu");
					System.out.println("Press 2. TO Order From Differrnt Menu");
					System.out.println("Press 3. TO Proced fot bill");
					int b=s.nextInt();
					if(b==1)
					{
						Starters();
					}
					else if(b==2)
					{
						menu();
					}
					else if(b==3)
					{
						//code for payment gatway
						System.out.println("Total Bill:-"+Menu.totalPrice);
						Payment p=new PaymentGateway();
						if(PaymentGateway.Payment==true)
						{
						p.upiPayment();
						System.out.println("!!Thank You!!! Visit Again!!");
						}
						else
						{
							System.err.println("Enter Valid OTP MACHA");
							p.upiPayment();
						}
					}
					else
					{
						System.err.println("Chooise valid option");
						Starters();
					}
					}
					else
					{
						login();
						Starters();
					}
				}
				else
				{
					Starters();
				}
			}
			
			else if(a==2)
			{
				System.out.println("Price Of Veg Crispy is RS.150");
				System.out.println("Press 1. TO Confirm Order");
				System.out.println("Press Any other number to go back");
				int order=s.nextInt();
				
				if(order==1)
				{
					System.out.println("Order Placed Successfully!!!");
					Menu.totalPrice=Menu.totalPrice+150;
					System.out.println("Press 1. TO Order From Same Menu");
					System.out.println("Press 2. TO Order From Differrnt Menu");
					System.out.println("Press 3. TO Proced fot bill");
					int b=s.nextInt();
					if(b==1)
					{
						Starters();
					}
					else if(b==2)
					{
						menu();
					}
					else if(b==3)
					{
						//code for payment gatway
						System.out.println("Total Bill:-"+Menu.totalPrice);
						Payment p=new PaymentGateway();
						if(PaymentGateway.Payment==true)
						{
						p.upiPayment();
						System.out.println("!!Thank You!!! Visit Again!!");
						}
						else
						{
							System.err.println("Enter Valid OTP MACHA");
							p.upiPayment();
						}
					}
					else
					{
						System.err.println("Chooise valid option");
						Starters();
					}
					
				}
				else
				{
					Starters();
				}
			}
			else if(a==3)
			{
				Starters();
			}
			else
			{
				System.err.println("Chooise valid option");
				Starters();
			}
		}
		else if(ch==2)  
		{
			System.out.println("1.Chicken Chilly");
			System.out.println("2.Chicken Crispy");
			System.out.println("3.Go Black");
			int ch2=s.nextInt();
			
			if(ch2==1)
			{
				System.out.println("Price Of Chicken Chilly is RS.200");
				System.out.println("Press 1. TO Confirm Order");
				System.out.println("Press Any other number to go back");
				int order=s.nextInt();
				
				if(order==1)
				{
					System.out.println("Oreder Palced!!");
					Menu.totalPrice=Menu.totalPrice+200;
					System.out.println("Press 1. TO Order From Same Menu");
					System.out.println("Press 2. TO Order From Differrnt Menu");
					System.out.println("Press 3. TO Proced fot bill");
					int b=s.nextInt();
					if(b==1)
					{
						Starters();
					}
					else if(b==2)
					{
						menu();
					}
					else if(b==3)
					{
						//code for payment gatway
						System.out.println("Total Bill:-"+Menu.totalPrice);
						Payment p=new PaymentGateway();
						if(PaymentGateway.Payment==true)
						{
						p.upiPayment();
						System.out.println("!!Thank You!!! Visit Again!!");
						}
						else
						{
							System.err.println("Enter Valid OTP MACHA");
							p.upiPayment();
						}
					}
					else
					{
						System.err.println("Chooise valid option");
						Starters();
					}
				}
				else
				{
					Starters();
				}
			}
			else if(ch2==2)
			{
				System.out.println("Price Of Chicken Crispy is RS.210");
				System.out.println("Press 1. TO Confirm Order");
				System.out.println("Press Any other number to go back");
				int order=s.nextInt();
				
				if(order==1)
				{
					System.out.println("Oreder Palced!!");
					Menu.totalPrice=Menu.totalPrice+210;
					System.out.println("Press 1. TO Order From Same Menu");
					System.out.println("Press 2. TO Order From Differrnt Menu");
					System.out.println("Press 3. TO Proced fot bill");
					int b=s.nextInt();
					
					if(b==1)
					{
						Starters();
					}
					else if(b==2)
					{
						menu();
					}
					else if(b==3)
					{
						//code for payment gatway
						System.out.println("Total Bill:-"+Menu.totalPrice);
						Payment p=new PaymentGateway();
						if(PaymentGateway.Payment==true)
						{
						p.upiPayment();
						System.out.println("!!Thank You!!! Visit Again!!");
						}
						else
						{
							System.err.println("Enter Valid OTP MACHA");
							p.upiPayment();
						}
					}
					else
					{
						System.err.println("Chooise valid option");
						Starters();
					}
				}
			}
			else if(ch2==3)
			{
				Starters();
			}
			else 
			{
				System.err.println("Chooise valid option");
				Starters();
			}
			
		}
		else if(ch==3)
		{
			menu();
		}
		else
		{
			System.err.println("Enter Valid Input");
			Starters();
		}
	}
}