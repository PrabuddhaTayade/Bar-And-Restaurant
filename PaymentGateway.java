package food;

import java.util.Random;
import java.util.Scanner;

public class PaymentGateway implements Payment 
{
	public static boolean Payment=false;
	@Override
	public void upiPayment()
	{
		System.out.println("Choose Payment Option");
		System.out.println("1.PhonePay");
		System.out.println("2.Gpay");
		System.out.println("3.Cash");
		Scanner s=new Scanner(System.in);
		int op=s.nextInt();
		switch (op) {
		case 1:
		{
			phonePay();
			break;
		}
		case 2:
		{
			gpay();
			break;
		}
		case 3:
		{
			cash();
			break;
		}
		default:
		}

	}
	
	private void phonePay()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Total Price Is:-"+Menu.totalPrice);
		System.out.println("Verify your register Number");
		
		long mobileno=s.nextLong();
		if(mobileno==Menu.mno)
		{
			int a=9999;
			Random r=new Random();
			int o=r.nextInt(a);
			while(o<999)
			{
				o=r.nextInt(a);
			}
			System.out.println("OTP IS:-"+o);
			System.out.println("Enter  the OTP display on the Screen");
			int otp=s.nextInt();
			if(otp==o)
			{
				System.out.println("Enter Amount");
				double price=s.nextInt();
				if(Menu.totalPrice>=price)
				{
					System.out.println("!!!Payment Successfull And Order COnfirm!!!!");
				}
			}
			else
			{
				
				System.out.println("Enter valid OTP");
				int otp1=s.nextInt();
				if(otp1!=o)
				{
					System.out.println("Enter Amount");
					double price=s.nextInt();
					if(Menu.totalPrice>=price)
					{
						System.out.println("!!!Payment Successfull And Order COnfirm!!!!");
					}
				}
			}
		}
		else
		{
			System.out.println("Enter register Mobile Number");
			upiPayment();
		}
		
	}

	private void  gpay()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("TOtal Price is:-"+Menu.totalPrice);
		System.out.println("Verify your Mobile Number");
		
		long mobileno=s.nextLong();
		if(mobileno==Menu.mno)
		{
			int a=9999;
			Random r=new Random();
			int o=r.nextInt(a);
			while(o<999)
			{
				o=r.nextInt(a);
			}
			System.out.println(a);
			System.out.println("enter otp Display on screen");
			int otp=s.nextInt();
		
			
			if(otp==o)
			{
				System.out.println("Enter Amount");
				double price=s.nextInt();
				if(Menu.totalPrice==price)
				{
					System.out.println("!!!Payment Successfull And Order COnfirm!!!!");
				}
			}
			else 
			{
				System.out.println("Enter valid OTP");
				int otp1=s.nextInt();
				if(otp1==o)
				{
					System.out.println("Enter Amount");
					double price=s.nextInt();
					if(Menu.totalPrice==price)
					{
						System.out.println("!!!Payment Successfull And Order COnfirm!!!!");
					}
				}
			}
		}
	}

	private void cash()
	{
		
	}
}