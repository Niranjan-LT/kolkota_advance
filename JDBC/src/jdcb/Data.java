package jdcb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class Data 
{
	@Test
	public void test() 
	{
		Connection con = null;
		Statement state=null;
		ResultSet req=null;
		try
		{
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "niru");
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		try 
		{
			state = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 try {
			 req= state.executeQuery("select * from actor where first_name='NICK';");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 try {
			while(req.next())
			 {
				System.out.println(req.getString(2)+" "+req.getString(3));
			 }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 
		 
	}

}
