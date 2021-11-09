package by.lamaka.lesson1;

public class Task5 {
    /*Задать число (от 0 до 9999) и вывести в консоль количество тысяч, сотен, десятков и единиц.*/

    public static void main(String[] args) {
        printNumberInNewFormat(1991);
    }

    public static void printNumberInNewFormat(int a) {
        int countOf1000 = a / 1000;
        int countOf100 = (a % 1000) / 100;
        int countOf10 = (a % 100) / 10;
        int countOf1 = a % 10;
        System.out.println("Число " + a + "\nКол-во тысяч : " + countOf1000 + "\nКол-во сотен : " + countOf100 +
                "\nКол-во десятков : " + countOf10 + "\nКол-во едениц : " + countOf1);

    }
}
