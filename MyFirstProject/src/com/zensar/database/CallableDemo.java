package com.zensar.database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CallableDemo {

	public static void main(String[] args)
	{
		Connection con=null;
		CallableStatement csmt=null;
		
		con=ConnectionProvider.getConnection();
		
		try {
			csmt=con.prepareCall("{call updateEmpAge(?,?)}");
			csmt.setInt(1,500);
			csmt.registerOutParameter(2, java.sql.Types.INTEGER);
			
			
			
			int count=csmt.executeUpdate();
			System.out.println("update age of Empage"+csmt.getInt(2));
			System.out.println("successfull");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
