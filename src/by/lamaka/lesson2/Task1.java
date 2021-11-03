package by.lamaka.lesson2;

import java.util.Scanner;

public class Task1 {
    /*Пользователь вводит английскую букву.
    Вывести в консоль – гласная эта буква или согласная.
    Выполнить это задание при помощи операторов if, а потом при помощи switch. Сравнить оба решения.*/
    //A, E, I, O, U гласные

    public static void main(String[] args) {
        checkConsonantOrVowelByIf(userInput());
        checkConsonantOrVowelBySwitch(userInput());
    }

    private static void checkConsonantOrVowelByIf(String ch) {
        if (ch.equalsIgnoreCase("a") || ch.equalsIgnoreCase("e") || ch.equalsIgnoreCase("i")) {
            System.out.println("Буква \"" + ch + "\" гласная");
        } else if (ch.equalsIgnoreCase("o") || ch.equalsIgnoreCase("u")) {
            System.out.println("Буква \"" + ch + "\" гласная");
        } else {
            System.out.println("Буква \"" + ch + "\" согласная");
        }
    }

    private static void checkConsonantOrVowelBySwitch(String ch) {
        switch (ch.toLowerCase()) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("Буква \"" + ch + "\" гласная");
                break;
            default:
                System.out.println("Буква \"" + ch + "\" согласная");
        }
    }

    private static String userInput() {
        String result = "";
        Scanner scanner = new Scanner(System.in);

        result = scanner.nextLine();
        while (!result.matches("[A-Za-z]")) {
            System.out.println("Ошибка. Введите одну английскую букву!!!");
            result = scanner.nextLine();
        }
        return result;
    }

}
