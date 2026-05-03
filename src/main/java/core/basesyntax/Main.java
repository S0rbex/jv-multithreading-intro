package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new ThreadOne();
        ThreadSecond threadRunnable = new ThreadSecond();
        Thread thread2 = new Thread(threadRunnable);
        thread1.start();
        thread2.setDaemon(true);
        thread2.start();
    }

    static class ThreadOne extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 21; i++) {
                System.out.println(i);
            }
        }
    }

    static class ThreadSecond implements Runnable {
        @Override
        public void run() {
            while (true) {
                System.out.println("I am the daemon thread!");
            }
        }
    }
}
