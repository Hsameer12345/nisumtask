package part5;

public class Threading {

    public static void main(String[] args) throws InterruptedException ,Exception {
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int n = 3; n <= 5; n++) {
                System.out.println(Thread.currentThread().getName() + " is running.\n Total threads = "+Thread.activeCount());

            }
        });
        t1.start();
     //   System.out.println("Asynchronous");

        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int n = 3; n <= 5; n++) {
                System.out.println(Thread.currentThread().getName() + " is running.\n Total threads = "+Thread.activeCount());

            }
        });
      t2.start();
        Thread t3 = new Thread(() -> {

            for (int n = 3; n <= 5; n++) {
                System.out.println(Thread.currentThread().getName() + " is running.\n Total threads = "+Thread.activeCount());

            }
        });
        t3.start();
    }

    }

