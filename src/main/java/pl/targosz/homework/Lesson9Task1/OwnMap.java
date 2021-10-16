package pl.targosz.homework.Lesson9Task1;

public interface OwnMap {
    boolean put(String key, String value);
    boolean containsKey(String key);
    boolean containsValue(Object value);

    /**
     * @param key
     *  key for which (key, value) entry will be removed
     *
     * @return value for given key
     */
    String remove(String key);

    /**
     * Return value for given key
     */
    String get(String key);
}
