package pl.targosz.homework.Lesson8Task2;

public class KashwayList implements OwnList {

    private Integer[] kashwayList;
    private int maximumCapacity;
    private int size;

    public KashwayList(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        kashwayList = new Integer[maximumCapacity];
        size = 0;
    }


    @Override
    public int size() {
        return kashwayList.length;
    }

    @Override
    public boolean isEmpty() {
        if (kashwayList.length == 0)
            return true;
        else
            return false;
    }

    @Override
    public void add(Integer element) {
        kashwayList[size] = element;
        size++;
    }

    @Override
    public Integer get(int i) {
        if (i < 0 || i >= size)
            throw new RuntimeException("Out of size.");

        return kashwayList[i];

    }

    @Override
    public void add(int index, Integer element) {
        if (index < 0 || index >= size)
            throw new RuntimeException("Out of size.");

        System.arraycopy(kashwayList, index, kashwayList, index + 1, size - index);
        kashwayList[index] = element;
        size++;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size)
            throw new RuntimeException("Out of size.");
        System.arraycopy(kashwayList, index++, kashwayList, index, size - index);
        size--;
    }

    @Override
    public String toString() {
        StringBuilder pieces = new StringBuilder();
        for (int i = 0; i < size; i++) {
            pieces.append(kashwayList[i].toString());
        }
        return pieces.toString();
    }
}
