package lk.ijse;

public class Two extends Thread{
    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println("Two");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
