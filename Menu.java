package food;

import java.util.Scanner;

public class Menu
{
	private String fname;
	private String lname;
	private String address;
	private String email;
	private String password;
	static long mno;
	
	static double totalPrice;
	
	public String getFname()
	{
		return fname;
	}
	public void setFname(String fname)
	{
		this.fname = fname;
	}
	public String getLname()
	{
		return lname;
	}
	public void setLname(String lname) 
	{
		this.lname = lname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	public long getMno() 
	{
		return mno;
	}
	public void setMno() 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Mobile Number:-");
		long mno=s.nextLong();
		if(mno>999999999 && mno<10000000000L)
		{
			this.mno=mno;
		}
		else
		{
			System.err.println("Invalid Mobile Number");
			System.err.println("Enter Valid 10 Digit Mobile Number");
			setMno();
		}
		
		
	}
	
	
	
	public void singup()
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Your First Name:-");
		String fname=s.next();
		setFname(fname);
		s.nextLine();
		System.out.println("Enter Your Last Name:-");
		String lname=s.nextLine();
		setLname(lname);
		System.out.println("Enter Your Address:-");
		String address=s.nextLine();
		setAddress(address);
		System.out.println("Enter Your Email ID:-");
		String email=s.nextLine();
		setEmail(email);
		System.out.println("Enter Your Password:-");
		String password=s.next();
		setPassword(password);
		
		setMno();
		
		System.out.println("Sign in Successful");
		System.out.println("Procedd For Login");
		login();
	}
	
	


	public void login()
	{
		if(fname != null)
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Your Choice:-");
			System.out.println("1.Login With mobile no:-");
			System.out.println("2.Login with Email:-");
			int a=s.nextInt();
			if(a==1)
			{
				System.out.println("Enter register Mobile Number:-");
				long mno=s.nextLong();
				System.out.println("Enter Your Password:-");
				String pwd=s.next();

				if(this.mno==mno && this.password.equals(pwd))
				{
					System.out.println("Login Successful!!!");
				}
				else
				{
					System.err.println("Invalid login or passwor!!!");
					login();
				}
			}
			else if(a==2)
			{
				System.out.println("Enter Reigister Email Id");
				String email=s.next();
				System.out.println("Enter Your Password:-");
				String pwd=s.next();
				
				if(this.email.equals(email) && this.password.equals(pwd))
				{
					System.out.println("Login Successful");
				}
				else
				{
					System.err.println("Invalid login or passwor!!!");
					login();
				}

			}else
			{
				System.err.println("Invalid Input");
				login();
			}
		}
		else
		{
			System.out.println("First Create Account For Login Maccha");
			singup();
		}
	}
	 public void Restorents()
	 {	
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter your choice:-");
		 System.out.println("1.Alka Bar");
		 System.out.println("2.jumbo king");
		 System.out.println("3.Vibhuti vines");
		 System.out.println("4.Exit");
		 int a=s.nextInt();
		 
		 switch (a) {
		case 1:
		{
			Alka_Bar bar=new Alka_Bar();
			bar.menu();
			break;
		}
		case 4:
		{
			System.out.println("Thank You!");
			System.exit(0);
		}
		default:
			System.out.println("Enter valid inpute!!!");
			Restorents();
		 }
	 }
	}