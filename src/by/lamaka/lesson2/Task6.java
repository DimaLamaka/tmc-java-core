package by.lamaka.lesson2;

import java.util.Arrays;
import java.util.Random;

public class Task6 {
    /*Дан массив из пяти элементов.
    При помощи цикла получить отсортированный массив в порядке возрастания элементов.*/

    public static void main(String[] args) {
        int[] arr = new int[5];
        initArray(arr);
        System.out.println("Array " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Bubble sort" + Arrays.toString(arr));

        int[] arr2 = new int[5];
        initArray(arr2);
        System.out.println("Array " + Arrays.toString(arr2));
        selectionSort(arr2);
        System.out.println("Selection sort " + Arrays.toString(arr2));

    }

    private static void initArray(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100) - 50;
        }
    }

    private static void bubbleSort(int[] arr) {
        int temp = 0;
        boolean isOk = true;
        while (isOk) {
            isOk = false;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] > arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    isOk = true;
                }
            }
        }
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = 0;
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }

    }
}
