package lk.ijse;

public class Producer implements Runnable{
    Q q;

    public Producer(Q q) {
        this.q = q;
        new Thread(this).start();
    }

    @Override
    public void run() {
        int j = 0;
        while (true) {
            q.put(j++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
