package threadexamples.thread;

/**
 * Created by Artūrs Štrauss on Dec, 2018
 */
public class ThreadExampleImplementRunnable {
    public static void main(String[] args) throws InterruptedException {


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("We are now in: " + Thread.currentThread().getName());
                System.out.println("Current thread priority is: " + Thread.currentThread().getPriority());
                throw new RuntimeException("Internal Exception");
            }
        });

        thread.setName("New Worker Thread");
        thread.setPriority(Thread.MAX_PRIORITY);

        System.out.println("We are in thread: " + Thread.currentThread().getName() + " before starting a new thread!");
        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("A critical error happened in thread: " + t.getName() + " the error is " + e.getMessage());
            }
        });
        thread.start();
        System.out.println("We are in thread: " + Thread.currentThread().getName() + " after starting a new thread!");
    }
}
