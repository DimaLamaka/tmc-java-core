package by.lamaka.lesson11;

public class Consumer extends Thread {
    private Store store;

    public Consumer(String name, Store store) {
        super(name);
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                store.get();
                Thread.sleep(800);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
    }
}
