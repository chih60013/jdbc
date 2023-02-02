package jdbc;

public class RegDriver1 {

	public static void main(String[] args) {
		
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("ok");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("NG");
			e.printStackTrace();
		}
	}
}




 
