package restoran;

public class Chef extends Thread {
    private final OrderQueue queue;

    public Chef(OrderQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String order = queue.takeOrder();
                System.out.println("Koki memasak: " + order);
                Thread.sleep(2000);
                System.out.println("Koki selesai memasak: " + order);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}