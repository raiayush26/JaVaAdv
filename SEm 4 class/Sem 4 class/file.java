import java.sql.*;


public class file {
    public static void main(String[] args) throws SQLException,ClassNotFoundException{
        class.ForName("com.mysql.jbbc.Driver");//load jdbc driver
        Connection connection=DriverManager.getConnection("jbbc:mysql://localhost/java");
        Statement stmt=connection.createStatement();
        ResultSet rs=stmt.executeQuery("select * From student");

        connection.close();
    
}
}
