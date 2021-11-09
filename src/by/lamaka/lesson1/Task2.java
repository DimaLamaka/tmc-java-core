package by.lamaka.lesson1;

public class Task2 {
   /* Создайте переменные для каждого примитивного типа, подумайте об ограничениях по наименованию переменных.
    Создайте две переменные типа int и попробуйте поделить одно на другое, результат какого типа получится в результате?
    Что будет если делитель будет нулевым? Как не потерять точность при делении (числа после запятой)?*/

    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        int i = 235435;
        long l = 5353L;

        double d = 141.4;
        float f = 12f;

        char c1 = '!';
        char c2 = 12;

        boolean boo = true;

        int i1 = 20;
        int i2 = 30;
        int i3 = i1 / i2;// 0
        int i4 = i1 / 0;//ArithmeticException

        double i5 = i2 / (double) i1;//1.5


    }
}