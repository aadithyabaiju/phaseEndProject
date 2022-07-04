package phaseEndProject1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrieveMobileInfo {
	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/amazon";
		String username = "root";
		String password = "root";
		String query = "Select * from products";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(dbUrl, username, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		
		while(rs.next()) {
	System.out.print("Brand: "+rs.getString("brand") + "\t");
	System.out.print("Model_name: "+rs.getString("model_name")+"\t") ;
	System.out.print("Price_of_mobile: "+rs.getString("price_of_mobile")+"\t") ;
	System.out.print("RAM: "+rs.getString("RAM")+"\t") ;
	System.out.print("Storage: "+rs.getString("storage")+"\t") ;
	System.out.print("Battery: "+rs.getString("battery")+"\t") ;
	System.out.println();
	
		
			
		}
		
	}

}
