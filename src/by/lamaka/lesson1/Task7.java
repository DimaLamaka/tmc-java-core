package by.lamaka.lesson1;

public class Task7 {
    /*Создайте переменную типа int и присвойте ей значение 127,
    преобразуйте ее к типу byte и выведите в консоль.
    Что произойдет если значение переменной будет 128?*/

    public static void main(String[] args) {
        int a = 127;
        byte b = (byte) a;//127

        System.out.println(b);

        b = (byte) 128;//-128

        System.out.println(b);
    }
}