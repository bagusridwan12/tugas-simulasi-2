package restoran;

public class Waiter extends Thread {
    private final restoran.OrderQueue queue;

    public Waiter(restoran.OrderQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        String[] orders = {"Nasi Goreng", "Mie Ayam", "Ayam Bakar"};
        for (String order : orders) {
            queue.addOrder(order);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}