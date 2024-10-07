package jdcb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class Demo {

	@Test
	public void test() throws SQLException
	{
		String url="jdbc:mysql://localhost:3306/Orange_hrm";
		String user="root";
		String pass="root";
		Connection con=DriverManager.getConnection(url, user, pass);
		Statement state = con.createStatement();
		ResultSet userdata = state.executeQuery("select* from EMP_table;");
		while(userdata.next()) 
		{
			
			String password = userdata.getString("LastName");
			System.out.println(password);
			String username = userdata.getString("FirstName");
			System.out.println(username);
			String emp_pass = userdata.getString("EMP_PassWord");
			System.out.println(emp_pass);
			
		}
		
	
	}
}
