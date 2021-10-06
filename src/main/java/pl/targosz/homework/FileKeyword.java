package pl.targosz.homework;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;


public class FileKeyword {
    public static void main(String[] args) throws IOException {
        String contains = Files.readString(Paths.get("src/main/java/pl/targosz/homework/resources/data.txt"));
        System.out.println(contains.contains("Kurs"));
    }
}
