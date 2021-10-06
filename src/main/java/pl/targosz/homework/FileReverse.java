package pl.targosz.homework;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class FileReverse {
    public static void main(String[] args) throws IOException {
        String text = Files.readString(Paths.get("src/main/java/pl/targosz/homework/resources/data.txt"));
        StringBuilder stringbuilder = new StringBuilder(text);

        System.out.println(stringbuilder.reverse());
    }
}
