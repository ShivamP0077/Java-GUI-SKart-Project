import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnection {
    private static Connection connection;
    private String url = "jdbc:mysql://localhost:3306/scart";
    private String user = "root";
    private String password = "ShivamDATA&7";

    public DatabaseConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver"); // Use com.mysql.cj.jdbc.Driver for MySQL Connector/J 8
            connection = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean checkLogin(String username, String password) {
        try {
            String sql = "SELECT * FROM users WHERE username=? AND password=?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    return resultSet.next(); // True if a row is returned (login successful)
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void registerUser(String username, String password) {
        try {
            String sql = "INSERT INTO users (username, password) VALUES (?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
