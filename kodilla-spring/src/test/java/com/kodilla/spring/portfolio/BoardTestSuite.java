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
        System.out.println(board.getToDoList().getTasks());
        System.out.println(board.getInProgressList().getTasks());
        System.out.println(board.getDoneList().getTasks());

        Assert.assertEquals("Odkurzanie podłogi w pokoju", board.getToDoList().getTasks().get(0));
        Assert.assertEquals("Zmywanie podłogi w pokoju", board.getToDoList().getTasks().get(1));
        Assert.assertEquals("Mycie okien", board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("Łyk piwa przed ciężką pracą", board.getDoneList().getTasks().get(0));

        Assert.assertEquals(2, board.getToDoList().getTasks().size());
        Assert.assertEquals(1, board.getInProgressList().getTasks().size());
        Assert.assertEquals(1, board.getDoneList().getTasks().size());
    }
}