package dao;

import com.mysql.cj.jdbc.Driver;
import models.Artist;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ArtistsDao implements Artists {

    private Connection connection;

    public ArtistsDao() {
        try {
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/codeup_test_db?allowPublicKeyRetrieval=true&useSSL=false",
                    "root",
                    "codeup"
            );
        } catch (SQLException sqlx) {
            throw new RuntimeException("Error connecting to database");
        }
    }

    @Override
    public List<Artist> all() {
        List<Artist> artists = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            // Execute statement
            ResultSet resultSet = statement.executeQuery("SELECT * FROM codeup_test_db.albums");
            while (resultSet.next()) {
                Artist artist = new Artist(
                        resultSet.getLong("id"),
                        resultSet.getString("artist")
                );
                artists.add(artist);
            }
        } catch (SQLException sqlx) {
            throw new RuntimeException("error connecting to database");
        }
        return artists;
    }



    @Override
    public void insert(Artist artist) {

    }
}
