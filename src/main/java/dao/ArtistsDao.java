package dao;

import com.mysql.cj.jdbc.Driver;
import config.Config;
import models.Artist;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ArtistsDao implements Artists {

    private final Connection connection;

    public ArtistsDao() {
        try {
            DriverManager.registerDriver(new Driver());
            this.connection = DriverManager.getConnection(
                    Config.getUrl(),
                    Config.getUser(),
                    Config.getPassword()
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
            throw new RuntimeException("error connecting to database", sqlx);
        }
        return artists;
    }



    @Override
    public void insert(Artist artist) {

    }
}
