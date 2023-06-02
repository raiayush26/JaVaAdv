import java.sql.*;
public class Conntotor {
    public static void main(String[] args)  throws  SQLException, ClassNotFoundException{
        Connection conn = null;
        Statement  stmt  = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String conn_string ="jdbc:mysql://localhost/test?"+
             "user=root&password=Mysql@123";
             conn = DriverManager.getConnection(conn_string);
                stmt = conn.createStatement();
        } catch (Exception e) {
           System.out.println(e);
        }

        
    }
}
