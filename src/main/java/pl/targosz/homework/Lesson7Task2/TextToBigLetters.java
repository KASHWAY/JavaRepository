package pl.targosz.homework.Lesson7Task2;

public class TextToBigLetters {
    public static String textToUpperCase(String text) {

        return text == null ? "" : text.toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(textToUpperCase("blablacar"));
    }
}
