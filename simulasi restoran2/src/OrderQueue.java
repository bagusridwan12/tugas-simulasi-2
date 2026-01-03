package restoran;

import java.util.LinkedList;
import java.util.Queue;

public class OrderQueue {
    private final Queue<String> orders = new LinkedList<>();

    public synchronized void addOrder(String order) {
        orders.add(order);
        System.out.println("Pelayan menerima pesanan: " + order);
        notifyAll();
    }

    public synchronized String takeOrder() throws InterruptedException {
        while (orders.isEmpty()) {
            wait();
        }
        return orders.poll();
    }
}