package dao;

import config.Config;
import models.Ad;
import com.mysql.cj.jdbc.Driver;
import models.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads{

    private Connection connection;

    public MySQLAdsDao(){
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    Config.getUrl(),
                    Config.getUser(),
                    Config.getPassword());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public List<Ad> all() {
        Users usersDao = new UsersDao();
        List<User> users = usersDao.all();
        List<Ad> ads = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM adlister_db.ads");
            while (resultSet.next()){
                int user_id = resultSet.getInt("user_id");
                User userName = null;
                for (User user : users){
                    if (user.getId() == user_id){
                        userName = user;
                    }
                }
                Ad ad = new Ad(
                    resultSet.getInt("id"),
                        resultSet.getInt("id"),
                        resultSet.getString("email"),
                        resultSet.getString("description"),
                        userName
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return ads;
    }

    @Override
    public Long insert(Ad ad) {
        return null;
    }
}
