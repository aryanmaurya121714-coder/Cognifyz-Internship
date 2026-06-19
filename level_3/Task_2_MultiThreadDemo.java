class SharedPrinter {
    synchronized void printNumbers(String threadName) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " prints: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread extends Thread {
    SharedPrinter printer;
    String threadName;

    MyThread(SharedPrinter printer, String threadName) {
        this.printer = printer;
        this.threadName = threadName;
    }

    public void run() {
        printer.printNumbers(threadName);
    }
}

public class Task_2_MultiThreadDemo {
    public static void main(String[] args) {
        SharedPrinter printer = new SharedPrinter();

        MyThread t1 = new MyThread(printer, "Thread 1");
        MyThread t2 = new MyThread(printer, "Thread 2");
        MyThread t3 = new MyThread(printer, "Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}