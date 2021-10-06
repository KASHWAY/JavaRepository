package pl.targosz.homework;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileToBigLetters {
    public static void main(String[] args) throws IOException {
        String text = Files.readString(Paths.get("src/main/java/pl/targosz/homework/resources/data.txt")).toUpperCase();
        Files.writeString(Paths.get("src/main/java/pl/targosz/homework/resources/output.txt"), text);
    }
}
