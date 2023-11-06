package ra;

import ra.bussiness.util.ConnectDB;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection conn = ConnectDB.getConnection();
        System.out.println(conn);
    }
}