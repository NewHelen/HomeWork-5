package dz2;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class Logic {

    private int n;
    private BlockingQueue<String> queueA;
    private BlockingQueue<String> queueB;
    private BlockingQueue<String> queueC;
    private BlockingQueue<String> queueD;

    public Logic(int n) {
        this.n = n;
        queueA = new LinkedBlockingQueue<>();
        queueB = new LinkedBlockingQueue<>();
        queueC = new LinkedBlockingQueue<>();
        queueD = new LinkedBlockingQueue<>();
    }

    public void fizz() throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                queueA.put("fizz: ділиться на 3 ");
            }
        }
    }

    public void buzz() throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0 && i % 3 != 0) {
                queueB.put("buzz: ділиться на 5 ");
            }
        }
    }

    public void fizzbuzz() throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                queueC.put("fizzbuzz: ділиться на 3 та 5 ");
            }
        }
    }

    public void number() throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            if ((i % 3 != 0 && i % 5 != 0) ) {
                System.out.println(i);
            } else {
                String result = null;
                if (i % 3 == 0 && i % 5 != 0) {
                    result = queueA.take();
                } else if (i % 5 == 0 && i % 3 != 0) {
                    result = queueB.take();
                } else if (i % 3 == 0 && i % 5 == 0) {
                    result = queueC.take();
                }
                queueD.put(result);
                System.out.println(queueD.take());
            }
        }
    }
}

