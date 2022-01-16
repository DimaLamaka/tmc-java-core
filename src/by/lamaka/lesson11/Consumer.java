package by.lamaka.lesson11;

public class Consumer extends Thread {
    private Store store;

    public Consumer(String name, Store store) {
        super(name);
        this.store = store;
    }

    @Override
    public void run() {
        while (store.isOpen()) {
            try {
                store.get();
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
    }
}
