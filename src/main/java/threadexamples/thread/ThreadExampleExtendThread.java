package threadexamples.thread;

/**
 * Created by Artūrs Štrauss on Dec, 2018
 */
public class ThreadExampleExtendThread {
    public static void main(String[] args) {
        Thread thread = new NewThread();

        thread.start();
    }

    private static class NewThread extends Thread {
        @Override
        public void run() {

            // Code that executes on the new thread
            System.out.println("Hello form " + this.getName());
        }
    }
}
