package by.lamaka.lesson1;

public class Task4 {
    /*Напишите программу, которая проверяет делится ли одно число на второе без остатка.
    В случает если деление не целочисленное, то вывести в консоль сообщение о целой части и об остатке от деления.*/

    public static void main(String[] args) {
        checkExactDivision(5, 2);
        checkExactDivision(4, 2);
    }

    public static void checkExactDivision(int a, int b) {
        if (a % b == 0) {
            System.out.println(a + " / " + b + " = " + (a / b));
        } else {
            System.out.println(a + " / " + b + " = " + (a / b) + " Остаток от деления : " + (a % b));
        }
    }
}