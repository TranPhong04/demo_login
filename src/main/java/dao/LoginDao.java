package dao;

import models.Account;

import java.sql.*;

public class LoginDao {

    public static Account login(String username, String pass){

        try {
            String sql = "select * from accounts where username = ? and pass = ?";
            Connection connection = ConnectMySql.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,pass);

            ResultSet resultSet = preparedStatement.executeQuery();
            Account account = null;
            if(resultSet.next()) {
                int id = resultSet.getInt("id");
                String username1 = resultSet.getString("username");
                String pass1 = resultSet.getString("pass");
                String address = resultSet.getString("address");
                Date birth = resultSet.getDate("birth");
                int id_role = resultSet.getInt("id_role");
                 account = new Account(id, username1, pass1, address, birth, id_role);
            }
            return  account;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
