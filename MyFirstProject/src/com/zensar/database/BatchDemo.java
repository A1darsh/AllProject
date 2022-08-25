/*package com.zensar.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchDemo {
	public static void main(String[] args) {
		//Connection con=null;
		//Statement smt=null;
		//ResultSet rs=null;
		
		Connection con=ConnectionProvider.getConnection();
		
		try {
			Statement smt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE,
			ResultSet rs=smt.executeQuery("select * from employee");
			//con.preparestat
			//con.setAutoCommit(false);
			
			smt.addBatch("insert into employee values(13,'a',111)");
			smt.addBatch("insert into employee values(11,'y',222)");
			smt.addBatch("insert into employee values(12,'l',333)");
			smt.executeBatch();
			con.commit();
			
			//rs=smt.executeQuery("select * from employee");
			//rs.absolute(3);
			//rs.relative(2);
			//System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			//rs.updateInt(1, 4);
			//rs.updateInt(2,40);
			//rs.updateRow();
			
			//rs.moveToInsertRow();
			
			///rs.updateInt(1, 444);
			///rs.updateString(2, "adarsh");
			//rs.updateInt(3, 44);
			//rs.insertRow();
			
			//System.out.println("success");
			
		//} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		////}
		
	//}
//}*/
