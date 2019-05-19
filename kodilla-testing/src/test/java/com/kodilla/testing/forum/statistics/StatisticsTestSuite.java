package com.kodilla.testing.forum.statistics;

import org.junit.*;

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
}