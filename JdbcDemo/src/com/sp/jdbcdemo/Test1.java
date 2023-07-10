package com.sp.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.sp.dbccon.DbConnection;

public class Test1 
{
	public static void main(String[] args)
	{
		try
		{
			
			// 1. load the driver
			//Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2 Create database connection
			//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_demo_db", "root", "root");
			
			Connection con=DbConnection.getConnection();
			
			//3. Create Statement
			Statement st=con.createStatement();
			
			//4. get resultset
			ResultSet rs=st.executeQuery("select * from register");
			
			//5. get values from resultset
			while(rs.next())
			{
				String name1=rs.getString("name");
				String email1=rs.getString("email");
				String gender1=rs.getString("gender");
				String city1=rs.getString("city");
				
				System.out.println(name1+" - "+email1+" - "+gender1+" - "+city1);
			}
			
			rs.close();
			st.close();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}
