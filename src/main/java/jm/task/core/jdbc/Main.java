package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;


import jm.task.core.jdbc.service.UserServiceImpl;




public class Main {

    public static UserDaoJDBCImpl userDao = new UserDaoJDBCImpl();
    public static UserServiceImpl userService = new UserServiceImpl();
    public static UserDaoHibernateImpl userDaoHibernate = new UserDaoHibernateImpl();
    public static void main(String[] args) {

    }

}
