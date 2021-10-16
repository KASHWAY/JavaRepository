package pl.targosz.homework.Lesson9Task1;

import java.util.*;

public class MyHashMap<K, V> implements OwnMap<K, V> {
    private static final double LOAD_FACTOR = 0.75;
    private static final int INITIAL_CAPACITY = 4;

    private List<Entry<K, V>>[] table;
    private int size;
    private int threshold;

    private static class Entry<K, V> {
        private final K key;
        private V value;


        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public MyHashMap() {
        table = new List[INITIAL_CAPACITY];
        threshold = (int) (INITIAL_CAPACITY * LOAD_FACTOR);
    }

    private int hash(K key) {
        if (key == null) {
            return 0;
        }
        return Math.abs(key.hashCode() % table.length);
    }

    private void resize() {
        if (table.length == Integer.MAX_VALUE) ;

        List<Entry<K, V>>[] oldTable = table;
        table = new List[table.length * 2];
        threshold = (int) (table.length * LOAD_FACTOR);

        for (List<Entry<K, V>> bucket : oldTable) {
            if (bucket == null) {
                continue;
            }
            for (Entry<K, V> entry : bucket) {
                int hash = hash(entry.key);
                if (table[hash] == null) {
                    table[hash] = new LinkedList<>();
                }
                List<Entry<K, V>> newBucket = table[hash];
                newBucket.add(entry);
            }
        }
    }

    private Entry<K, V> getEntry(K key) {
        List<Entry<K, V>> bucket = table[hash(key)];
        if (bucket != null) {
            for (Entry<K, V> entry : bucket) {
                if ((key == null && entry.key == null) || Objects.equals(key, entry.key))
                    return entry;
            }
        }
        return null;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean put(K key, V value) {
        int hash = hash(key);
        if (table[hash] == null) {
            table[hash] = new LinkedList<>();
        }
        boolean keyExists = false;
        List<Entry<K, V>> bucket = table[hash];
        for (Entry<K, V> entry : bucket) {
            if (key.equals(entry.key)) {
                entry.value = value;
                keyExists = true;
                break;

            }
        }
        if (!keyExists) {
            bucket.add(new Entry<>(key, value));
            size++;
        }
        if (size == threshold) {
            resize();
        }
        return true;
    }

    @Override
    public boolean containsKey(K key) {
        return getEntry(key) != null;
    }


    @Override
    public boolean containsValue(Object value) {
        if (!isEmpty()) {
            for (List<Entry<K, V>> bucket : table) {
                if (bucket == null)
                    continue;

                for (Entry<K, V> entry : bucket) {
                    if (Objects.equals(value, entry.value))
                        return true;
                }
            }
        }
        return false;
    }

    @Override
    public V remove(K key) {
        List<Entry<K, V>> bucket = table[hash(key)];
        if (bucket == null)
            return null;

        Iterator<Entry<K, V>> bucketIterator = bucket.iterator();
        V oldValue = null;
        while (bucketIterator.hasNext()) {
            Entry<K, V> entry = bucketIterator.next();
            if (key.equals(entry.key)) {
                oldValue = entry.value;
                bucketIterator.remove();
                size--;
                break;
            }
            if (isEmpty())
                return null;
        }
        return oldValue;

    }

    @Override
    public V get(K key) {
        Entry<K, V> entry = getEntry(key);
        if (entry == null)
            return null;

        return entry.value;
    }
}
