package com.prathamesh.day4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileBufferedReader {
    public static void main(String[] args) throws FileNotFoundException {
        try(BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\1000071655\\IdeaProjects\\Java21_Learning\\src\\main\\java\\com\\prathamesh\\day4\\file.txt"))) {
            String line;
            while((line = reader.readLine()) !=null){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } ;

    }
}
