package jdcb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class Demo1 {

	@Test
	public void testScript() throws SQLException
	{
		String url="jdbc:mysql://localhost:3306/niranjan";
		String user="root";
		String pass="niru";
		Connection con = DriverManager.getConnection(url, user, pass);
		Statement state = con.createStatement();
		ResultSet res = state.executeQuery("select* from jdbc;");
		res.next();
		String userdata = res.getString("username");
		System.out.println(userdata);
		String password = res.getString("pass");
		System.out.println(password);
		
	}
}
