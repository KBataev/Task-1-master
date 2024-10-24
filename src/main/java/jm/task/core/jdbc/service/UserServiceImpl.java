package jm.task.core.jdbc.service;


import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
   private static UserDaoJDBCImpl userDao = new UserDaoJDBCImpl();
   private static UserDaoHibernateImpl userDaoHibernate = new UserDaoHibernateImpl();

    public void createUsersTable() {
        userDaoHibernate.createUsersTable();
        //userDao.createUsersTable();
    }

    public void dropUsersTable() {
        //userDao.dropUsersTable();
        userDaoHibernate.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
//        userDao.saveUser(name, lastName, age);
        userDaoHibernate.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
//        userDao.removeUserById(id);
        userDaoHibernate.removeUserById(id);
    }

    public List<User> getAllUsers() {

//        return new ArrayList<>(userDao.getAllUsers());
        return new ArrayList<>(userDaoHibernate.getAllUsers());
    }

    public void cleanUsersTable() {
//        userDao.cleanUsersTable();
        userDaoHibernate.cleanUsersTable();
    }


}
