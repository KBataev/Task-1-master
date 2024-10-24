package jm.task.core.jdbc.util;

import jm.task.core.jdbc.model.User;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;


public class Util {
    final static String url = "jdbc:postgresql://localhost:5432/postgres";
    final static String user = "postgres";
    final static String pass = "";
    public static Connection connect_db() {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, user, pass);

                System.out.println("CONNECTED to DATABASE");

        } catch (Exception e) {
            System.out.println("Not CONNECTED");
        }

        return conn;
    }
    public static SessionFactory getSessionFactory() {


            Configuration config = new Configuration();
            config.addAnnotatedClass(User.class);

            config.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
            config.setProperty("hibernate.connection.url", url);
            config.setProperty("hibernate.connection.username", user);
            config.setProperty("hibernate.connection.password", pass);
            config.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
            config.setProperty("hibernate.hbm2ddl.auto", "update");
            config.setProperty("hibernate.show_sql", "true");

            SessionFactory sessionFactory = config.buildSessionFactory();

        return sessionFactory ;
    }







}
