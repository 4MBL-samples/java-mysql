package fi.metropolia.datasource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MariaDBConn {
    private static Connection conn = null;

    public static Connection getInstance() {

        if (conn == null) {
            try {
                String dbUsername = "olsodbuser";
                String dbPassword = "olsopass";
                conn = DriverManager
                        .getConnection("jdbc:mysql://localhost/olsok23?" + "user=" + dbUsername + "&password="
                                + dbPassword);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return conn;

    }
}
