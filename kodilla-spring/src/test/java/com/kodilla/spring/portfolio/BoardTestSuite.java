package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        List<String> toDo = board.getToDoList().getTasks();
        List<String> inProgress = board.getInProgressList().getTasks();
        List<String> done = board.getDoneList().getTasks();

        toDo.add("Odkurzanie podłogi w pokoju");
        toDo.add("Zmywanie podłogi w pokoju");
        inProgress.add("Mycie okien");
        done.add("Łyk piwa przed ciężką pracą");

        //When&Then
        Assert.assertEquals("Odkurzanie podłogi w pokoju", toDo.get(0));
        Assert.assertEquals("Zmywanie podłogi w pokoju", toDo.get(1));
        Assert.assertEquals("Mycie okien", inProgress.get(0));
        Assert.assertEquals("Łyk piwa przed ciężką pracą", done.get(0));

        Assert.assertEquals(2, toDo.size());
        Assert.assertEquals(1, inProgress.size());
        Assert.assertEquals(1, done.size());
    }
}