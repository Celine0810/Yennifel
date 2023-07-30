import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabasedYennifel {
    private static final String URL = "jdbc:mysql://localhost:3306/yennifel";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) throws SQLException {
        Connection conn = getConnection();
        try{
            conn.setAutoCommit(false);
            //Codigo
            //1 INSERT 2 rigas
            //2 INSERT 10 rigas table
            //3 SELECT
            //...

            conn.commit();
        } catch(Exception e) {
            conn.rollback();
        } finally {
            conn.close();
        }
    }
}



