package by.lamaka.lesson4.task1;


public enum Month {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;

    public Seasons getSeasonByMonth() {
        switch (this) {
            case JUNE:
            case JULY:
            case AUGUST:
                return Seasons.SUMMER;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                return Seasons.AUTUMN;
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                return Seasons.WINTER;
            case MARCH:
            case APRIL:
            case MAY:
                return Seasons.SPRING;
            default:
                return Seasons.UNKNOWN;
        }
    }

    enum Seasons {
        WINTER, SPRING, SUMMER, AUTUMN, UNKNOWN
    }
}


