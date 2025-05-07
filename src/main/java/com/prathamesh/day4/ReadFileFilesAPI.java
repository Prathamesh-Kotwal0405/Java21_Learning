package com.prathamesh.day4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFileFilesAPI {
    public static void main(String[] args) {
        try{
            List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\1000071655\\IdeaProjects\\Java21_Learning\\src\\main\\java\\com\\prathamesh\\day4\\file.txt"));
            lines.forEach(n -> System.out.println(n));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
