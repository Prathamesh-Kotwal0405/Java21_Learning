package com.prathamesh.exercise13;


import java.util.List;

public class Library {
    private String libraryName;
    List<Book> bookList;

    public Library(String libraryName, List<Book> bookList) {
        this.libraryName = libraryName;
        this.bookList = bookList;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }
}
