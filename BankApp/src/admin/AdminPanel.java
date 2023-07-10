package admin;

import java.util.Scanner;

import main.Main;

public class AdminPanel 
{
	public void adminLogin()
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Admin Email ID :");
		String email1=s.next();
		
		System.out.println("Enter Admin Password :");
		String pass1=s.next();
		
		if(email1.equals("admin@gmail.com") && pass1.equals("admin123"))
		{
			System.out.println("-------------Welcome Admin--------------");
			
			welcomeAdmin();
		}
		else
		{
			System.err.println("-----------Invalid Admin Credentials----------");
			
			Main obj=new Main();
			obj.startBankApp();
		}
	}
	
	private void welcomeAdmin()
	{
		System.out.println("Choose one option below :-\r\n"
							+ "1. Open Account\r\n"
							+ "2. Close Account\r\n"
							+ "3. Logout");
		
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		
		switch(i)
		{
			case 1:
				openAccount();
				break;
			case 2:
				closeAccount();
				break;
			case 3:
				adminLogout();
				break;
			default:
				welcomeAdmin();
				break;
		}
	}
	
	private void openAccount()
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Customer Name :");
		String cust_name=s.next();
		
		System.out.println("Enter Customer Account No :");
		String cust_accountno=s.next();
		
		while(cust_accountno.length() != 10)
		{
			System.err.println("-------------Invalid Account No. (account no should be of 10 digits)---------------");
			
			System.out.println("Enter Customer Account No :");
			cust_accountno=s.next();
		}
		
		System.out.println("Enter Phone No :");
		String cust_phno=s.next();
		
		System.out.println("Enter Amount :");
		int cust_amount=s.nextInt();
		
		while(cust_amount < 5000)
		{
			System.err.println("------------Amount should be 5000rs or more-----------------------");
			System.out.println("Enter Amount :");
			cust_amount=s.nextInt();
		}
		
		String cust_pass=generatePassword(cust_name, cust_accountno);
		
		boolean status=AdminDbOperations.openCustAccount(cust_name, cust_accountno, cust_phno, cust_amount, cust_pass);
		if(status)
		{
			System.out.println("--------------Account opened successfully-------------------------");
			welcomeAdmin();
		}
		else
		{
			System.err.println("----------------Error occured----------------");
			welcomeAdmin();
		}
	}
	private String generatePassword(String name, String accountno)
	{
		String sub_name=name.substring(0, 3);
		String sub_accno=accountno.substring(6, 10);
		
		String pass1=sub_name+sub_accno;
		
		return pass1;
	}
	
	private void closeAccount()
	{
		
	}
	private void adminLogout()
	{
		
	}
}
