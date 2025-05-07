package com.prathamesh.day4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ReadFileRandomAccess {
    public static void main(String[] args) throws FileNotFoundException {
        try(RandomAccessFile file = new RandomAccessFile("C:\\Users\\1000071655\\IdeaProjects\\Java21_Learning\\src\\main\\java\\com\\prathamesh\\day4\\file.txt","r")){
            file.seek(10);
            String line  = file.readLine();
            System.out.println(line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
