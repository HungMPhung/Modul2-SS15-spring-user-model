package com.codegym.dao;

import com.codegym.model.Login;
import com.codegym.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {

    private static List<User> users;

    static {
        users = new ArrayList<>();

        User u1 = new User();
        u1.setAccount("u1.codegym");
        u1.setPassword("12345");
        u1.setName("Tuan");
        u1.setEmail("u1.codegym@gamil.com");
        u1.setAge(18);
        users.add(u1);

        User u2 = new User();
        u2.setAccount("u2.codegym");
        u2.setPassword("12345");
        u2.setName("Vu");
        u2.setEmail("u2.codegym@gamil.com");
        u2.setAge(19);
        users.add(u2);
    }

    public static User checkLogin(Login login) {
        for (User u : users) {
            if (u.getAccount().equals(login.getAccount())
                    && u.getPassword().equals(login.getPassword())) {
                return u;
            }
        }
        return null;
    }
}
