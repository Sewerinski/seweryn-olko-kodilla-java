package com.kodilla.testing.forum.statistics;

public class StatisticsCalculate {
    Statistics statistics;

    private int usersNumber;
    private int postsNumber;
    private int commentsNumber;

    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPosts;

    public void calculateAdvStatistics(Statistics statistics) {
        this.usersNumber = statistics.usersNames().size();
        this.postsNumber = statistics.postsCount();
        this.commentsNumber = statistics.commentsCount();

        if(postsNumber != 0) {
            avgPostsPerUser = usersNumber / postsNumber;
        }else{
            avgPostsPerUser = 0;
        }

        if(commentsNumber != 0) {
            avgCommentsPerUser = usersNumber / commentsNumber;
        }else{
            avgCommentsPerUser = 0;
        }

        if(commentsNumber !=0) {
            avgCommentsPerPosts = postsNumber / commentsNumber;
        }else{
            avgCommentsPerPosts = 0;
        }

        //this.avgPostsPerUser = usersNumber / postsNumber;
        //this.avgCommentsPerUser = usersNumber / commentsNumber;
        //this.avgCommentsPerPosts = postsNumber / commentsNumber;
    }

    public int getUsersNumber() {
        return usersNumber;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public int getCommentsNumber() {
        return commentsNumber;
    }

    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPosts() {
        return avgCommentsPerPosts;
    }
}