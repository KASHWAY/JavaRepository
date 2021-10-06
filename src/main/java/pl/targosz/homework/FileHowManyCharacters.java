package pl.targosz.homework;

import java.io.File;

public class FileHowManyCharacters {
    public static void main(String[] args) {
        File file = new File("src/main/java/pl/targosz/homework/resources/data.txt");
        System.out.println(file.length());

    }
}
