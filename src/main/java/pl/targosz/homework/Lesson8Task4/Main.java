package pl.targosz.homework.Lesson8Task4;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Hubert", "Targosz", 2005, 1.95, 82);
        Person person2 = new Person("Mateusz", "Marczak", 2000, 1.60, 40);
        Person person3 = new Person("Mateusz", "Pater", 2000, 1.90, 80);

        Set<Person> listPerson = new HashSet<Person>();
        listPerson.add(person1);
        listPerson.add(person2);
        listPerson.add(person3);

        System.out.println("From youngest to oldest : ");
        for (Person person : listPerson) {
            System.out.println(person.toString());
        }

        Set<Person> people3 = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Double.compare(o1.getWeight(), o2.getWeight());
            }
        });
        people3.addAll(listPerson);
        System.out.println("From the heaviest to the lightest : ");
        for (Person person : people3) {
            System.out.println(person.toString());
    }
        Set<Person> people2 = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Double.compare(o1.getHeight(),o2.getHeight());
            }
        });
        people2.addAll(listPerson);

        System.out.println("From the shortest to the tallest");
        for (Person person : people2) {
            System.out.println(person.toString());
        }


}
}
