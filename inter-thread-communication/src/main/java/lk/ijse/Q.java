package lk.ijse;

public class Q {
    int num;

    boolean flag = false;

    public synchronized void put(int num) {
        while (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Putting " + num);
        this.num = num;
        flag = true;
        notify();
    }

    public synchronized void get() {
        while (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Getting " + num);
        flag = false;
        notify();
    }
}
