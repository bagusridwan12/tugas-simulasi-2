package restoran;

public class Main {
    public static void main(String[] args) {
        OrderQueue queue = new OrderQueue();

        Waiter waiter = new Waiter(queue);
        Chef chef = new Chef(queue);
        Cashier cashier = new Cashier();

        waiter.start();
        chef.start();
        cashier.start();
    }
}