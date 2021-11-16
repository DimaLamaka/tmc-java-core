package by.lamaka.lesson4.task1;


public class TestSeason {
    /*Переписать задачу о сезонах на enum реализацию (switch)*/

    public static void main(String[] args) {
        System.out.println(Month.APRIL.getSeasonByMonth());
        System.out.println(Month.JULY.getSeasonByMonth());
        System.out.println(Month.OCTOBER.getSeasonByMonth());
        System.out.println(Month.JANUARY.getSeasonByMonth());

    }
}
