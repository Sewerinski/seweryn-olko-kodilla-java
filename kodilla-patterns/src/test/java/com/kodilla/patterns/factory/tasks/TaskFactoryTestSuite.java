package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals("Yes", shoppingTask.executeTask());
        Assert.assertEquals("Shopping", shoppingTask.getTaskName());
    }

    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals("No", paintingTask.executeTask());
        Assert.assertEquals("Painting", paintingTask.getTaskName());
    }

    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals("Yes", drivingTask.executeTask());
        Assert.assertEquals("Driving", drivingTask.getTaskName());
    }
}
