package com.prathamesh.day4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileInputStream {
    public static void main(String[] args) throws FileNotFoundException {
        try(FileInputStream fi = new FileInputStream("C:\\Users\\1000071655\\IdeaProjects\\Java21_Learning\\src\\main\\java\\com\\prathamesh\\day4\\file.txt")){
            int content;
            while((content=fi.read())!=-1){
                System.out.print((char) content);
            }
        }catch (IOException e) { e.printStackTrace(); }
    }
}
