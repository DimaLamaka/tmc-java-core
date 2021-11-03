package by.lamaka.lesson2;

import java.util.Arrays;
import java.util.Random;

public class Task5 {
    /*В массиве чисел найти наименьшее и наибольшее.*/

    public static void main(String[] args) {
        int[] arr = new int[10];
        initArray(arr);

        System.out.println(Arrays.toString(arr));
        findMaxAndMinValue(arr);
    }

    private static void findMaxAndMinValue(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Max value : " + max + "\nMin value : " + min);
    }

    private static void initArray(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100) - 50;
        }
    }
}
