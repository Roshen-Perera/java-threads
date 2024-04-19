package lk.ijse;

public class Main {
    public static void main(String[] args) {
        //Creates and instance of Runnable
        MyRunnable myRunnable = new MyRunnable();

        //Creates a thread object, passing the instance of MyRunnable to its constructor
        Thread thread = new Thread(myRunnable);

        //Start the thread
        thread.start();
    }
}