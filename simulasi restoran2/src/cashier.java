package restoran;

public class Cashier extends Thread {

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Kasir memproses pembayaran");
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}