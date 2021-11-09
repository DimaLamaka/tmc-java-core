package by.lamaka.lesson2;

import java.util.Scanner;

public class Task3 {
    /*Пользователь вводит слово в консоль,
    если это слово “exit” – программа завершается, при других  - печатает ввод пользователя обратно
    в консоль и предлагает ввести следующее слово.*/

    public static void main(String[] args) {
        userInput();
    }

    private static void userInput() {
        String result = "";
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Введите слово :");
            result = scanner.nextLine();
            System.out.println(result);
        } while (!result.equalsIgnoreCase("exit"));
        System.out.println("Вы ввели \"exit\" - программа завершается ");

    }
}