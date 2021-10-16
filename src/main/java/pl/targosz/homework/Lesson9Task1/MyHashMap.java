package pl.targosz.homework.Lesson9Task1;

public class MyHashMap implements OwnMap {

    @Override
    public boolean put(String key, String value) {
        return false;
    }

    @Override
    public boolean containsKey(String key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public String remove(String key) {
        return null;
    }

    @Override
    public String get(String key) {
        return null;
    }
}
