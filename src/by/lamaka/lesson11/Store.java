package by.lamaka.lesson11;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Store {
    private List<Item> items;
    private Lock lock;
    private Condition condition;
    private boolean isOpen;

    public Store() {
        lock = new ReentrantLock();
        items = new LinkedList<>();
        condition = lock.newCondition();
        isOpen = true;
    }

    public void put(Item item) throws InterruptedException {
        lock.lock();
        while (items.size() >= 10) {
            System.out.println(Thread.currentThread().getName() + " wait...");
            condition.await(100, TimeUnit.MILLISECONDS);
        }

        System.out.println("User put " + item);
        items.add(item);
        System.out.println("Items size is " + items.size());

        condition.signalAll();
        lock.unlock();
    }

    public void get() throws InterruptedException {
        lock.lock();
        while (items.isEmpty()) {
            System.out.println(Thread.currentThread().getName() + " wait...");
            condition.await(100,TimeUnit.MILLISECONDS);
        }

        Item item = items.get(0);
        System.out.println("User get " + item);
        items.remove(item);
        System.out.println("Items size is " + items.size());

        condition.signalAll();
        lock.unlock();
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}
