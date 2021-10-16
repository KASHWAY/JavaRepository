package pl.targosz.homework;

import java.util.Arrays;

public class BubbleSort<T extends Comparable<? super T>> {
    T[] bubbleArray;

    BubbleSort(T[] bubbleArray) {
        this.bubbleArray = bubbleArray;
    }

    private T[] bubbleSort() {
        for (int i = bubbleArray.length; i > 1; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (bubbleArray[j].compareTo(bubbleArray[j + 1]) > 0) {
                    swapElements(j, bubbleArray);
                }
            }
        }
        return bubbleArray;
    }

    private void swapElements(int index, T[] bubbleArray) {
        T temp = bubbleArray[index];
        bubbleArray[index] = bubbleArray[index + 1];
        bubbleArray[index + 1] = temp;
    }

    public static void main(String[] args) {
        Integer[] integerArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        BubbleSort<Integer> bubbleSort = new BubbleSort<Integer>(integerArray);
        Integer[] sortedArray = bubbleSort.bubbleSort();
        System.out.println("Your sorted integer array : " + Arrays.toString(sortedArray));

        String[] stringArray = {"Hubert", "Targosz", "Mateusz", "Pater", "Mateusz", "Marczak"};
        BubbleSort<String> bubbleSort2 = new BubbleSort<String>(stringArray);
        String[] sortedArray2 = bubbleSort2.bubbleSort();
        System.out.println("Your sorted string array : " + Arrays.toString(sortedArray2));

    }
}
