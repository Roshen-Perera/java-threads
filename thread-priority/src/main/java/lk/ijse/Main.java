package lk.ijse;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("One"+Thread.currentThread().getName()+":"+i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Two");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });


        t2.setPriority(10);
        //System.out.println("Thread Name: "+t1.getName());
        t1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //System.out.println("Thread One Status : " + t1.isAlive());

        //System.out.println("Thread Name: "+t2.getName());
        t2.start();

        t1.join();
        t2.join();

        //System.out.println("Thread Two Status : " + t2.isAlive());
    }
}