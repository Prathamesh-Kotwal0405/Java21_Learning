package com.prathamesh.day4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileScanner {
    public static void main(String[] args) throws FileNotFoundException {
        try(Scanner scanner = new Scanner(new File("C:\\Users\\1000071655\\IdeaProjects\\Java21_Learning\\src\\main\\java\\com\\prathamesh\\day4\\file.txt"))){
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
