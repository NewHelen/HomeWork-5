package dz1;

public class Notifier implements Runnable{

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(5000); // Чекаємо 5 секунд
                System.out.println("Минуло 5 секунд");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
