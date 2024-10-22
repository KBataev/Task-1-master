package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.util.List;

public class Main {
    public static UserDaoJDBCImpl userDao = new UserDaoJDBCImpl();
    public static UserServiceImpl userService = new UserServiceImpl();
    public static void main(String[] args) {
        User user1 = new User("Кирилл","Батаев", (byte) 23);
        User user2 = new User("Саня","Сущик", (byte) 24);
        User user3 = new User("Макавэё","Дайнеко", (byte) 21);
        User user4 = new User("Владислав","Расторцев", (byte) 18);
        User user5 = new User("Артемий","Бонохович", (byte) 39);

        //userService.createUsersTable();
        //userService.dropUsersTable();
//        userService.saveUser(user1.getName(),user1.getLastName(),user1.getAge());
//        userService.saveUser(user2.getName(),user2.getLastName(),user2.getAge());
//        userService.saveUser(user3.getName(),user3.getLastName(),user3.getAge());
//        userService.saveUser(user4.getName(),user4.getLastName(),user4.getAge());
//        userService.saveUser(user5.getName(),user5.getLastName(),user5.getAge());
//        userService.removeUserById(1);

//        for (User user : userService.getAllUsers()) {
//            System.out.println(user.toString());
//        }
//        userService.cleanUsersTable();

    }
}
