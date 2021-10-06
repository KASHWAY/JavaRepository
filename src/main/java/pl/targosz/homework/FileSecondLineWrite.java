package pl.targosz.homework;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class FileSecondLineWrite {
    public static void main(String[] args) throws IOException {
        Path file = Paths.get("src/main/java/pl/targosz/homework/resources/data.txt");
        double lineCounter = Files.lines(file).count();

            for (int n=0;n<lineCounter;n+=2) {
                String line = Files.readAllLines(Paths.get("src/main/java/pl/targosz/homework/resources/data.txt")).get(n);
                System.out.println(line);

            }

    }
}
