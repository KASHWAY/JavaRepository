package pl.targosz.homework.TextFormatter;

public class ToSmallLetters implements TextFormatter{
    @Override
    public String formatText(String text) {
        return text.toLowerCase();
    }
}
