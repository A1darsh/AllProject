package com.zensar.StudentManagement.repository;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionProvider {
	static Connection con=null;
	
	public static Connection getConnection() {
		try {
			Properties properties=new Properties();
	
		
			properties.load(new FileReader("db.properties"));
				
			String driverName=properties.getProperty("driver");
			String jdbcUrl=properties.getProperty("jdbcUrl");
			String username=properties.getProperty("username");
			String password=properties.getProperty("password");
			
			
			
			Class.forName(driverName);
			con=DriverManager.getConnection(jdbcUrl,username, password);
			
		} catch (ClassNotFoundException | SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
			
		
		return con;
	}

}
