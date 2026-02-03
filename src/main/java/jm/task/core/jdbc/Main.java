package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Ivan", "Petrov", (byte) 15);
        userService.saveUser("Petr", "Ivanov", (byte) 16);
        userService.saveUser("Alexander", "Sidorov", (byte) 17);
        userService.saveUser("Ilya", "Pechkin", (byte) 18);
        userService.getAllUsers().stream().forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
