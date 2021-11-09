package by.lamaka.lesson2;

import java.util.Scanner;

public class Task2 {
    /*Пользователь вводит название месяца.
    Вывести в консоль к какой поре года этот месяц относиться.
    Если пользователь допустил опечатку – вывести сообщение об ошибке.*/

    public static void main(String[] args) {
        checkSeason(userInput());
    }

    private static void checkSeason(String month) {
        switch (month.toLowerCase()) {
            case "december":
            case "january":
            case "february":
                System.out.println(month + " it is winter!!!");
                break;
            case "march":
            case "april":
            case "may":
                System.out.println(month + " it is spring!!!");
                break;
            case "june":
            case "july":
            case "august":
                System.out.println(month + " it is summer!!!");
                break;
            case "september":
            case "october":
            case "november":
                System.out.println(month + " it is autumn!!!");
                break;
            default:
                System.out.println(month + " \nError. Unknown season!!!");


        }
    }

    private static String userInput() {
        String result = "";
        Scanner scanner = new Scanner(System.in);

        result = scanner.nextLine();
        while (result.matches("[0-9]+")) {
            System.out.println("Напишите название месяца!!!");
            result = scanner.nextLine();
        }
        return result;
    }
}
