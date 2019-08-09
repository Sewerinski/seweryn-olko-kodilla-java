package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.getToDoList().getTasks().add("Odkurzanie podłogi w pokoju");
        board.getToDoList().getTasks().add("Zmywanie podłogi w pokoju");
        board.getInProgressList().getTasks().add("Mycie okien");
        board.getDoneList().getTasks().add("Łyk piwa przed ciężką pracą");
        //When&Then
        Assert.assertEquals("Zmywanie podłogi w pokoju", board.getToDoList().getTasks().get(1));
    }
}
