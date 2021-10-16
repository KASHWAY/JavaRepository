package pl.targosz.homework.Lesson8Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static String changeName(String newName, List<String> names) {

        for (int i = 0; i < names.size(); i++) {
            for (int j = 1; j < names.size(); j++) {
                if (i!=j&&names.get(i)==names.get(j)) {
                    names.set(i,newName);
                }
            }
        }
        return "This is your array : ";
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Anna");
        names.add("Katarzyna");
        names.add("Tymon");
        names.add("Tadeusz");
        names.add("Anna");
        names.add("Karolina");
        names.add("Dorota");
        names.add("Piotr");

        for (int i = 0; i < names.size(); i++) {
            for (int j = 1; j < names.size(); j++) {
                if (i != j && names.get(i) == names.get(j)) {
                    names.remove(j);

                }
            }

        }
        System.out.println(names);
        Collections.reverse(names);
        System.out.println("Your names list in reverse : " + names);

        names.add("Anna");

        System.out.println(changeName("Joanna",names));
        System.out.println(names);
    }
}
