package pl.targosz.homework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateDataFile {
    public static void main(String[] args) throws IOException {
        try {
            File myObj = new File("src/main/java/pl/targosz/homework/resources/data.txt");

            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());

            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        FileWriter writer = new FileWriter("src/main/java/pl/targosz/homework/resources/data.txt");
        writer.write("Kurs\n" +
                "Java\n" +
                "Lekcja 6\n" +
                "Pliki\n" +
                "Wyjątki\n" +
                "Pliki\n" +
                "Koniec pliku");
        writer.close();
    }
}
