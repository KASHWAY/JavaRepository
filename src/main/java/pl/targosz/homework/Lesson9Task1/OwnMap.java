package pl.targosz.homework.Lesson9Task1;

public interface OwnMap<K, V> {
    boolean put(K key, V value);

    boolean containsKey(K key);

    boolean containsValue(V value);

    /**
     * @param key key for which (key, value) entry will be removed
     * @return value for given key
     */
    V remove(K key);

    /**
     * Return value for given key
     */
    V get(K key);
}
