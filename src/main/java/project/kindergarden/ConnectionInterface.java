package project.kindergarden;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionInterface {
    String dbURL = "jdbc:mysql://localhost:3306/sampledb";
    String username = "root";
    String password = "secret";


    public ConnectionInterface() {
        try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {

            // code to execute SQL queries goes here...

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


}
