package com.kodilla.patterns.strategy.social;

public class User {

    String name;
    protected SocialPublisher socialPublisher;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String sharedPost() {
        return socialPublisher.share();
    }

    public void set(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
