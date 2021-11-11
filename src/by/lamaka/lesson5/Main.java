package by.lamaka.lesson5;

public class Main {
    public static void main(String[] args) {
        Employee worker = new Worker("Ivan", "Ivanov", POSTS.WORKER, 2);
        Employee worker1 = new Worker("Egor", "Egorov", POSTS.WORKER, 1);
        Employee worker2 = new Worker("Petya", "Petrov", POSTS.WORKER, 2.5);
        Employee director = new Director("Ira", "Sidorova", POSTS.DIRECTOR, 4);

        System.out.println(worker.toString());
        System.out.println(worker1.toString());
        System.out.println(worker2.toString());
        System.out.println(director.toString());

        if (director instanceof Director) {
            ((Director) director).addWorker(worker);
            ((Director) director).addWorker(worker);
        }
        System.out.println(director.toString());

        Employee director1 = new Director("Jenya", "Mir", POSTS.DIRECTOR, 5.5);
        if (director1 instanceof Director) {
            ((Director) director1).addWorker(worker2);
        }
        System.out.println(director1.toString());

        if (director instanceof Director) {
            ((Director) director).addWorker(director1);
        }
        System.out.println(director.toString());


    }
}
