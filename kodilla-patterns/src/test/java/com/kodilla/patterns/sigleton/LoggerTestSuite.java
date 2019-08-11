package com.kodilla.patterns.sigleton;

import com.kodilla.patterns.singleton.Logger;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @AfterClass
    public static void firstLog() {
        Logger.getInstance().log("pierwsze logowanie");
    }

    @BeforeClass
    public static void secondLog() {
        Logger.getInstance().log("drugie logowanie");
        Logger.getInstance().log("trzecie logowanie");
    }

    @Test
    public void testGetLastLog() {
        //Given
        //When
        String lastLog = Logger.getInstance().getLastLog();
        System.out.println("Ostatnie logowanie: " + lastLog);
        //Then
        Assert.assertEquals("trzecie logowanie", lastLog);
    }
}
