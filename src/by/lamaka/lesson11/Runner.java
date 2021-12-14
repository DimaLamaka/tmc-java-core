package by.lamaka.lesson11;

public class Runner {
    public static void main(String[] args) {
        Store store = new Store();
        System.out.println("Store opened.. \n");

        Producer producer = new Producer("producer", store);
        Consumer consumer = new Consumer("consumer", store);
        Thread closeStore = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                    store.setOpen(false);
                } catch (InterruptedException e) {
                    System.err.println(e);
                }
            }
        });

        producer.start();
        consumer.start();
        closeStore.start();

        try {
            producer.join();
            consumer.join();
            closeStore.join();
        } catch (InterruptedException e) {
            System.err.println(e);
        }
        System.out.println("\nStore closed...");

    }
}
