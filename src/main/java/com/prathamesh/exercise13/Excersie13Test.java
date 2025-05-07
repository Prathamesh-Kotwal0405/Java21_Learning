package com.prathamesh.exercise13;

import java.util.ArrayList;
import java.util.List;

public class Excersie13Test {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        Book b1 = new Book(1,"Name1","Author1");
        Book b2 = new Book(2,"Name2","Author2");
        Book b3 = new Book(3,"Name3","Author3");
        Book b4 = new Book(4,"Name4","Author4");

        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(b4);

        Library lb = new Library("City Library",bookList);
        System.out.println("I have some library details as follows");
        System.out.println("Library name: " + lb.getLibraryName());
        System.out.println("Books: ");
        lb.getBookList().forEach(n -> System.out.println("Book id :"+n.getBookId() + "\nBook Name : "+n.getBookName() + "\nBook Author : "+n.getBookAuthor()));
    }
}
