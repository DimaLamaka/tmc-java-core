package by.lamaka.lesson7.entity;

import java.util.PriorityQueue;
import java.util.Queue;

public class MyDB {
    private Queue<String> strings;

    public MyDB() {
        strings = new PriorityQueue<>();
    }

    public MyDB(Queue<String> strings) {
        this.strings = strings;
    }

    public Queue<String> getStrings() {
        return strings;
    }

    public void setStrings(Queue<String> strings) {
        this.strings = strings;
    }

}
