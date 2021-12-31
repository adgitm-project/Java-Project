package codebuddy;
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
public class CP {
	
	 Connection con;
	 Statement s;
	public  CP () {
		try {
			
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create connection....
			String user = "root";
			String password = "Piyush31bh";
			String url = "jdbc:mysql://localhost:3306/bank5";
			
			
			
			
			con=DriverManager.getConnection(url,user,password);
			s=con.createStatement();
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		//return con;
		
	}
	
	

}

