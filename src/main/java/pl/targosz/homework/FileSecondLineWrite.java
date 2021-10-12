package pl.targosz.homework;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileSecondLineWrite {
    public static void main(String[] args) throws IOException {
        int n = 0;
        List<String> line = Files.readAllLines(Paths.get("src/main/java/pl/targosz/homework/resources/data.txt"));
        while (n < line.size()) {

            System.out.println(line.get(n));
            n += 2;
        }


    }
}
