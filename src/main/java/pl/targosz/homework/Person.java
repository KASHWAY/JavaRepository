package pl.targosz.homework;

import java.util.Objects;

public class Person {
    private String name,surname;
    private int age,height;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && height == person.height && Objects.equals(name, person.name) && Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, height);
    }

    public Person(String name, String surname, int age, int height) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
    }
}
