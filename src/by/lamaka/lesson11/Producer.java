package by.lamaka.lesson11;

public class Producer extends Thread {
    private Store store;

    public Producer(String name, Store store) {
        super(name);
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                store.put(new Item("item" + i));
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
    }
}
