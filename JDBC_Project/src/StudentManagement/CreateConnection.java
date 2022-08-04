package StudentManagement;

import java.sql.Connection;
import java.sql.DriverManager;

public class CreateConnection {
	
	//create connection of connection type which is in Connection package
	static Connection co;
	
	public static Connection CreateC() {
		//Always put in try catch block as it throws class not found exception
		try {
			//load driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//create connection
			String user = "root";
			String password = "root";
			String url = "jdbc:mysql://localhost:3306/JDBC_Project";
			co = DriverManager.getConnection(url, user, password);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return co;
	}

}
