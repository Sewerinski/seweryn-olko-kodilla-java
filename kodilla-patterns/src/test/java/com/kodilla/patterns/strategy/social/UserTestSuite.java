package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.TwitterPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User george = new Millenials("George Carington");
        User mietek = new YGeneration("Mietek Mietkowski");
        User roberto = new ZGeneration("Roberto Capri");

        //When
        String georgePosts = george.sharedPost();
        System.out.println("George posts: " + georgePosts);
        String mietekPosts = mietek.sharedPost();
        System.out.println("Mietek posts: " + mietekPosts);
        String robertoPosts = roberto.sharedPost();
        System.out.println("Roberto posts: " + robertoPosts);

        //Then
        Assert.assertEquals("Facebook", georgePosts);
        Assert.assertEquals("Twitter", mietekPosts);
        Assert.assertEquals("Snapchat", robertoPosts);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User george = new Millenials("George Carington");

        //When
        String georgePosts = george.sharedPost();
        System.out.println("George posts: " + georgePosts);
        george.set(new TwitterPublisher());
        georgePosts = george.sharedPost();
        System.out.println("George now posts: " + georgePosts);

        //Then
        Assert.assertEquals("Twitter", georgePosts);
    }
}
