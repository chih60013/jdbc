package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import connectuinUtil.ConnectionFactory;

public class ConnectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection conn = DriverManager.getConnection("jdbc:sqlserver://"+"localhost:1433;databasename=Northwind;encrypt=false", "banana", "1234");
			System.out.println("ok");
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
