
import java.sql.*;
import com.mysql.cj.jdbc.Driver;
public class Database{
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/ayush";
			String name = "root";
			String pass = "admin123";
			conn = DriverManager.getConnection(url, name, pass);
			System.out.println("Connection successfull");
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM Persons");
			while(rs.next()) {
				System.out.println(rs.getString("LastName") + " "+ rs.getString("FirstName"));
				
			}
			conn.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}