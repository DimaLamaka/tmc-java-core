package by.lamaka.lesson4.task2;


import java.util.Arrays;

public class TestMyArray {
    /*Создать класс для работы с  массивами чисел. Создать методы для сортировки,
    нахождения максимального элемента, поиска номера элемента в массиве по
    его значению (любое вхождение). Всю общую логику вынести в приватные методы.*/

    public static void main(String[] args) {
        int[] array = {1, -1, 0, 6, 19, 242, -2536, 23, 77};
        System.out.println(Arrays.toString(array));
        System.out.println("Поиск в не сортированном массиве: " + MyArray.searchInNotSortedArray(array, 19));
        System.out.println("Максимальное число: " + MyArray.getMaxValue(array));

        int[] sortedArray = MyArray.sort(array);
        System.out.println("Сортированный массив: " + Arrays.toString(sortedArray));
        System.out.println("Поиск в сортированном массиве: " + MyArray.searchInSortedArray(sortedArray, 77));
        System.out.println("Максимальное число: " + MyArray.getMaxValue(array));


    }
}
