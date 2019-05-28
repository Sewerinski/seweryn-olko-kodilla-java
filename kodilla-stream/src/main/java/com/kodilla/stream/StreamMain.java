package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();
        Map<Integer, ForumUser> theMap = theForum.getUserList().stream()
                .filter(ForumUser -> ForumUser.getSex() == 'M')
                .filter(b -> b.getBirthDate().getYear() <= 1999)
                .filter(c -> c.getPublishedPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserID, ForumUser -> ForumUser));
        System.out.println("# Users: " + theMap.size());
        theMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}