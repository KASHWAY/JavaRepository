package pl.targosz.homework.Lesson8Task2;

public interface OwnList {

    int size();
    boolean isEmpty();
    void add(Integer element);
    Integer get(int i);
    void add(int index, Integer element);
    void remove(int index);
}