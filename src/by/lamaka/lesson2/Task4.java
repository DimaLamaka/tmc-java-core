package by.lamaka.lesson2;

import java.util.Scanner;

public class Task4 {
    /*Пользователь вводит два числа.
     Найти сумму всех чисел расположенных между ними и которые делятся на 3.*/

    public static void main(String[] args) {
        int a = userInput();
        int b = userInput();
        sumBetweenNumbsAndDivBy3(a, b);
    }

    private static void sumBetweenNumbsAndDivBy3(int a, int b) {
        if (a == b) {
            System.out.println("Сумма чисел между " + a + " и " + b + " равна 0");
            return;
        }
        int sum = 0;
        for (int i = Math.min(a, b) + 1; i < Math.max(a, b); i++) {
            if (i % 3 == 0 && i != 0) {
                sum += i;
            }
        }
        System.out.println("Сумма чисел между " + a + " и " + b + " равна " + sum);
    }

    private static int userInput() {
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        result = scanner.nextInt();
        return result;
    }
}
