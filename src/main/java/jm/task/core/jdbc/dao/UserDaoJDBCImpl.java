package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class UserDaoJDBCImpl implements UserDao {
    public UserDaoJDBCImpl() {

    }

    public void createUsersTable() {

        try(Connection conn =  Util.connect_db();
            Statement stmt = conn.createStatement();){
            String sql = "CREATE TABLE IF NOT EXISTS users ("+
                    "id SERIAL PRIMARY KEY,"+
                    "name VARCHAR(50),"+
                    "lastName VARCHAR(50),"+
                    "age INT)";
            stmt.execute(sql);
            System.out.println("Table created");

        }catch (Exception e) {
            System.out.println("Erorr create table users");

        }
    }

    public void dropUsersTable() {
        try(Connection conn =  Util.connect_db();
            Statement stmt = conn.createStatement();){
            String sql = "Drop table users";
            stmt.execute(sql);
            System.out.println("Table dropped");


        }catch (Exception e) {
            System.out.println("Erorr droped table users");
        }
    }

    public void saveUser(String name, String lastName, byte age) {

        try(Connection conn =  Util.connect_db();
            Statement stmt = conn.createStatement();){
            String sql = "INSERT INTO users (name, lastname, age) VALUES ("+
                    "'" + name+"',"+
                    "'" + lastName+"',"+
                    age + ")";

            stmt.executeUpdate(sql);
            System.out.println("User с именем – " + name +" добавлен в базу данных");


        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erorr add users");
        }
    }

    public void removeUserById(long id) {
        try(Connection conn =  Util.connect_db();
            Statement stmt = conn.createStatement();){
            String sql = "DELETE FROM users WHERE id = " + id;

            stmt.executeUpdate(sql);
            System.out.println("user deleted");


        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erorr delete users");
        }
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<User>();
        String sql = "SELECT id,name, lastname, age FROM users";
        try(Connection conn =  Util.connect_db();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);){
            while (rs.next()) {
                User user = new User();
                user.setId((long) rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setLastName(rs.getString("lastName"));
                user.setAge((byte) rs.getInt("age"));
                users.add(user);
            }

        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erorr get all users");
        }
        return users;
    }

    public void cleanUsersTable() {
        try(Connection conn =  Util.connect_db();
            Statement stmt = conn.createStatement();){
            String sql = "DELETE FROM users";

            stmt.executeUpdate(sql);
            System.out.println("users deleted");


        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erorr delete users");
        }
    }
}
