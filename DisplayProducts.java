package jdbcexcercise;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jdbcdemo.DBconnection;

public class DisplayProducts {

	public static void main(String[] args) throws SQLException {
		Connection conn = DBconnection.makeConnection();
		Statement state = conn.createStatement();
		String query = "select * from hr.product";
		
		ResultSet res = state.executeQuery(query);
		while(res.next()) {
			System.out.print(res.getInt(1) + " ");
			System.out.print(res.getString(2) + " ");
			System.out.print(res.getInt(3) + " ");
			System.out.println(res.getInt(4) + " ");
		}
	}

}
