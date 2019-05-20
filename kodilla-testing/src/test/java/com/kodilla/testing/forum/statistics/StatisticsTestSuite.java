package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Tests are beginning");
    }
    @AfterClass
    public static void afterAllTests() {
        System.out.println("Tests are finished");
    }
    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test#" + testCounter);
    }

    @Test //1
    public void testPostNumberZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        int postsCount1 = 0;
        int commentsCount1 = 2;
        List<String> userNames1 = new LinkedList<>();
        for(int i=0;i<10;i++) {
            userNames1.add("user" + i);
        }

        when(statisticsMock.postsCount()).thenReturn(postsCount1);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount1);
        when(statisticsMock.usersNames()).thenReturn(userNames1);

        StatisticsCalculate statisticsCalculate = new StatisticsCalculate();

        //When
        statisticsCalculate.calculateAdvStatistics(statisticsMock);

        //Then
        int testingPosts = statisticsCalculate.getPostsNumber();
        int testingComments = statisticsCalculate.getCommentsNumber();
        int testingUser = statisticsCalculate.getUsersNumber();
        double avg1 = statisticsCalculate.getAvgPostsPerUser();
        double avg2 = statisticsCalculate.getAvgCommentsPerUser();
        double avg3 = statisticsCalculate.getAvgCommentsPerPosts();

        Assert.assertEquals(0, testingPosts);
        Assert.assertEquals(2, testingComments);
        Assert.assertEquals(10, testingUser);
        Assert.assertEquals(0, 0, avg1);
        Assert.assertEquals(5, 5, avg2);
        Assert.assertEquals(0, 0, avg3);
    }

    @Test //2
    public void testPostNumberThousand() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        int postsCount1 = 1000;
        int commentsCount1 = 50;
        List<String> userNames1 = new LinkedList<>();
        for(int i=0;i<10;i++) {
            userNames1.add("user" + i);
        }

        when(statisticsMock.postsCount()).thenReturn(postsCount1);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount1);
        when(statisticsMock.usersNames()).thenReturn(userNames1);

        StatisticsCalculate statisticsCalculate = new StatisticsCalculate();

        //When
        statisticsCalculate.calculateAdvStatistics(statisticsMock);

        //Then
        int testingPosts = statisticsCalculate.getPostsNumber();
        int testingComments = statisticsCalculate.getCommentsNumber();
        int testingUser = statisticsCalculate.getUsersNumber();
        double avg1 = statisticsCalculate.getAvgPostsPerUser();
        double avg2 = statisticsCalculate.getAvgCommentsPerUser();
        double avg3 = statisticsCalculate.getAvgCommentsPerPosts();

        Assert.assertEquals(1000, testingPosts);
        Assert.assertEquals(50, testingComments);
        Assert.assertEquals(10, testingUser);
        Assert.assertEquals(0.01, 0.01, avg1);
        Assert.assertEquals(0.5, 0.5, avg2);
        Assert.assertEquals(200, 200, avg3);
    }

    @Test //3
    public void testCommentsNumberZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        int postsCount1 = 100;
        int commentsCount1 = 0;
        List<String> userNames1 = new LinkedList<>();
        for(int i=0;i<10;i++) {
            userNames1.add("user" + i);
        }

        when(statisticsMock.postsCount()).thenReturn(postsCount1);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount1);
        when(statisticsMock.usersNames()).thenReturn(userNames1);

        StatisticsCalculate statisticsCalculate = new StatisticsCalculate();

        //When
        statisticsCalculate.calculateAdvStatistics(statisticsMock);

        //Then
        int testingPosts = statisticsCalculate.getPostsNumber();
        int testingComments = statisticsCalculate.getCommentsNumber();
        int testingUser = statisticsCalculate.getUsersNumber();
        double avg1 = statisticsCalculate.getAvgPostsPerUser();
        double avg2 = statisticsCalculate.getAvgCommentsPerUser();
        double avg3 = statisticsCalculate.getAvgCommentsPerPosts();

        Assert.assertEquals(100, testingPosts);
        Assert.assertEquals(0, testingComments);
        Assert.assertEquals(10, testingUser);
        Assert.assertEquals(0.1, 0.1, avg1);
        Assert.assertEquals(0, 0, avg2);
        Assert.assertEquals(0, 0, avg3);
    }

    @Test //4
    public void testMorePostsThanComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsCount1 = 100;
        int commentsCount1 = 50;
        List<String> userNames1 = new LinkedList<>();
        for(int i=0;i<10;i++) {
            userNames1.add("user" + i);
        }

        when(statisticsMock.postsCount()).thenReturn(postsCount1);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount1);
        when(statisticsMock.usersNames()).thenReturn(userNames1);
        StatisticsCalculate statisticsCalculate = new StatisticsCalculate();

        //When
        statisticsCalculate.calculateAdvStatistics(statisticsMock);

        //Then
        int testingPosts = statisticsCalculate.getPostsNumber();
        int testingComments = statisticsCalculate.getCommentsNumber();
        int testingUser = statisticsCalculate.getUsersNumber();
        double avg1 = statisticsCalculate.getAvgPostsPerUser();
        double avg2 = statisticsCalculate.getAvgCommentsPerUser();
        double avg3 = statisticsCalculate.getAvgCommentsPerPosts();

        Assert.assertEquals(true, testingComments < testingPosts);
        Assert.assertEquals(10, testingUser);
        Assert.assertEquals(0.1, 0.1, avg1);
        Assert.assertEquals(0.2, 0.2, avg2);
        Assert.assertEquals(2, 2, avg3);
    }

    @Test //5
    public void testMoreCommentsThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsCount1 = 50;
        int commentsCount1 = 100;
        List<String> userNames1 = new LinkedList<>();
        for(int i=0;i<10;i++) {
            userNames1.add("user" + i);
        }

        when(statisticsMock.postsCount()).thenReturn(postsCount1);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount1);
        when(statisticsMock.usersNames()).thenReturn(userNames1);
        StatisticsCalculate statisticsCalculate = new StatisticsCalculate();

        //When
        statisticsCalculate.calculateAdvStatistics(statisticsMock);

        //Then
        int testingPosts = statisticsCalculate.getPostsNumber();
        int testingComments = statisticsCalculate.getCommentsNumber();
        int testingUser = statisticsCalculate.getUsersNumber();
        double avg1 = statisticsCalculate.getAvgPostsPerUser();
        double avg2 = statisticsCalculate.getAvgCommentsPerUser();
        double avg3 = statisticsCalculate.getAvgCommentsPerPosts();

        Assert.assertEquals(true, testingComments > testingPosts);
        Assert.assertEquals(10, testingUser);
        Assert.assertEquals(0.2, 0.2, avg1);
        Assert.assertEquals(0.1, 0.1, avg2);
        Assert.assertEquals(0.5, 0.5, avg3);
    }

    @Test //6
    public void testUsersNumberZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsCount1 = 50;
        int commentsCount1 = 100;
        List<String> userNames1 = new LinkedList<>();
        //userNames1.add("Tomek");
        //userNames1.add("Jasiek");

        when(statisticsMock.postsCount()).thenReturn(postsCount1);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount1);
        when(statisticsMock.usersNames()).thenReturn(userNames1);
        StatisticsCalculate statisticsCalculate = new StatisticsCalculate();

        //When
        statisticsCalculate.calculateAdvStatistics(statisticsMock);

        //Then
        int testingPosts = statisticsCalculate.getPostsNumber();
        int testingComments = statisticsCalculate.getCommentsNumber();
        int testingUser = statisticsCalculate.getUsersNumber();
        double avg1 = statisticsCalculate.getAvgPostsPerUser();
        double avg2 = statisticsCalculate.getAvgCommentsPerUser();
        double avg3 = statisticsCalculate.getAvgCommentsPerPosts();

        Assert.assertEquals(0, testingUser);
        Assert.assertEquals(50, testingPosts);
        Assert.assertEquals(100, testingComments);
        Assert.assertEquals(0, 0, avg1);
        Assert.assertEquals(0, 0, avg2);
        Assert.assertEquals(0.5, 0.5, avg3);
    }

    @Test //7
    public void testUsersNumberThousand() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsCount1 = 50;
        int commentsCount1 = 100;
        List<String> userNames1 = new LinkedList<>();
        for(int i=0;i<1000;i++) {
            userNames1.add("user" + i);
        }

        when(statisticsMock.postsCount()).thenReturn(postsCount1);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount1);
        when(statisticsMock.usersNames()).thenReturn(userNames1);
        StatisticsCalculate statisticsCalculate = new StatisticsCalculate();

        //When
        statisticsCalculate.calculateAdvStatistics(statisticsMock);

        //Then
        int testingPosts = statisticsCalculate.getPostsNumber();
        int testingComments = statisticsCalculate.getCommentsNumber();
        int testingUser = statisticsCalculate.getUsersNumber();
        double avg1 = statisticsCalculate.getAvgPostsPerUser();
        double avg2 = statisticsCalculate.getAvgCommentsPerUser();
        double avg3 = statisticsCalculate.getAvgCommentsPerPosts();

        Assert.assertEquals(1000, testingUser);
        Assert.assertEquals(50, testingPosts);
        Assert.assertEquals(100, testingComments);
        Assert.assertEquals(200, 200, avg1);
        Assert.assertEquals(10, 10, avg2);
        Assert.assertEquals(0.5, 0.5, avg3);
    }
}