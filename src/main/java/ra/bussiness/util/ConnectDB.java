package ra.bussiness.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/qlsv";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "18061999";
    public static Connection getConnection(){
        Connection conn = null;

        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }
    public static  void closeConnection(Connection conn){
        if(conn !=null){
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
