package jdbcexcercise;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import jdbcdemo.DBconnection;

public class DeleteProductById {

	public static void main(String[] args) throws SQLException {

		Scanner in = new Scanner(System.in);
		
		Connection conn = DBconnection.makeConnection();
		PreparedStatement state = conn.prepareStatement("delete from hr.product where productid=?");

		System.out.println("Enter product ID to remove : ");
		int id = in.nextInt();
		in.close();
		state.setInt(1, id);
		
		state.executeUpdate();
		System.out.println("Successfully deleted entry with ID : "+id);
		state.close();
		conn.close();
		
	}

}
