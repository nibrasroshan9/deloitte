package jdbcexcercise;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jdbcdemo.DBconnection;

public class UpdateProductByUser {
	public static void main(String[] args) throws SQLException {
		Product p = new Product();
		Connection conn = DBconnection.makeConnection();
		p.accept();
		PreparedStatement state = conn.prepareStatement("update hr.product set productname=?, price=?, qoh=? where productid=?");
		state.setString(1, p.getProductName());
		state.setInt(2, p.getPrice());
		state.setInt(3, p.getQoh());
		state.setInt(4, p.getProductId());
		
		state.executeUpdate();
		System.out.println("Successfully updated");
		
	}
}
