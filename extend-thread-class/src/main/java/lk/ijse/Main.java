package lk.ijse;

public class Main {
    public static void main(String[] args) {
        One obj1 = new One();
        Two obj2 = new Two();

        obj1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        obj2.start();
    }
}