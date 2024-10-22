package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Util {
    final static String url = "jdbc:postgresql://localhost:5432/postgres";
    final static String user = "postgres";
    final static String pass = "";
    public static Connection connect_db() {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, user, pass);

                System.out.println("CONNECTED to DATABASE");

        } catch (Exception e) {
            System.out.println("Not CONNECTED");
        }

        return conn;
    }






}
