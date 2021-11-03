package by.lamaka.lesson1;

public class Task3 {
    /*Напишите программу, которая сравнивает два числа и пишет в консоль какое из этих чисел больше или меньше*/

    public static void main(String[] args) {
        equalsTwoNumbers(1, -5);
        equalsTwoNumbers(0, 1);
        equalsTwoNumbers(1, 1);
    }

    public static void equalsTwoNumbers(int a, int b) {
        if (a > b) {
            System.out.println(a + " больше " + b);
        } else if (a == b) {
            System.out.println("Числа " + a + " и " + b + " равны");
        } else {
            System.out.println(b + " больше " + a);
        }
    }
}