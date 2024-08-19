package food;

import java.util.Scanner;

public class FoodDriver {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("1.Singup");
		System.out.println("2.Login");
		System.out.println("3.Guest Access");
		System.out.println("4.Exit");

		Menu m=new Menu();
		int choice=s.nextInt();
		switch (choice) {
		case 1: 
		{
			m.singup();
			break;
		}
		case 2:
		{
			m.login();
			break;
		}
		case 3:
		{
			System.out.println("*****Welcome TO Guest Area*****");
			m.Restorents();
			System.exit(0);
		}
		case 4:
		{
			System.out.println("Thank You!Visite again");
			System.exit(0);
		}
		
		default:
			
			System.err.println("Enter Valid Input");
			main(null);
		}
		
		m.Restorents();	
		

	}

}
