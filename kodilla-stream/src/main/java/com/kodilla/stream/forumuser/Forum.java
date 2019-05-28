package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(001, "Porucznik Borewicz", 'M', 1990,2,13, 13));
        userList.add(new ForumUser(002, "Antonina Kuczyńska", 'F', 2001,6,1, 101));
        userList.add(new ForumUser(003, "Grzegorz Mitnik", 'M', 1997,6,3, 90));
        userList.add(new ForumUser(004, "Bonifacy Filemoński", 'M', 1988,12,11, 21));
        userList.add(new ForumUser(005, "Czupakabra", 'M', 1991,5,18, 330));
        userList.add(new ForumUser(006, "Haker", 'M', 1990,3,1, 0));
        userList.add(new ForumUser(007, "Melania89", 'F', 2002,5,30, 3));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}