package com.zensar.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class WorkOnResultSet {

	public static void main(String[] args) {
//Connection con = null;
//Statement stm = null;
// con = ConnectionProvider.getConnection();
		/* Try Block me ye REsources */
		try (Connection con = ConnectionProvider.getConnection();
				Statement stm = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
				ResultSet rs = stm.executeQuery("select * from employee")) {
//stm = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

// ResultSet rs = stm.executeQuery("select * from employee");
			rs.absolute(3);

			rs.relative(2);
			rs.updateInt(3, 30);
			rs.updateRow();

			rs.moveToInsertRow();
			rs.updateInt(1, 210);
			rs.updateString(2, "Ram");
			rs.updateInt(3, 50);
			rs.insertRow();
			System.out.println("Batch Execute Successfully");

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
