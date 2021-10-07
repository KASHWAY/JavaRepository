package pl.targosz.homework;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReading {
    public static void main(String[] args) throws IOException {
        String text = Files.readString(Path.of("src/main/java/pl/targosz/homework/resources/data.txt"));
        System.out.println(text);
    }
}
