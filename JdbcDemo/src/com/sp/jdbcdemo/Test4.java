package com.sp.jdbcdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.sp.dbccon.DbConnection;

public class Test4 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter email id :");
		String email1=s.next();
		
		Connection con=null;
		PreparedStatement ps=null;
		
		try
		{
			con=DbConnection.getConnection();
			
			ps=con.prepareStatement("delete from register where email=?");
			ps.setString(1, email1);
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
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				ps.close();
				con.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
