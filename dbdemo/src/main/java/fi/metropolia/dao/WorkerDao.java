package fi.metropolia.dao;

import java.sql.*;
import java.sql.Connection;

import fi.metropolia.entity.*;
import fi.metropolia.datasource.*;;

public class WorkerDao {
    public Worker getWorker(int id) {

        int resultAmount = 0;
        String firstName = null;
        String lastName = null;

        try (Connection conn = MariaDBConn.getInstance()) {
            String sql = "SELECT firstname, lastname FROM worker WHERE id=?";
            PreparedStatement prepStmt = conn.prepareStatement(sql);
            prepStmt.setInt(1, id);
            ResultSet res = prepStmt.executeQuery();

            while (res.next()) {
                resultAmount++;
                firstName = res.getString(1);
                lastName = res.getString(2);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (resultAmount == 1) {
            return new Worker(id, firstName, lastName);
        } else {
            return null;
        }

    }

}
