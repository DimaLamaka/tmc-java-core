package by.lamaka.lesson11;

public class Runner {
    public static void main(String[] args) {
        Store store = new Store();
        System.out.println("Store opened.. \n");
        Producer producer = new Producer("producer", store);
        Consumer consumer = new Consumer("consumer", store);

        producer.start();
        consumer.start();
        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            System.err.println(e);
        }
        System.out.println("\nStore closed...");

    }
}
