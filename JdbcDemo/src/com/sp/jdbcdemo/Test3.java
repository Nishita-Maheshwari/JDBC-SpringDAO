package com.sp.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.sp.dbccon.DbConnection;

public class Test3 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter name which you want to update");
		String name1=s.next();
		
		System.out.println("Enter Email id");
		String email1=s.next();
		
		try(
				Connection con=DbConnection.getConnection();
				PreparedStatement ps=con.prepareStatement("update register set name=? where email=?");
			)
		{
			ps.setString(1, name1);
			ps.setString(2, email1);
			int i=ps.executeUpdate();
			if(i>0)
			{
				System.out.println("successfully updated");
			}
			else
			{
				System.out.println("error occured");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
