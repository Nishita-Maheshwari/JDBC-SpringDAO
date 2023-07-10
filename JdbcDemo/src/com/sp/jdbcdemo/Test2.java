package com.sp.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.sp.dbccon.DbConnection;

public class Test2 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Name");
		String name1=s.next();
		
		System.out.println("Enter Email");
		String email1=s.next();
		
		System.out.println("Enter Password");
		String pass1=s.next();
		
		System.out.println("Enter Gender");
		String gender1=s.next();
		
		System.out.println("Enter City");
		String city1=s.next();
		
		try
		{
			Connection con=DbConnection.getConnection();
			
			PreparedStatement ps=con.prepareStatement("insert into register values(?,?,?,?,?)");
			ps.setString(1, name1);
			ps.setString(2, email1);
			ps.setString(3, pass1);
			ps.setString(4, gender1);
			ps.setString(5, city1);
			
			int i=ps.executeUpdate();
			if(i>0)
			{
				System.out.println("success");
			}
			else
			{
				System.out.println("fail");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
