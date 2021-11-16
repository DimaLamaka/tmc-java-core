package by.lamaka.lesson4.task2;

import java.util.Arrays;

public class MyArray {
    public static int[] sort(int[] array) {
        return sortLogic(array);
    }

    public static int searchInNotSortedArray(int[] array, int key) {
        if (array.length == 0) {
            return -1;
        }
        return searchValueNotSortedArrayLogic(array, key);
    }

    public static int searchInSortedArray(int[] array, int key) {
        if (array.length == 0) {
            return -1;
        }
        return searchValueSortedArrayLogic(array, key);
    }

    public static int getMaxValue(int[] array) {
        if (array.length == 0) {
            return -1;
        }
        return findMaxValueLogic(array);
    }

    private static int[] sortLogic(int[] array) {
        int[] result = Arrays.copyOf(array, array.length);
        boolean isSorted = true;
        int temp = 0;
        while (isSorted) {
            isSorted = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    isSorted = true;
                }
            }
        }
        return array;
    }

    private static int searchValueSortedArrayLogic(int[] array, int key) {
        int resultIndex = -1;
        int firstIndex = 0;
        int lastIndex = array.length - 1;
        int midIndex = 0;

        while (firstIndex <= lastIndex) {
            midIndex = (lastIndex + firstIndex) / 2;

            if (array[midIndex] == key) {
                resultIndex = midIndex;
                return resultIndex;
            } else if (array[midIndex] > key) {
                lastIndex = midIndex - 1;
            } else if (array[midIndex] < key) {
                firstIndex = midIndex + 1;
            }
        }
        return resultIndex;
    }

    private static int searchValueNotSortedArrayLogic(int[] array, int key) {
        int resultIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                resultIndex = i;
                return resultIndex;
            }
        }
        return resultIndex;
    }

    private static int findMaxValueLogic(int[] array) {
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

}
