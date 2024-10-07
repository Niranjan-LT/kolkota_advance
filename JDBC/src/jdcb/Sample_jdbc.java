package jdcb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class Sample_jdbc
{
	@Test
	public void test() throws SQLException
	{
		String url="jdbc:mysql://localhost:3306/selenium";
		String user="root";
		String pass="root";
		Connection con = DriverManager.getConnection(url, user, pass);
		Statement state = con.createStatement();
		ResultSet result = state.executeQuery("select* from bank where username='gymi';");
		while(result.next())
		{
			//String un = result.getString("username");
			String pwd = result.getNString("pass");
			System.out.println(pwd);
		}

	}

}
