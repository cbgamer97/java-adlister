package dao;

import com.mysql.cj.jdbc.Driver;
import config.Config;
import models.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsersDao implements Users{
    Connection connection;

    public UsersDao(){
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    Config.getUrl(),
                    Config.getUser(),
                    Config.getPassword());
        } catch (SQLException sqlx){
            throw new RuntimeException("Error connecting to db", sqlx);
        }
    }
    @Override
    public List<User> all() {
        List<User> users = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            // Execute statement
            ResultSet resultSet = statement.executeQuery("SELECT * FROM adlister_db.users");
            while (resultSet.next()) {
                User user = new User(
                        resultSet.getInt("id"),
                        resultSet.getString("username"),
                        resultSet.getString("email"),
                        resultSet.getString("password")
                );
                users.add(user);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return users;
    }

    @Override
    public void insert(User user) {

    }
}
