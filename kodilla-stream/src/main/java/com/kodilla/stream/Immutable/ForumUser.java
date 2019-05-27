package com.kodilla.stream.Immutable;

public final class ForumUser {
    private String username;
    private String realname;

    public ForumUser(final String username, final String realname) {
        this.username = username;
        this.realname = realname;
    }

    public String getUsername() {
        return username;
    }

    public String getRealname() {
        return realname;
    }
}
