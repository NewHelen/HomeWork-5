package dz1;

public class Time implements Runnable{

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();

        while (true) {
            long difference = System.currentTimeMillis() - startTime;
            System.out.println("час, що минув від моменту запуску програми: " + difference / 1000 + " секунд");
            try {
                Thread.sleep(1000); // Чекаємо 1 секунду
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
