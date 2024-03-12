package dz1;

public class Main {
    public static void main(String[] args) {
        Time time = new Time();
        Notifier notifier = new Notifier();

        Thread timeThread = new Thread(time);
        Thread notifierThread = new Thread(notifier);

        timeThread.start();
        notifierThread.start();
    }
}
