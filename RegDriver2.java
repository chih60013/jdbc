package jdbc;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.Iterator;

public class RegDriver2 {

	public static void main(String[] args) {

		try {
			DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// TODO Auto-generated method stub
		System.setProperty("jdbc.drivers","com.microsoft.sqlserver."+"Enumeration<E>verDriver");
		Enumeration<Driver> drivers = DriverManager.getDrivers();
		Iterator<Driver> driIter = drivers.asIterator();
		driIter.forEachRemaining(System.out::println);

	}

}
