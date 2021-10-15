package pl.targosz.homework.Lesson8Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Anna");
        names.add("Katarzyna");
        names.add("Tymon");
        names.add("Tadeusz");
        names.add("Karolina");
        names.add("Dorota");
        names.add("Piotr");
        System.out.println(names);
        Collections.reverse(names);
        System.out.println("Your names list in reverse : " + names);
        names.set(6,"Joanna");
        System.out.println(names);
    }
}
