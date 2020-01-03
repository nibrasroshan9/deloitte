package jdbcexcercise;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jdbcdemo.DBconnection;

public class EnterProductDetails {
	public static void main(String[] args) throws SQLException {
		Product p = new Product();
		Connection conn = DBconnection.makeConnection();
		p.accept();
		PreparedStatement state = conn.prepareStatement("insert into hr.product values(?, ?, ?, ?)");

		state.setInt(1, p.getProductId());
		state.setString(2, p.getProductName());
		state.setInt(3, p.getPrice());
		state.setInt(4, p.getQoh());
		
		state.executeUpdate();
		System.out.println("Successfully inserted values");
	}
}
