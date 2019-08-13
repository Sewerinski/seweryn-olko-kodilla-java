package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Book book = new Book("Czarnoksiężnik z krainy Oz", "Jarzyna ze Szczecina",
                LocalDate.of(2002, 2, 28));

        Book book1 = new Book("Ojciec Chrzestny", "Capi di tutti capi",
                LocalDate.of(1999, 9, 19));
        Book book2 = new Book("Tygrys", "Jan P.",
                LocalDate.of(1997, 7, 22));

        Library library = new Library("Biblioteka");
        library.getBooks().add(book);
        library.getBooks().add(book1);
        library.getBooks().add(book2);

        //making a shallow copy of object library
        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("Biblioteka 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object library
        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library.deepCopy();
            deepCloneLibrary.setName("Biblioteka 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        //Then
        System.out.println(library);
        System.out.println(cloneLibrary);
        System.out.println(deepCloneLibrary);
        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, cloneLibrary.getBooks().size());
        Assert.assertEquals(3, deepCloneLibrary.getBooks().size());
        Assert.assertEquals(cloneLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepCloneLibrary.getBooks(), library.getBooks());

    }
}