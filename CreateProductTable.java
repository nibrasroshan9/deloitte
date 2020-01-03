package jdbcexcercise;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import jdbcdemo.DBconnection;

public class CreateProductTable {

	public static void main(String[] args) throws SQLException {
		Connection conn = DBconnection.makeConnection();
		Statement state = conn.createStatement();
		
		String query = "create table hr.product(productid integer, productname varchar2(20), price integer, qoh integer)";
		state.execute(query);
		System.out.println("Table created successfully");
	} 

}
