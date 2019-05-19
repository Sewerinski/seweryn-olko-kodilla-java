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
        when(statisticsMock.postsCount()).thenReturn(postsCount1);
        StatisticsCalculate statisticsCalculate = new StatisticsCalculate();
        statisticsCalculate.calculateAdvStatistics(statisticsMock);

        //When
        int testingPosts = statisticsCalculate.getPostsNumber();

        //Then
        Assert.assertEquals(0, testingPosts);
    }

    @Test //2
    public void testPostNumberThousand() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsCount1 = 1000;
        when(statisticsMock.postsCount()).thenReturn(postsCount1);
        StatisticsCalculate statisticsCalculate = new StatisticsCalculate();
        statisticsCalculate.calculateAdvStatistics(statisticsMock);

        //When
        int testingPosts = statisticsCalculate.getPostsNumber();

        //Then
        Assert.assertEquals(1000, testingPosts);
    }

    @Test //3
    public void testCommentsNumberZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int commentsCount1 = 0;
        when(statisticsMock.commentsCount()).thenReturn(commentsCount1);
        StatisticsCalculate statisticsCalculate = new StatisticsCalculate();
        statisticsCalculate.calculateAdvStatistics(statisticsMock);

        //When
        int testingComments = statisticsCalculate.getCommentsNumber();

        //Then
        Assert.assertEquals(0, testingComments);
    }

    @Test //4
    public void testMorePostsThanComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsCount1 = 100;
        int commentsCount1 = 50;
        when(statisticsMock.postsCount()).thenReturn(postsCount1);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount1);
        StatisticsCalculate statisticsCalculate = new StatisticsCalculate();
        statisticsCalculate.calculateAdvStatistics(statisticsMock);

        //When
        int testingPosts = statisticsCalculate.getPostsNumber();
        int testingComments = statisticsCalculate.getCommentsNumber();

        //Then
        Assert.assertEquals(true, testingComments<testingPosts);
    }

    @Test //5
    public void testMoreCommentsThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsCount1 = 30;
        int commentsCount1 = 50;
        when(statisticsMock.postsCount()).thenReturn(postsCount1);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount1);
        StatisticsCalculate statisticsCalculate = new StatisticsCalculate();
        statisticsCalculate.calculateAdvStatistics(statisticsMock);

        //When
        int testingPosts = statisticsCalculate.getPostsNumber();
        int testingComments = statisticsCalculate.getCommentsNumber();

        //Then
        Assert.assertEquals(true, testingComments>testingPosts);
    }

    @Test //6
    public void testUsersNumberZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames1 = new LinkedList<>();
        //userNames1.add("Tomek");
        //userNames1.add("Jasiek");
        when(statisticsMock.usersNames()).thenReturn(userNames1);
        StatisticsCalculate statisticsCalculate = new StatisticsCalculate();
        statisticsCalculate.calculateAdvStatistics(statisticsMock);

        //When
        int testingUser = statisticsCalculate.getUsersNumber();

        //Then
        Assert.assertEquals(0, testingUser);
    }

    @Test //7
    public void testUsersNumberThousand() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames1 = new LinkedList<>();
        for(int i=0;i<1000;i++) {
            userNames1.add("user" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(userNames1);
        StatisticsCalculate statisticsCalculate = new StatisticsCalculate();
        statisticsCalculate.calculateAdvStatistics(statisticsMock);

        //When
        int testingUser = statisticsCalculate.getUsersNumber();

        //Then
        Assert.assertEquals(1000, testingUser);
    }
}