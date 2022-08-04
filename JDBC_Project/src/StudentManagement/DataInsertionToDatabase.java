package StudentManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DataInsertionToDatabase {
	
	public static boolean insertion(StudentDetails st) {
		boolean flag = false;
		try {
		
		Connection co = CreateConnection.CreateC();
		String a = "insert into students(name,phone,city) values(?,?,?)";
		
		PreparedStatement ps = co.prepareStatement(a);
		
		ps.setString(1, st.getName());
		ps.setString(2, st.getPhone());
		ps.setString(3, st.getCity());
		
		ps.executeUpdate();
		flag=true;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	public static boolean deletion(int b) {
		boolean flag = false;
		try {
		Connection co = CreateConnection.CreateC();
		String q = "delete from students where id=?";
		PreparedStatement ps = co.prepareStatement(q);
		ps.setInt(1, b);
		ps.executeUpdate();
		flag = true;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	public static void display() {
		try {
			Connection con = CreateConnection.CreateC();
			String a = "select * from students;";
			PreparedStatement psps = con.prepareStatement(a);
			ResultSet ab = psps.executeQuery();
			while(ab.next()) {
				System.out.println("ID : " + ab.getInt(1) + " Name : " + ab.getString(2) + " Phone : " + ab.getString(3) + " City : " + ab.getString(4));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
