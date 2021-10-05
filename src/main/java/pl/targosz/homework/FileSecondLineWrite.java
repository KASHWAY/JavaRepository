package pl.targosz.homework;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileSecondLineWrite {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\KURS JAVA\\Workspaceofficial\\JavaRepository\\src\\main\\java\\pl\\targosz\\homework\\resources\\data.txt");
        String text = Files.readString(Path.of("E:\\KURS JAVA\\Workspaceofficial\\JavaRepository\\src\\main\\java\\pl\\targosz\\homework\\resources\\data.txt"));


    }
}
