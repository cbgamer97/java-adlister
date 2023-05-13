package dao;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBC {
    private static List<String> getArtistNames() {
        List<String> artistNames = new ArrayList<>();

        try {
            // Establish connection to database
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/codeup_test_db?allowPublicKeyRetrieval=true&useSSL=false",
                    "root",
                "codeup"
            );
            // Create statement
            Statement statement = connection.createStatement();
            // Execute statement
            ResultSet resultSet = statement.executeQuery("SELECT artist FROM codeup_test_db.albums");
            while(resultSet.next()){
                artistNames.add(resultSet.getString("artist"));
            }
        } catch (SQLException sqlx) {
            sqlx.printStackTrace();
        }
        return artistNames;
    }

    public static void main(String[] args) {
        for(String artist : getArtistNames()){
            System.out.println(artist);
        }
    }
}