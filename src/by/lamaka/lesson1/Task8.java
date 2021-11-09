package by.lamaka.lesson1;

public class Task8 {
    /*Создайте переменную типа int (int i = 10) и выведите в консоль значение I / 0.
    Что произойдет? Измениться ли вывод если переменная будет типа float?*/

    public static void main(String[] args) {
        int i = 10;

        System.out.println(i / 0);//ArithmeticException

        float f = i;

        System.out.println(f / 0);//Infinity
    }
}