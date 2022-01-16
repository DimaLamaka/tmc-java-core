package by.lamaka.lesson11;

import java.util.Random;

public class Producer extends Thread {
    private Store store;

    public Producer(String name, Store store) {
        super(name);
        this.store = store;
    }

    @Override
    public void run() {
        while (store.isOpen()) {
            try {
                store.put(new Item("item" + new Random().nextInt(50)));
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
    }
}
