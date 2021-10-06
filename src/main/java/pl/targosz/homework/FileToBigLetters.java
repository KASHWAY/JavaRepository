package pl.targosz.homework;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileToBigLetters  {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/java/pl/targosz/homework/resources/data.txt");
        String text = Files.readString(Paths.get("src/main/java/pl/targosz/homework/resources/data.txt"));
        text = text.toUpperCase();
        Files.writeString(Paths.get("src/main/java/pl/targosz/homework/resources/output.txt"),text);
    }
}
