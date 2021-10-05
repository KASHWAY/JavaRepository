package pl.targosz.homework.TextFormatter;

public class ToBigLetters implements TextFormatter {
    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}
