package jdcb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Orange_hrm 
{
	@BeforeMethod
	static Object[][] test() throws SQLException
	{
		String user="root";
		String pass="root";
		String url="jdbc:mysql://localhost:3306/Orange_hrm";
		
		Connection con = DriverManager.getConnection(url, user,pass );
		Statement state = con.createStatement();
		ResultSet data = state.executeQuery("select * from EMP_table;");
		List<String> List_of_data=new ArrayList<String>();
		
		String lastname=null;
		String Firstname=null;

		while(data.next()) 
		{
			lastname=data.getString("LastName");
			Firstname=data.getString("FirstName");
			List_of_data.add(lastname);
			List_of_data.add(Firstname);
		}
		 return new Object[][] {
			 {lastname,Firstname},{lastname,Firstname},{lastname,Firstname},{lastname,Firstname}	 
		 };
	
	}
	
	@DataProvider(name="orange_hrm")
	public Object[][] testdata1() throws SQLException
	{
		return Orange_hrm.test();
	}
	
	
	@Test(dataProvider = "orange_hrm")
	void testdata(String un,String pass)
	{
		System.out.println(un+"  "+pass);
	}
	
	
	
	
	
	
	}